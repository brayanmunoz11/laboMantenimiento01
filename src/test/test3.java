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

    private static Logger logger = Logger.getLogger("InfoLogging");

    @Test
    public void testViewBoardSquare(){
        
        logger.info("TEST BOARD SQUARE");

        ChessGameBoard board = new ChessGameBoard(); 

        Bishop  bishop = new Bishop( board, 0, 0, 0 );

        Boolean not_fail = false;

        BoardSquare square = null;

        
        try{
            square = new BoardSquare(0, 0, bishop);
            logger.info(square.toString());
            not_fail = true;
        }catch (Exception e){
            logger.info("Err ,"+ e);
        }
    
        Assertions.assertNotNull(square);
        Assertions.assertTrue(not_fail);; 
    }

    @Test
    public void testViewGameLog(){
        
        logger.info("TEST GAME LOG");

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
        
        logger.info("TEST GRAVE YARD");

        ChessGraveyard graveyard = new ChessGraveyard("CHESS TITAN");

        logger.info(graveyard.toString());
        Assertions.assertNotNull(graveyard);
        
    }

    @Test
    public void testViewMenuBar(){
        
        logger.info("TEST MENU BAR");

        ChessMenuBar menu = new ChessMenuBar();

        logger.info(menu.toString());
        Assertions.assertNotNull(menu);
        
    }


    @Test
    public void testViewMenuPanel(){
        
        logger.info("TEST MENU PANEL");

        ChessPanel panel = new ChessPanel();

        logger.info(panel.toString());
        Assertions.assertNotNull(panel);
        
    }

    
}
