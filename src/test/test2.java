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

public class test2 {

    @Test
    public void testModelBishop(){
        
        System.out.println("TEST BISHOP");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Bishop( board, 0, 0, 0 );
        System.out.println("BISHOP BLACK "+ pieceToAddBlack.getColorOfPiece());

        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Bishop( board, 0, 0, 1 );
        System.out.println("BISHOP WHITE " + pieceToAddWhite.getColorOfPiece());


        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }


    @Test
    public void testModelKing(){
        
        System.out.println("TEST KING");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new King( board, 0, 0, 0 );
        System.out.println("KING BLACK "+ pieceToAddBlack.getColorOfPiece());
        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new King( board, 0, 0, 1 );
        System.out.println("KING WHITE " + pieceToAddWhite.getColorOfPiece());
        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelRock(){
        
        System.out.println("TEST KNIGHT");
        ChessGamePiece pieceToAddBlack;
        ChessGameBoard board = new ChessGameBoard(); 
        pieceToAddBlack = new Knight( board, 0, 0, 0 );
        System.out.println("KING  KNIGHT"+ pieceToAddBlack.getColorOfPiece());
        ChessGamePiece pieceToAddWhite;
        pieceToAddWhite = new Knight( board, 0, 0, 1 );
        System.out.println("KING KNIGHT " + pieceToAddWhite.getColorOfPiece());
        Assertions.assertNotEquals(pieceToAddWhite.getColorOfPiece(), pieceToAddBlack.getColorOfPiece()); 
    }

    @Test
    public void testModelCheessGameBoard(){
        System.out.println("TEST CHESS GAME BOARD");
        ChessGameBoard boardOne = new ChessGameBoard();
        ChessGameBoard boardTwo = new ChessGameBoard();
        boardOne.setAlignmentX(3);
        boardTwo.setAlignmentX(3);
        System.out.println("Compare setAlignmentX correct ");
        Assertions.assertEquals(boardOne.getAlignmentX(), boardOne.getAlignmentX()); 
    }


    @Test
    public void testModelCheessGamePiece(){
        System.out.println("TEST CHESS GAME PIECE");
        
        ChessGamePiece gamePiece;

        ChessGameBoard board = new ChessGameBoard(); 

        gamePiece = new King( board, 0, 0, 0 );

        Assertions.assertEquals(gamePiece.getRow(), gamePiece.getColumn());

        
    }
    
}
