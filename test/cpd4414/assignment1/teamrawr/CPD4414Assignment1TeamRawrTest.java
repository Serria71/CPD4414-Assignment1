/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment1.teamrawr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0640785
 */
public class CPD4414Assignment1TeamRawrTest {
    
    public CPD4414Assignment1TeamRawrTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class CPD4414Assignment1TeamRawr.
     */

    /**
     * Test of stringPower method, of class CPD4414Assignment1TeamRawr.
     */
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("stringPower");
        String name = "";
        int num = 0;
        String expResult = "";
        String result = CPD4414Assignment1TeamRawr.stringPower(name, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testLessThanOneShouldReturnNull() {
        System.out.println("stringPower");
        String name = "stringPower";
        int num = 0;
        String expResult = null;
        String result = CPD4414Assignment1TeamRawr.stringPower(name, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void  testStringAndOneShouldReturnString() {
        System.out.println("stringPower");
        String name = "stringPower";
        int num = 1;
        String expResult = "stringPower";
        String result = CPD4414Assignment1TeamRawr.stringPower(name, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
