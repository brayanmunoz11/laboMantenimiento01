package model;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JPanel;

import view.BoardSquare;
import view.ChessPanel;

import java.awt.GridLayout;

public final class ChessGameBoard extends JPanel{
    private BoardSquare[][] chessCells;
    private final BoardListener   listener;

    public BoardSquare[][] getCells(){
        return chessCells;
    }

    private boolean validateCoordinates( int row, int col ){
        return chessCells.length > 0 && chessCells[0].length > 0 &&
            row < chessCells.length && col < chessCells[0].length
            && row >= 0 && col >= 0;
    }
    
    public BoardSquare getCell( int row, int col ){
        if ( validateCoordinates( row, col ) ){
            return chessCells[row][col];
        }
        return null;
    }
   
    public void clearCell(int row, int col){
        if ( validateCoordinates( row, col ) ){
            chessCells[row][col].clearSquare();
        }
        else
        {
            throw new IllegalStateException( "Row " + row + " and column" +
            		" " + col + " are invalid, or the board has not been" +
            				"initialized. This square cannot be cleared." );
        }
    }
    
    public ArrayList<ChessGamePiece> getAllWhitePieces(){
        ArrayList<ChessGamePiece> whitePieces = new ArrayList<>();
        for ( int i = 0; i < 8; i++ ){
            for ( int j = 0; j < 8; j++ ){
                if ( chessCells[i][j].getPieceOnSquare() != null
                    && chessCells[i][j].getPieceOnSquare().getColorOfPiece() ==
                        ChessGamePiece.WHITE ){
                    whitePieces.add( chessCells[i][j].getPieceOnSquare() );
                }
            }
        }
        return whitePieces;
    }
    
    public ArrayList<ChessGamePiece> getAllBlackPieces(){
        ArrayList<ChessGamePiece> blackPieces = new ArrayList<>();
        for ( int i = 0; i < 8; i++ ){
            for ( int j = 0; j < 8; j++ ){
                if ( chessCells[i][j].getPieceOnSquare() != null
                    && chessCells[i][j].getPieceOnSquare().getColorOfPiece() ==
                        ChessGamePiece.BLACK ){
                    blackPieces.add( chessCells[i][j].getPieceOnSquare() );
                }
            }
        }
        return blackPieces;
    }
    
    public ChessGameBoard(){
        this.setLayout( new GridLayout( 8, 8, 1, 1 ) );
        listener = new BoardListener();
        chessCells = new BoardSquare[8][8];
        initializeBoard();
    }
   
    public void resetBoard ( boolean addAfterReset ){
        chessCells = new BoardSquare[8][8];
        this.removeAll();
        if ( getParent() instanceof ChessPanel ){
            ( (ChessPanel)getParent() ).getGraveyard( 1 ).clearGraveyard();
            ( (ChessPanel)getParent() ).getGraveyard( 2 ).clearGraveyard();
            ( (ChessPanel)getParent() ).getGameLog().clearLog();
        }
        for ( int i = 0; i < chessCells.length; i++ ){
            for ( int j = 0; j < chessCells[0].length; j++ ){
                chessCells[i][j] = new BoardSquare( i, j, null );
                if ( ( i + j ) % 2 == 0 ){
                    chessCells[i][j].setBackground( Color.WHITE );
                }
                else
                {
                    chessCells[i][j].setBackground( Color.BLACK );
                }
                if ( addAfterReset ){
                    chessCells[i][j].addMouseListener( listener );
                    this.add( chessCells[i][j] );
                }
            }
        }
        repaint();

    }
   
    public void initializeBoard(){
        resetBoard( false );
        for ( int i = 0; i < chessCells.length; i++ ){
            for ( int j = 0; j < chessCells[0].length; j++ ){
                ChessGamePiece pieceToAdd;
                switch (i) {
                // black pawns
                    case 1:
                        pieceToAdd = new Pawn( this, i, j, ChessGamePiece.BLACK );
                        break;
                // white pawns
                    case 6:
                        pieceToAdd = new Pawn( this, i, j, ChessGamePiece.WHITE );
                        break;
                // main rows
                    case 0:
                    case 7:
                        int colNum =
                                i == 0 ? ChessGamePiece.BLACK : ChessGamePiece.WHITE;
                    switch (j) {
                        case 0:
                        case 7:
                            pieceToAdd = new Rook( this, i, j, colNum );
                            break;
                        case 1:
                        case 6:
                            pieceToAdd = new Knight( this, i, j, colNum );
                            break;
                        case 2:
                        case 5:
                            pieceToAdd = new Bishop( this, i, j, colNum );
                            break;
                        case 3:
                            pieceToAdd = new King( this, i, j, colNum );
                            break;
                        default:
                            pieceToAdd = new Queen( this, i, j, colNum );
                            break;
                    }
break;

                    default:
                        pieceToAdd = null;
                        break;
                }
                chessCells[i][j] = new BoardSquare( i, j, pieceToAdd );
                if ( ( i + j ) % 2 == 0 ){
                    chessCells[i][j].setBackground( Color.WHITE );
                }
                else
                {
                    chessCells[i][j].setBackground( Color.BLACK );
                }
                chessCells[i][j].addMouseListener( listener );
                this.add( chessCells[i][j] );
            }
        }
    }
   
    public void clearColorsOnBoard(){
        for ( int i = 0; i < chessCells.length; i++ ){
            for ( int j = 0; j < chessCells[0].length; j++ ){
                if ( ( i + j ) % 2 == 0 ){
                    chessCells[i][j].setBackground( Color.WHITE );
                }
                else
                {
                    chessCells[i][j].setBackground( Color.BLACK );
                }
            }
        }
    }
    
    private class BoardListener
        implements MouseListener
    {
        
        @Override
        public void mouseClicked( MouseEvent e ){
            if ( e.getButton() == MouseEvent.BUTTON1 &&
                getParent() instanceof ChessPanel ){
                ( (ChessPanel)getParent() ).getGameEngine()
                    .determineActionFromSquareClick( e );
            }
        }
       
        @Override
        public void mouseEntered( MouseEvent e ){ /* not used */
        }
        
        @Override
        public void mouseExited( MouseEvent e ){ /* not used */
        }
       
        @Override
        public void mousePressed( MouseEvent e ){ /* not used */
        }
   
        @Override
        public void mouseReleased( MouseEvent e ){ /* not used */
        }
    }
}
