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
}
