package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import model.Bishop;
import model.ChessGameBoard;
import model.ChessGamePiece;
import model.King;
import model.Knight;
import model.Pawn;
import model.Queen;
import model.Rook;

import java.util.logging.Logger;

public class testtomodelunit {

     private static Logger logger = Logger.getLogger("InfoLogging");

    @Test
    public void testModelRook(){
        
        logger.info("TEST ROOK");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Rook( board, 0, 0, 0 );
        logger.info("ROOK BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        logger.info("ROOK WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelQueen(){
        
        logger.info("TEST QUEEN");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Queen( board, 0, 0, 0 );
        logger.info("QUEEN BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        logger.info("QUEEN WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelPawn(){
        
        logger.info("TEST PAWN");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Pawn( board, 0, 0, 0 );
        logger.info("PAWN BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        logger.info("PAWN WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelBishop(){
        
        logger.info("TEST BISHOP");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Bishop( board, 0, 0, 0 );
        logger.info("BISHOP BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        logger.info("BISHOP WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }


    @Test
    public void testModelKing(){
        
        logger.info("TEST KING");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new King( board, 0, 0, 0 );
        logger.info("KING BLACK "+ pieceToAddBlack.getColorOfPiece());
        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new King( board, 0, 0, 1 );
        logger.info("KING WHITE " + pieceToAddWhite.getColorOfPiece());
        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelRock(){
        
        logger.info("TEST KNIGHT");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Knight( board, 0, 0, 0 );
        logger.info("KNIGHT  BLACK"+ pieceToAddBlack.getColorOfPiece());
        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Knight( board, 0, 0, 1 );
        logger.info("KNIGHT WHITE " + pieceToAddWhite.getColorOfPiece());
        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelCheessGameBoard(){
        logger.info("TEST CHESS GAME BOARD");
        ChessGameBoard boardOne = new ChessGameBoard();
        ChessGameBoard boardTwo = new ChessGameBoard();
        boardOne.setAlignmentX(3);
        boardTwo.setAlignmentX(3);
        logger.info("Compare setAlignmentX correct ");
        Assertions.assertEquals(boardOne.getAlignmentX(), boardOne.getAlignmentX()); 
    }


    @Test
    public void testModelCheessGamePiece(){
        logger.info("TEST CHESS GAME PIECE");
        
        ChessGamePiece gamePiece;

        ChessGameBoard board = new ChessGameBoard(); 

        gamePiece = new King( board, 0, 0, 0 );

        Assertions.assertEquals(gamePiece.getRow(), gamePiece.getColumn());

        
    }
    
}
