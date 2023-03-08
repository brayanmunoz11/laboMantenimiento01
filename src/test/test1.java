package test;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import controller.ChessMain;

public class test1 {

    @Test
    public void testcontroller(){
        
        System.out.println("TEST MAIN");
        boolean notFail = false;
        try {
            ChessMain.main(null);
            notFail = true;
        } catch (Exception e){
            System.out.println("err: "+ e);
            notFail = false;
        }
        Assertions.assertTrue(notFail);
    }
    
}
