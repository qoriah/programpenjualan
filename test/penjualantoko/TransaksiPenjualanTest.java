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
public class TransaksiPenjualanTest extends TestCase {
    
    public TransaksiPenjualanTest(String testName) {
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
     * Test of koneksi method, of class TransaksiPenjualan.
     */
 
    public void testKoneksi() {
        System.out.println("koneksi");
        TransaksiPenjualan instance = new TransaksiPenjualan();
        instance.koneksi();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of tampildata method, of class TransaksiPenjualan.
     */
    
    public void testTampildata() {
        System.out.println("tampildata");
        TransaksiPenjualan instance = new TransaksiPenjualan();
        instance.tampildata();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of bersih method, of class TransaksiPenjualan.
     */
    
    public void testBersih() {
        System.out.println("bersih");
        TransaksiPenjualan instance = new TransaksiPenjualan();
        instance.bersih();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of allreset method, of class TransaksiPenjualan.
     */
    
    public void testAllreset() {
        System.out.println("allreset");
        TransaksiPenjualan instance = new TransaksiPenjualan();
        instance.allreset();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of jComboBox1 method, of class TransaksiPenjualan.
     */
   
    public void testJComboBox1() {
        System.out.println("jComboBox1");
        TransaksiPenjualan instance = new TransaksiPenjualan();
        instance.jComboBox1();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of jComboBox2 method, of class TransaksiPenjualan.
     */
    
    public void testJComboBox2() {
        System.out.println("jComboBox2");
        TransaksiPenjualan instance = new TransaksiPenjualan();
        instance.jComboBox2();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of jComboBox3 method, of class TransaksiPenjualan.
     */
    
    public void testJComboBox3() {
        System.out.println("jComboBox3");
        TransaksiPenjualan instance = new TransaksiPenjualan();
        instance.jComboBox3();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class TransaksiPenjualan.
     */
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TransaksiPenjualan.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
