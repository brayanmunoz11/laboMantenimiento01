package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import model.Bishop;
import model.ChessGameBoard;
import view.BoardSquare;
import view.ChessGameLog;
import view.ChessGraveyard;
import view.ChessMenuBar;
import view.ChessPanel;

public class test3 {

    @Test
    public void testViewBoardSquare(){
        
        System.out.println("TEST BOARD SQUARE");

        ChessGameBoard board = new ChessGameBoard(); 

        Bishop  bishop = new Bishop( board, 0, 0, 0 );

        Boolean not_fail = false;

        BoardSquare square = null;

        
        try{
            square = new BoardSquare(0, 0, bishop);
            System.out.println(square);
            not_fail = true;
        }catch (Exception e){
            System.out.println("Err ,"+ e);
        }
       
    
        Assertions.assertNotNull(square);
        Assertions.assertTrue(not_fail);; 
    }

    @Test
    public void testViewGameLog(){
        
        System.out.println("TEST GAME LOG");

        ChessGameLog LOG = new ChessGameLog();

        LOG.addToLog("MOVE ROOK");

        String log_rock = LOG.getLastLog();

        LOG.addToLog("MOVE QUEEN");

        String log_queen = LOG.getLastLog();

        Assertions.assertNotNull(LOG);
        Assertions.assertNotEquals(log_rock, log_queen);
    }

    @Test
    public void testViewGraveYard(){
        
        System.out.println("TEST GRAVE YARD");

        ChessGraveyard graveyard = new ChessGraveyard("CHESS TITAN");

        System.out.println(graveyard);
        Assertions.assertNotNull(graveyard);
        
    }

    @Test
    public void testViewMenuBar(){
        
        System.out.println("TEST MENU BAR");

        ChessMenuBar menu = new ChessMenuBar();

        System.out.println(menu);
        Assertions.assertNotNull(menu);
        
    }


    @Test
    public void testViewMenuPanel(){
        
        System.out.println("TEST MENU PANEL");

        ChessPanel panel = new ChessPanel();

        System.out.println(panel);
        Assertions.assertNotNull(panel);
        
    }

 
    
    
}
