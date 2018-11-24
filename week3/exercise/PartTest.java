/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import test.Part;
/**
 *
 * @author M
 */
public class PartTest {
    
    @Test
    public void testConstructorTypeArgumentInvalid(){
        try{
            new Part('X', 10000, 100);
            fail("Should have thrown an exception when Type argument is not in [E,D,A]");
        }catch (IllegalArgumentException e){
            assertEquals("One or more of the parameters have invalid value", e.getLocalizedMessage());
        }catch (Exception e2){
            fail("Caught and exception but it is not IllegalArgumentException as expected");
        }
    }
    
    @Test
    public void testConstructorNumberArgumentInvalid(){
        try{
            new Part('E', 15, 100);
            fail("Should have thrown an exception when Number argument is not in [10000, 99999]");
        }catch (IllegalArgumentException e){
            assertEquals("One or more of the parameters have invalid value", e.getLocalizedMessage());
        }catch (Exception e2){
            fail("Caught and exception but it is not IllegalArgumentException as expected");
        }
    }
    @Test
    public void testConstructorPriceArgumentInvalid(){
        try{
            new Part('E', 10000, -100);
            fail("Should have thrown an exception when Price argument is not greater than 0");
        }catch (IllegalArgumentException e){
            assertEquals("One or more of the parameters have invalid value", e.getLocalizedMessage());
        }catch (Exception e2){
            fail("Caught and exception but it is not IllegalArgumentException as expected");
        }

    }
    @Test
    public void testGetTypeInvalid(){
        char type = 'A';
        Part part = new Part(type, 10000, 50);
        assertEquals(part.getType(), type);
    }
    @Test    
    public void testGetNumberInvalid(){
        int number = 20000;
        Part part = new Part('E', number, 50);
        assertEquals(part.getNumber(), number);
    }
    @Test
    public void testGetPriceInvalid(){
        int price = 200;
        Part part = new Part('E', 20000, price);
        assertEquals(part.getPrice(), price);
    }
}
