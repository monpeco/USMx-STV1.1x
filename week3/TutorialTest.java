package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testjunit01.Tutorial;


public class TutorialTest {
    
    @Test
    public void testSecondContructorAttrIntNegative(){
        try{

            new Tutorial(-1, "value");
            fail("Should have thrown an exception when first parameter is negative");

        } catch (IllegalArgumentException e){

            assertEquals("First parameter must be greater than 0 and less than 5", e.getLocalizedMessage());
    
        } catch (Exception e2){

            fail("Caught exception but it is not IllegalArgumentException as expected, "  + e2.getLocalizedMessage());

        }

    }
    
    @Test
    public void testSecondContructorAttrStrNull(){
        try{

            new Tutorial(2,"");
            fail("Should have throw an exception when the second parameter is null or blank");

        } catch (IllegalArgumentException e){

            assertEquals("Second parameter cannot be neither null or empty string", e.getLocalizedMessage());

        } catch (Exception e2){

            fail("Exception throw but is not IllegalArgumentException as expected");

        }

    }
    
    @Test
    public void testConcatLoopMax(){

        Tutorial tutorial = new Tutorial(5, "va");
        assertEquals("va va va va va ", tutorial.concatLoop());

    }
    
    @Test
    public void testConcatLoopAttInt(){
        Tutorial tutorial = new Tutorial(2, "num");
        tutorial.concatLoop();
        assertEquals(2, tutorial.getAttInt());
    }
    
    @Test
    public void testConcatLoopAttStr(){
        Tutorial tutorial = new Tutorial(2, "num");
        tutorial.concatLoop();
        assertEquals("num", tutorial.getAttStr());
    }
}
