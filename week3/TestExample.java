package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testjunit01.TestJUnit01;

public class TestExample {
    @Test
    public void testCheckValidityInvalid() {
        TestJUnit01 ex = new TestJUnit01();    // creates an instance of class Example
        String result = ex.checkValidity(0);    // calls checkValidity with value 0
                                                // and saves returned value in String result
        assertEquals("invalid", result);    // checks that result has the value "invalid"
    }
}