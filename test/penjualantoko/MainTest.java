/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualantoko;

import junit.framework.TestCase;

/**
 *
 * @author Tika
 */
public class MainTest extends TestCase {
    
   public MainTest(String testName) {
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
/**
     * Test of koneksi method, of class Main.
     */
    
    public void testKoneksi() {
        System.out.println("koneksi");
        Main instance = new Main();
        instance.koneksi();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class Main.
     */
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }
}
