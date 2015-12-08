/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualantoko;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tika
 */
public class Connecting {
  public Connection konek;
    public DefaultTableModel dtm;
    public ResultSet rst;

    public boolean OpenCnt() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String host = "localhost";
            String port = "3306";
            String db = "java2";
            String username = "root";
            String password = "";
            konek = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + db, username, password);
            return true;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "Class not found");
            return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed To Connect To database");
            return false;
        }
        /**
         * this method is used to open a connection to database with a Defined
         * host, port , database, username, and password
         */
    }

    public boolean OpenCnt(String host, String port, String db, String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            konek = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + db, username, password);
            return true;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "Class not found");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed To Connect To database");
            return false;
        }

        /**
         * this method is used to open a connection to database with a
         * variability host, port , database, username, and password
         */
    }

    public boolean execute(String SQL) {
        try {
            // TODO add your handling code here:
            Statement stmt = konek.createStatement();
            stmt.executeUpdate(SQL);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed To Execute Query");
            return false;
        }
        /**
         * this method is used to execute a DML Query type this method can't
         * execute a DDL Query type
         */
    }

    public boolean execute(String SQL, JTable TabelContainerSwing, String[] ColumnName) {

        dtm = new DefaultTableModel(null, ColumnName) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        try {
            Statement stmt = konek.createStatement();
            //System.out.println(SQ);
            rst = stmt.executeQuery(SQL);
            if (rst == null) {
                JOptionPane.showMessageDialog(null, "Data Not Found");
                TabelContainerSwing.setModel(dtm);
                return true;
            } else {
                String[] data = new String[ColumnName.length];
                
                while (rst.next()) {
                    int i = ColumnName.length - 1;
                    while (i >= 0) {
                        System.out.println(rst.getString(ColumnName[i]));
                        data[i] = rst.getString(ColumnName[i]);
                        i--;
                    }
                    dtm.addRow(data);
                }
                TabelContainerSwing.setModel(dtm);
                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed to retrieve data error on SQL or Column did not match the database");
                TabelContainerSwing.setModel(dtm);
                return true;            
        }
    }
}