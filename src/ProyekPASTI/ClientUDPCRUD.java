package ProyekPASTI;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClientUDPCRUD extends javax.swing.JFrame {
    
    public ClientUDPCRUD() {
        initComponents();
        loadTable();
    }

    //Fungsi Bersihkan kolom input    
    public void clear(){
            txtNama.setText(null);
            txtNpm.setText(null);
            comboJurusan.setAction(null);
            txtAlamat.setText(null);
            txtTelp.setText(null);
    }
    
    //koneksi TCP
    public void koneksiUDP(String msg) throws IOException {
        
        String serverHostName = "localhost";
        
        InetAddress serverIPAddress = null;
               
        int serverPortNumber = 2302;
        
        DatagramSocket clientSocket = new DatagramSocket();
        
        serverIPAddress = InetAddress.getByName(serverHostName);
       
       
        String message = null;
        message = msg;
        
        byte[] sendData = new byte[message.length()*16];
        sendData = message.getBytes();
        
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverIPAddress, serverPortNumber);
        clientSocket.send(sendPacket); 
        System.out.print("\n[UDP Client] Pesan anda telah terkirim ... ");    
        
        /*
        int dataLength = 100;
        byte[] receiveData = new byte[dataLength];  
        DatagramPacket receivePacket = null;
        
        clientSocket.receive(receivePacket);
        String pesanEror = new String(receivePacket.getData());        
        
        pesanEror = pesanEror.trim();
        
        JOptionPane.showMessageDialog(null,pesanEror); 
        */loadTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNpm = new javax.swing.JTextField();
        clickHapus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridtampil = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboJurusan = new javax.swing.JComboBox<String>();
        txtAlamat = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        clickTambah = new javax.swing.JButton();
        clickUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 14)); // NOI18N
        jLabel1.setText("Client Side");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel2.setText("Data Mahasiswa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("NIM");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtNpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNpmActionPerformed(evt);
            }
        });

        clickHapus.setText("Hapus");
        clickHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickHapusActionPerformed(evt);
            }
        });

        jButton2.setText("Keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        gridtampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        gridtampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridtampilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(gridtampil);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Jurusan");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Alamat");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nomor Telp.");

        comboJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teknik Informatika", "Teknik Komputer", "Manajemen Rekayasa", "Teknik Bioproses", "Teknik Elektro" }));
        comboJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJurusanActionPerformed(evt);
            }
        });

        txtTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelpActionPerformed(evt);
            }
        });

        clickTambah.setText("Tambah");
        clickTambah.setFocusable(false);
        clickTambah.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clickTambah.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clickTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickTambahActionPerformed(evt);
            }
        });

        clickUpdate.setText("Update");
        clickUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUpdateActionPerformed(evt);
            }
        });

        jLabel8.setText("C R U D");

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jButton1.setText("Refresh Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNpm, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(clickTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clickUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clickHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(comboJurusan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickTambah)
                    .addComponent(clickUpdate)
                    .addComponent(clickHapus)
                    .addComponent(Clear))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO dd your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtNpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNpmActionPerformed

    }//GEN-LAST:event_txtNpmActionPerformed

    //Kode Program Untuk Tombol Hapus
    private void clickHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickHapusActionPerformed
        String query = null;
        query = "DELETE FROM mahasiswa WHERE npm='"+txtNpm.getText()+"';";

        try {
            koneksiUDP(query);
        } catch (IOException e) {
                    
        }
        
        clear();
        loadTable();
    }//GEN-LAST:event_clickHapusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,
        "Apakah anda ingin menutup aplikasi?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        
        if (selectedOption == JOptionPane.YES_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJurusanActionPerformed

    private void txtTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpActionPerformed
    
    //Kode Program Untuk Tombol Tambah
    private void clickTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickTambahActionPerformed
        //Query Untuk Insert Data 
        String query = null;
        query = "INSERT INTO mahasiswa VALUES ('"+txtNama.getText()+"','"+txtNpm.getText()+"','"
                           +comboJurusan.getSelectedItem()+"','"+txtAlamat.getText()+"','"+txtTelp.getText()+"')";
       
        try {
            koneksiUDP(query); 
        } catch (IOException ex) {   
        }

        clear();
        loadTable();
    }//GEN-LAST:event_clickTambahActionPerformed
    
    //Kode Program Untuk Tombol Update
    private void clickUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUpdateActionPerformed
        //Query Untuk Update Data
        String query = null;
        query = "UPDATE mahasiswa SET nama='"+txtNama.getText()+"',npm='"+txtNpm.getText()+"',jurusan='"+comboJurusan.getSelectedItem()
                         +"',alamat='"+txtAlamat.getText()+"',phone='"+txtTelp.getText()+"' WHERE npm = "+txtNpm.getText();
        
        try {
            koneksiUDP(query);
        } catch (IOException ex) {
        }
            
        clear();
        loadTable();
    }//GEN-LAST:event_clickUpdateActionPerformed

    private void gridtampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridtampilMouseClicked
        int pilih = gridtampil.getSelectedRow();
        String nama = gridtampil.getValueAt(pilih, 1).toString();
        String npm = gridtampil.getValueAt(pilih, 2).toString();
        String jurusan = gridtampil.getValueAt(pilih, 3).toString();
        String alamat = gridtampil.getValueAt(pilih, 4).toString();
        String telp = gridtampil.getValueAt(pilih, 5).toString();

        txtNama.setText(nama);
        txtNpm.setText(npm);
        comboJurusan.setSelectedItem(jurusan);
        txtAlamat.setText(alamat);
        txtTelp.setText(telp);
    }//GEN-LAST:event_gridtampilMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        clear();
        loadTable();
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadTable();
    }//GEN-LAST:event_jButton1ActionPerformed
   
    public static void main(String args[]) {
        
        System.out.print(""
         + "==========================================================\n"
         + "\tUDP Client - Kelompok PASTI\n"
         + "==========================================================\n");
         
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
            java.util.logging.Logger.getLogger(ClientUDPCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientUDPCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientUDPCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientUDPCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientUDPCRUD().setVisible(true);
            }
        });    
    }

    private void loadTable(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("NIM");
        model.addColumn("Jurusan");
        model.addColumn("Alamat");
        model.addColumn("Phone");
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "select * from mahasiswa";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
            }
            gridtampil.setModel(model);
        } catch (Exception e) {
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton clickHapus;
    private javax.swing.JButton clickTambah;
    private javax.swing.JButton clickUpdate;
    private javax.swing.JComboBox<String> comboJurusan;
    private javax.swing.JTable gridtampil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNpm;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
