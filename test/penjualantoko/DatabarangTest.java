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
public class DatabarangTest extends TestCase {
    
    public DatabarangTest(String testName) {
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
     * Test of koneksi method, of class Databarang.
     */
    
    public void testKoneksi() {
        System.out.println("koneksi");
        Databarang instance = new Databarang();
        instance.koneksi();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of tampildata method, of class Databarang.
     */
    
    public void testTampildata() {
        System.out.println("tampildata");
        Databarang instance = new Databarang();
        instance.tampildata();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of bersih method, of class Databarang.
     */
    
    public void testBersih() {
        System.out.println("bersih");
        Databarang instance = new Databarang();
        instance.bersih();
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of main method, of class Databarang.
     */
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Databarang.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
