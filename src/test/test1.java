package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import controller.ChessMain;
import java.util.logging.Logger;

public class test1 {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    @Test
    public void testcontroller(){
        LOGGER.info("TEST MAIN");
        boolean notFail = false;
        try {
            ChessMain.main(null);
            notFail = true;
        } catch (Exception e){
            LOGGER.info("err: "+ e);
            notFail = false;
        }
        Assertions.assertTrue(notFail);
    }
    
}
