package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import controller.ChessMain;
import java.util.logging.Logger;

public class testToController {

    private static Logger logger = Logger.getLogger("InfoLogging");

    @Test
    public void testcontroller(){
        logger.info("TEST MAIN");
        boolean notFail = false;
        try {
            ChessMain.main(null);
            notFail = true;
        } catch (Exception e){
            logger.info("err: "+ e);
            notFail = false;
        }
        Assertions.assertTrue(notFail);
    }
    
}
