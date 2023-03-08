package model;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class King
    extends ChessGamePiece{
    
    public King( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color, false );
    }

    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northEastMoves = calculateNorthEastMoves( board, 1 );
        ArrayList<String> northWestMoves = calculateNorthWestMoves( board, 1 );
        ArrayList<String> southEastMoves = calculateSouthEastMoves( board, 1 );
        ArrayList<String> southWestMoves = calculateSouthWestMoves( board, 1 );
        ArrayList<String> northMoves = calculateNorthMoves( board, 1 );
        ArrayList<String> southMoves = calculateSouthMoves( board, 1 );
        ArrayList<String> eastMoves = calculateEastMoves( board, 1 );
        ArrayList<String> westMoves = calculateWestMoves( board, 1 );
        ArrayList<String> allMoves = new ArrayList<>();
        allMoves.addAll( northEastMoves );
        allMoves.addAll( northWestMoves );
        allMoves.addAll( southWestMoves );
        allMoves.addAll( southEastMoves );
        allMoves.addAll( northMoves );
        allMoves.addAll( southMoves );
        allMoves.addAll( westMoves );
        allMoves.addAll( eastMoves );
        return allMoves;
    }
   
    public boolean isChecked( ChessGameBoard board ){
        return !getCurrentAttackers( board ).isEmpty();
    }

    @Override
    public ImageIcon createImageByPieceType(){
        switch (getColorOfPiece()) {
            case ChessGamePiece.WHITE:
                return new ImageIcon(
                        getClass().getResource("chessImages/WhiteKing.gif")
                );
            case ChessGamePiece.BLACK:
                return new ImageIcon(
                        getClass().getResource("chessImages/BlackKing.gif" )
                );
            default:
                return new ImageIcon(
                        getClass().getResource("chessImages/default-Unassigned.gif" )
                );            
        }
    }
}
