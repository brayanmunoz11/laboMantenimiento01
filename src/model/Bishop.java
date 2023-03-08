package model;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Bishop extends ChessGamePiece{

    public Bishop( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }
   
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northEastMoves = calculateNorthEastMoves( board, 8 );
        ArrayList<String> northWestMoves = calculateNorthWestMoves( board, 8 );
        ArrayList<String> southEastMoves = calculateSouthEastMoves( board, 8 );
        ArrayList<String> southWestMoves = calculateSouthWestMoves( board, 8 );
        ArrayList<String> allMoves = new ArrayList<>();
        allMoves.addAll( northEastMoves );
        allMoves.addAll( northWestMoves );
        allMoves.addAll( southEastMoves );
        allMoves.addAll( southWestMoves );
        return allMoves;
    }
   
    @Override
    public ImageIcon createImageByPieceType(){
        switch (getColorOfPiece()) {
            case ChessGamePiece.WHITE:
                return new ImageIcon(
                        getClass().getResource("chessImages/WhiteBishop.gif")
                );
            case ChessGamePiece.BLACK:
                return new ImageIcon(
                        getClass().getResource("chessImages/BlackBishop.gif")
                );
            default:
                return new ImageIcon(
                        getClass().getResource("chessImages/BlackBishop.gif")
                );
        }
    }
}
