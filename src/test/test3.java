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
import java.util.logging.Logger;

public class test3 {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    @Test
    public void testViewBoardSquare(){
        
        LOGGER.info("TEST BOARD SQUARE");

        ChessGameBoard board = new ChessGameBoard(); 

        Bishop  bishop = new Bishop( board, 0, 0, 0 );

        Boolean not_fail = false;

        BoardSquare square = null;

        
        try{
            square = new BoardSquare(0, 0, bishop);
            LOGGER.info(""+square);
            not_fail = true;
        }catch (Exception e){
            LOGGER.info("Err ,"+ e);
        }
    
        Assertions.assertNotNull(square);
        Assertions.assertTrue(not_fail);; 
    }

    @Test
    public void testViewGameLog(){
        
        LOGGER.info("TEST GAME LOG");

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
        
        LOGGER.info("TEST GRAVE YARD");

        ChessGraveyard graveyard = new ChessGraveyard("CHESS TITAN");

        LOGGER.info(""+graveyard);
        Assertions.assertNotNull(graveyard);
        
    }

    @Test
    public void testViewMenuBar(){
        
        LOGGER.info("TEST MENU BAR");

        ChessMenuBar menu = new ChessMenuBar();

        LOGGER.info(""+menu);
        Assertions.assertNotNull(menu);
        
    }


    @Test
    public void testViewMenuPanel(){
        
        LOGGER.info("TEST MENU PANEL");

        ChessPanel panel = new ChessPanel();

        LOGGER.info(""+panel);
        Assertions.assertNotNull(panel);
        
    }

 
    
    
}
