/*
 * To change this template, choose Tools | Templates
 * 
 * and open the template in the editor.
 */
package penjualantoko;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Tika
 */
public class TransaksiPenjualan extends javax.swing.JFrame {
 public Connection conn;
   public Statement cn;
  public void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java2","root","");
            cn=conn.createStatement();
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");
            System.out.println(e.getMessage());
        }
    }
     public void tampildata(){
        DefaultTableModel tbl = new DefaultTableModel();
        
        tbl.addColumn("tanggal");
        tbl.addColumn("kodebarang");
        tbl.addColumn("nama_barang");
        tbl.addColumn("hargajual");
        tbl.addColumn("qty");
        tbl.addColumn("satuan");
        tbl.addColumn("jumlah");
    
    
        try{
            koneksi();
            String sql="SELECT * from transaksi";
            Statement stat = conn.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            while (rs.next())
            {
                tbl.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7)
            });
            }
            jTable1.setModel(tbl);
            int rows = jTable1.getRowCount();
            int sum=0;
            for(int x=0;x<rows;x++)
            {
            String nilai = jTable1.getValueAt(x, 6).toString();
            int nilai1 = Integer.parseInt(nilai);
            sum = sum + nilai1;
            }
            String sum1 = Integer.toString(sum);
            total.setText(sum1);
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"Tampil Data Gagal"); 
        }
     }
     public void bersih() {
        struk.setText("");
        date.setDateFormatString("");
        jNIK.setSelectedItem("NIK");
        karyawan.setText("");
        jPelanggan.setSelectedItem("Data pelanggan");
        pelanggan.setText("");
        
       jComboBox3.setSelectedItem("kodebarang");
       namabarang.setText("");
       txthargabarang.setText("");
       txtqty.setText("");
       satuan.setText("");
       stok.setText("");
}
    public void allreset(){
          try{
            koneksi();
            
            String sql="truncate transaksi";
            String sql1 = "truncate struk ";
            cn.executeUpdate(sql);
            cn.executeUpdate(sql1);
            conn.close();
            tampildata();  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Proses reset gagal");
            System.out.println(e.getMessage());   } 
    }
   
    void jComboBox1(){
        try {
            koneksi();
            String sql="Select * from karyawan order by NIK asc";
            Statement stmt = conn.createStatement();
            ResultSet r=stmt.executeQuery(sql);
            while(r.next()){
                jNIK.addItem(r.getString("NIK"));   
            }
            r.close();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void jComboBox2(){
        try {
            koneksi();
            String sql="Select * from datapelanggan order by kode asc";
            Statement stmt = conn.createStatement();
            ResultSet r=stmt.executeQuery(sql);
            while(r.next()){
                 jPelanggan.addItem(r.getString("kode"));   
            }
            r.close();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    
void jComboBox3(){
        try {
            koneksi();
            String sql="Select * from databarang order by kodebarang asc";
            Statement stmt = conn.createStatement();
            ResultSet r=stmt.executeQuery(sql);
            while(r.next()){
                 jComboBox3.addItem(r.getString("kodebarang"));   
            }
            r.close();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
    public TransaksiPenjualan() {
       initComponents();
        jComboBox1();
        jComboBox2(); 
        jComboBox3();
        tampildata();
        allreset();
        this.setLocationRelativeTo(getRootPane()); 
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        namabarang = new javax.swing.JTextField();
        txthargabarang = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jNIK = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        karyawan = new javax.swing.JTextField();
        pelanggan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPelanggan = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        total = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        kembalian = new javax.swing.JTextField();
        Simpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        struk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        satuan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Transaksi Penjualan Barang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Transaksi");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga", "Quantity", "Jumlah"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        jLabel8.setText("Kode Barang");

        jLabel11.setText("Nama Barang");

        jLabel12.setText("Harga Barang");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kode Barang" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jLabel13.setText("Quantity");

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel17.setText("Stok");

        stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jNIK.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NIK" }));
        jNIK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jNIKItemStateChanged(evt);
            }
        });
        jNIK.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jNIKPropertyChange(evt);
            }
        });

        jLabel3.setText("NIK");

        jLabel10.setText("Nama Karyawan");

        jLabel9.setText("Nama Pelanggan");

        jLabel7.setText("Kode Pelanggan");

        jPelanggan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kode pelanggan" }));
        jPelanggan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jPelangganItemStateChanged(evt);
            }
        });

        jLabel18.setText("Karyawan ");

        jLabel19.setText("Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addComponent(pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jNIK, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Rincian Transaksi");

        jLabel15.setText("Bayar     Rp.");

        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        bayar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bayarFocusLost(evt);
            }
        });

        jButton2.setText("Selesai");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Cetak");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Menu Utama");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel14.setText("Total       Rp. ");

        jLabel16.setText("kembalian  Rp.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(bayar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        jLabel4.setText("No Struk");

        jLabel5.setText("Tanggal");

        jLabel20.setText("Satuan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addComponent(struk, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel5)
                        .addGap(62, 62, 62)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txthargabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(satuan)))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(struk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txthargabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(Update)
                    .addComponent(jButton1)
                    .addComponent(Simpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNIKPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jNIKPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jNIKPropertyChange

    private void jNIKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jNIKItemStateChanged
 if(jNIK.getSelectedItem()=="NIK")
        {
            
            karyawan.setText("");
  
        }
        else {
            
        
        try{
        koneksi();
        String sql="select namalngkp from karyawan where NIK='"+jNIK.getSelectedItem()+"'";
        Statement stmt = conn.createStatement();
        ResultSet r=stmt.executeQuery(sql);
        while(r.next()){
         karyawan.setText(r.getString("namalngkp"));     
        }
        
    }catch(Exception e){
        e.printStackTrace();
    } 
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jNIKItemStateChanged

    private void jPelangganItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jPelangganItemStateChanged
 if(jPelanggan.getSelectedItem()=="kode")
        {
            pelanggan.setText("");
                   }
       else {
        try{
        koneksi();
        String sql="select nama from datapelanggan where kode='"+jPelanggan.getSelectedItem()+"'";
        Statement stmt = conn.createStatement();
        ResultSet r=stmt.executeQuery(sql);
        while(r.next()){
            pelanggan.setText(r.getString("nama"));
        }
     tambah.setEnabled(false);   
    }catch(Exception e){
        e.printStackTrace();
    } }        // TODO add your handling code here:
    }//GEN-LAST:event_jPelangganItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
     if(jComboBox3.getSelectedItem()=="kodebarang")
        {
            namabarang.setText("");
            txthargabarang.setText("");
            stok.setText("");
            satuan.setText("");
       
        }
       
       else {
        try{
        koneksi();
        String sql="select nama_barang,hargajual,qty,satuan from databarang where kodebarang='"+jComboBox3.getSelectedItem()+"'";
        Statement stmt = conn.createStatement();
        ResultSet r=stmt.executeQuery(sql);
        while(r.next()){
            namabarang.setText(r.getString("nama_barang"));
            txthargabarang.setText(r.getString("hargajual"));
            stok.setText(r.getString("qty"));
            satuan.setText(r.getString("satuan"));
        }
    tambah.setEnabled(true);
    }catch(Exception e){
        e.printStackTrace();
    } 
     }        // TODO add your handling code here:
   // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
           try{
            koneksi();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tanggal = format.format(date.getDate());
            int qty = Integer.parseInt(txtqty.getText());
            int stok1 = Integer.parseInt(stok.getText());
            if  (qty > stok1 )
            {
            JOptionPane.showMessageDialog(null,"qty tidak boleh lebih dari stok");
           
            }
            else {    
            int aa = Integer.parseInt(txtqty.getText());
            int bb = Integer.parseInt(txthargabarang.getText());
            int hasil = aa*bb;
            String sql="Insert into transaksi values('"+date.getDate()+"','"+jComboBox3.getSelectedItem()+"','"+namabarang.getText()+"','"+txthargabarang.getText()+"','"+txtqty.getText()+"','"+satuan.getText()+"','"+hasil+"')";
             cn.executeUpdate(sql);
            conn.createStatement();
            tampildata();
             JOptionPane.showMessageDialog(null,"Data ditambah");
            }
           }
         catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Proses tambah gagal");
            System.out.println(e.getMessage());
        }
    
        }//GEN-LAST:event_tambahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try{

            koneksi();
            String sql="delete from transaksi where kodebarang ='"+jComboBox3.getSelectedItem()+"'";
            
            cn.executeUpdate(sql);
            conn.close();
            tampildata();
            
            JOptionPane.showMessageDialog(null,"Data dihapus");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Proses hapus gagal");
            System.out.println(e.getMessage());   }
        
         }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int table=jTable1.getSelectedRow();
        //mengambil data dari table
        String a=jTable1.getValueAt(table,0).toString();
        String b=jTable1.getValueAt(table,1).toString();
        String c=jTable1.getValueAt(table,2).toString();
        String d=jTable1.getValueAt(table,3).toString(); 
        String e=jTable1.getValueAt(table,4).toString();
         String f=jTable1.getValueAt(table,5).toString();
        
            
          
            date.setDateFormatString(a);
            jComboBox3.setSelectedItem(b);
             namabarang.setText(c);
            txthargabarang.setText(d);
            txtqty.setText(e); 
            satuan.setText(f);
            
            date.requestFocus();
            namabarang.requestFocus();
            txthargabarang.requestFocus();
            txtqty.requestFocus();
            satuan.requestFocus();
            jComboBox3.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void bayarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bayarFocusLost
        int a = Integer.parseInt(bayar.getText());
        int b = Integer.parseInt(total.getText());
        if(a>=b){
        int hasil = a-b;
           kembalian.setText(Integer.toString(hasil));
           jButton2.setEnabled(true);}
           else{ 
            kembalian.setText("0");
                   JOptionPane.showMessageDialog(null,"Nominal Bayar Salah");
                   jButton2.setEnabled(false);
                   }           // TODO add your handling code here:
    }//GEN-LAST:event_bayarFocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try { 
        koneksi();
        String NamaFile = "C:/Users/Tika/Documents/NetBeansProjects/Penjualantoko/report/struk1.jasper";
      
        HashMap param = new HashMap();
            param.clear();      
            JasperPrint JPrint = JasperFillManager.fillReport(NamaFile, param, conn);
            JasperViewer.viewReport(JPrint);
             Main Menuutama = new Main ();
             Menuutama.setVisible(true);  
            this.dispose();
           
    }
    catch(Exception ex){
            System.out.println(ex);
          // TODO        // TODO add your handling code here:

    }// TODO        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try{
            koneksi();
            String sql="Insert into struk values('"+struk.getText()+"','"+jPelanggan.getSelectedItem()+"','"+pelanggan.getText() +"','"+jNIK.getSelectedItem()+"','"+karyawan.getText()+"','"+bayar.getText()+"','"+kembalian.getText()+"')";
            cn.executeUpdate(sql);
            conn.createStatement();
            tampildata();
            bersih();
            JOptionPane.showMessageDialog(null, "Data selesai");
            
         } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Data yang anda masukan salah");
            System.out.println(e.getMessage());   
             
        }        // TODO add your handling code here:

        jButton2.setEnabled(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Main Menuutama = new Main ();
    Menuutama.setVisible(true);   
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
try{   
             koneksi();
            int aa = Integer.parseInt(txtqty.getText());
            int bb = Integer.parseInt(txthargabarang.getText());
            int hasil = aa*bb;
            String sql="update transaksi set qty ='"+txtqty.getText()+"',"+"jumlah='"+hasil+"'"+"where kodebarang='"+jComboBox3.getSelectedItem()+"'";
            
            cn.executeUpdate(sql);
            conn.close();
            tampildata();
            txtqty.requestFocus();
            JOptionPane.showMessageDialog(null,"Data diupdate");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Proses update gagal");
            System.out.println(e.getMessage());
       jComboBox3.setEnabled(false);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokActionPerformed
    
    }//GEN-LAST:event_stokActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bayarActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
   try{
        koneksi();
            int aa = Integer.parseInt(txtqty.getText());
            int bb = Integer.parseInt(txthargabarang.getText());
            int hasil = aa*bb;
            
             String sql2="INSERT INTO `transaksi2`(`tanggal`, `kodebarang`, `nama_barang`, `hargajual`, `qty`, `satuan`, `jumlah`)values('"+date.getDate()+"','"+jComboBox3.getSelectedItem()+"','"+namabarang.getText()+"','"+txthargabarang.getText()+"','"+txtqty.getText()+"','"+satuan.getText()+"','"+hasil+"')";
             String sql="SELECT * from transaksi";
             cn.executeUpdate(sql2);
            conn.createStatement();
       try {
            String view ="SELECT qty from databarang where kodebarang ='"+jComboBox3.getSelectedItem()+"'";
             int qty1 = Integer.parseInt(txtqty.getText());
           int stok2 = Integer.parseInt(stok.getText());
           int hasilstok = stok2 - qty1;
           String query ="UPDATE databarang SET qty ='"+hasilstok+"' where kodebarang ='"+jComboBox3.getSelectedItem()+"'";
            cn.executeUpdate(query);
            conn.createStatement();
            tampildata();
            JOptionPane.showMessageDialog(null, "Data disimpan");
       }
            catch (NumberFormatException | SQLException | HeadlessException e){
             JOptionPane.showMessageDialog(null,"Data barang diUpdate");   
            
       
              
            }
    }catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan");
            System.out.println(e.getMessage());   
         }
                  // TODO add your handling code here:    // TODO add your handling code here:
    }//GEN-LAST:event_SimpanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaksiPenjualan().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Simpan;
    private javax.swing.JButton Update;
    private javax.swing.JTextField bayar;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox jNIK;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox jPelanggan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField karyawan;
    private javax.swing.JTextField kembalian;
    private javax.swing.JTextField namabarang;
    private javax.swing.JTextField pelanggan;
    private javax.swing.JTextField satuan;
    private javax.swing.JTextField stok;
    private javax.swing.JTextField struk;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txthargabarang;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables
}
