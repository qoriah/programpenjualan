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
public class DatakaryawanTest extends TestCase {
    
    public DatakaryawanTest(String testName) {
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
     * Test of koneksi method, of class Datakaryawan.
     */
    
    public void testKoneksi() {
        System.out.println("koneksi");
        Datakaryawan instance = new Datakaryawan();
        instance.koneksi();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of tampildata method, of class Datakaryawan.
     */
    
    public void testTampildata() {
        System.out.println("tampildata");
        Datakaryawan instance = new Datakaryawan();
        instance.tampildata();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of bersih method, of class Datakaryawan.
     */
    
    public void testBersih() {
        System.out.println("bersih");
        Datakaryawan instance = new Datakaryawan();
        instance.bersih();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Datakaryawan.
     */
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Datakaryawan.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
