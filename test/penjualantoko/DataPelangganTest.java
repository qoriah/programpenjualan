/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualantoko;
import junit.framework.TestCase;
import javax.swing.JFrame;
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
public class DataPelangganTest extends TestCase{
    
    public DataPelangganTest(String testName) {
         super(testName);
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
     * Test of main method, of class DataPelanggan.
     */
    
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DataPelanggan.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of settocenter method, of class DataPelanggan.
     */
    
    public void testSettocenter() {
        System.out.println("settocenter");
        JFrame tambahpemasukan = null;
        DataPelanggan.settocenter(tambahpemasukan);
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
