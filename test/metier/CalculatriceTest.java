/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/*import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;*/

/**
 *
 * @author admin
 */
public class CalculatriceTest {
    
    public CalculatriceTest() {
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
     * Test of calculer method, of class Calculatrice.
     */
    @Test
    public void testCalculer() {
        System.out.println("calculer");
        Double result, expResult;
        Calculatrice instance = new Calculatrice();
        expResult = 5.0;
        result = instance.calculer(3.0, 2.0, '+');
        assertEquals(expResult, result);
        expResult = 1.0;
        result = instance.calculer(3.0, 2.0, '-');
        assertEquals(expResult, result);
        expResult = 6.0;
        result = instance.calculer(3.0, 2.0, '*');
        assertEquals(expResult, result);
        expResult = 1.5;
        result = instance.calculer(3.0, 2.0, ':');
        assertEquals(expResult, result);
        expResult = null;
        result = instance.calculer(3.0, 0.0, '/');
        assertEquals(expResult, result);
    }
    
}
