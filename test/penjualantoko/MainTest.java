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
public class MainTest  {
    
   public MainTest() {

    }
    
/**
     * Test of koneksi method, of class Main.
     */
    @Test
    public void testKoneksi() {
        System.out.println("koneksi");
        Main instance = new Main();
        instance.koneksi();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
      
    }
}
