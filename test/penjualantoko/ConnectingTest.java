/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualantoko;

import javax.swing.JTable;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tika
 */
public class ConnectingTest extends TestCase {
    
    public ConnectingTest(String testName) {
        super(testName);
    }
      @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
 

    /**
     * Test of OpenCnt method, of class Connecting.
     */
    @Test
    public void testOpenCnt() {
        System.out.println("OpenCnt");
        Connecting instance = new Connecting();
        boolean expResult = true;
        boolean result = instance.OpenCnt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OpenCnt method, of class Connecting.
     */
    @Test
    public void testOpenCnt_5args() {
        System.out.println("OpenCnt");
        String host = "";
        String port = "";
        String db = "";
        String username = "";
        String password = "";
        Connecting instance = new Connecting();
        boolean expResult = true;
        boolean result = instance.OpenCnt(host, port, db, username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class Connecting.
     */
    @Test
    public void testExecute_String() {
        System.out.println("execute");
        String SQL = "";
        Connecting instance = new Connecting();
        boolean expResult = false;
        boolean result = instance.execute(SQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class Connecting.
     */
    @Test
    public void testExecute_3args() {
        System.out.println("execute");
        String SQL = "";
        JTable TabelContainerSwing = null;
        String[] ColumnName = null;
        Connecting instance = new Connecting();
        boolean expResult = false;
        boolean result = instance.execute(SQL, TabelContainerSwing, ColumnName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
