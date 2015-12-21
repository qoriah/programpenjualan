/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualantoko;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import java.util.List;
import org.junit.Test;


/**
 *
 * @author Tika
 */
public class DatakaryawanTest {
    
    public DatakaryawanTest() {
    }
    
   
    /**
     * Test of koneksi method, of class Datakaryawan.
     */
    @Test
    public void testKoneksi() {
        System.out.println("koneksi");
        Datakaryawan instance = new Datakaryawan();
        instance.koneksi();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of tampildata method, of class Datakaryawan.
     */
    @Test
    public void testTampildata() {
        System.out.println("tampildata");
        Datakaryawan instance = new Datakaryawan();
        instance.tampildata();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of bersih method, of class Datakaryawan.
     */
    @Test
    public void testBersih() {
        System.out.println("bersih");
        Datakaryawan instance = new Datakaryawan();
        instance.bersih();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Datakaryawan.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Datakaryawan.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
