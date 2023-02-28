package view;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ChessGamePiece;

public class BoardSquare
    extends JPanel{
    private int            row;
    private int            col;
    private ChessGamePiece piece;
    private JLabel         imageLabel;
 
    public BoardSquare( int row, int col, ChessGamePiece piece ){
        super();
        this.row = row;
        this.col = col;
        this.piece = piece;
        updateImage();
    }

    private void updateImage(){
        if ( imageLabel != null ){
            removeAll();
        }
        if ( piece != null ){
            imageLabel = new JLabel();
            imageLabel.setIcon( piece.getImage() );
            add( imageLabel );     
        }
        revalidate(); 

    }
    
    public int getRow(){
        return row;
    }
   
    public int getColumn(){
        return col;
    }
    
    public ChessGamePiece getPieceOnSquare(){
        return piece;
    }
   
    public void setPieceOnSquare( ChessGamePiece p ){
        piece = p;
        updateImage();
    }
   
    public void clearSquare(){
        piece = null;
        removeAll();
    }
}
