/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualantoko;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;


/**
 *
 * @author Tika
 */
public class DataPelangganTest extends TestCase {
    
    public DataPelangganTest(String testName) {
        super(testName);

    }
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
     @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }  /**
     * Test of koneksi method, of class DataPelanggan.
     */
   
    public void testKoneksi() throws SQLException {
        System.out.println("koneksi");
        DataPelanggan instance = new DataPelanggan();
        instance.koneksi();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of tampildata method, of class DataPelanggan.
     */
   
    public void testTampildata() throws SQLException, SQLException {
        System.out.println("tampildata");
        DataPelanggan instance = new DataPelanggan();
        instance.tampildata();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of bersih method, of class DataPelanggan.
     */
 
    public void testBersih() throws SQLException, SQLException {
        System.out.println("bersih");
        DataPelanggan instance = null;
        try {
            instance = new DataPelanggan();
        } catch (SQLException ex) {
            Logger.getLogger(DataPelangganTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        instance.bersih();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of main method, of class DataPelanggan.
     */
   
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DataPelanggan.main(args);
        // TODO review the generated test code and remove the default call to fail.
     
    }
}
