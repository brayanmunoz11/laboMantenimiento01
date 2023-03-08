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

public class test2 {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    @Test
    public void testModelRook(){
        
        LOGGER.info("TEST ROOK");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Rook( board, 0, 0, 0 );
        LOGGER.info("BISHOP BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        LOGGER.info("BISHOP WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelQueen(){
        
        LOGGER.info("TEST QUEEN");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Queen( board, 0, 0, 0 );
        LOGGER.info("BISHOP BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        LOGGER.info("BISHOP WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelPawn(){
        
        LOGGER.info("TEST PAWN");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Pawn( board, 0, 0, 0 );
        LOGGER.info("BISHOP BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        LOGGER.info("BISHOP WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelBishop(){
        
        LOGGER.info("TEST BISHOP");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Bishop( board, 0, 0, 0 );
        LOGGER.info("BISHOP BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        LOGGER.info("BISHOP WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }


    @Test
    public void testModelKing(){
        
        LOGGER.info("TEST KING");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new King( board, 0, 0, 0 );
        LOGGER.info("KING BLACK "+ pieceToAddBlack.getColorOfPiece());
        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new King( board, 0, 0, 1 );
        LOGGER.info("KING WHITE " + pieceToAddWhite.getColorOfPiece());
        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelRock(){
        
        LOGGER.info("TEST KNIGHT");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Knight( board, 0, 0, 0 );
        LOGGER.info("KING  KNIGHT"+ pieceToAddBlack.getColorOfPiece());
        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Knight( board, 0, 0, 1 );
        LOGGER.info("KING KNIGHT " + pieceToAddWhite.getColorOfPiece());
        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelCheessGameBoard(){
        LOGGER.info("TEST CHESS GAME BOARD");
        ChessGameBoard boardOne = new ChessGameBoard();
        ChessGameBoard boardTwo = new ChessGameBoard();
        boardOne.setAlignmentX(3);
        boardTwo.setAlignmentX(3);
        LOGGER.info("Compare setAlignmentX correct ");
        Assertions.assertEquals(boardOne.getAlignmentX(), boardOne.getAlignmentX()); 
    }


    @Test
    public void testModelCheessGamePiece(){
        LOGGER.info("TEST CHESS GAME PIECE");
        
        ChessGamePiece gamePiece;

        ChessGameBoard board = new ChessGameBoard(); 

        gamePiece = new King( board, 0, 0, 0 );

        Assertions.assertEquals(gamePiece.getRow(), gamePiece.getColumn());

        
    }
    
}
