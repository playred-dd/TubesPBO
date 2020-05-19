/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuota.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class FormRegistrasi extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null;
    /**
     * Creates new form FormRegistrasi
     */
    public FormRegistrasi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void hapuslayar() {
        txtnama.setText("");
        txtnik.setText("");
        txtno_telp.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        RegToLog = new javax.swing.JLabel();
        txtno_telp = new javax.swing.JTextField();
        btnRegistrasi = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnik = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        miniRegis = new javax.swing.JLabel();
        exitRegis = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(375, 500));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(375, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegToLog.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        RegToLog.setForeground(new java.awt.Color(255, 255, 255));
        RegToLog.setText("Login");
        RegToLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegToLogMouseClicked(evt);
            }
        });
        jPanel1.add(RegToLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 50, 40));

        txtno_telp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtno_telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtno_telpActionPerformed(evt);
            }
        });
        jPanel1.add(txtno_telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 190, 30));

        btnRegistrasi.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrasi.setText("Registrasi");
        btnRegistrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrasiActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 90, -1));

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No Hp");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 80, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrasi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 160, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NIK");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 80, 30));

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 190, 30));

        txtnik.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnikActionPerformed(evt);
            }
        });
        jPanel1.add(txtnik, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kuota/program/icon/Regis.back2.png"))); // NOI18N
        jLabel1.setText("  ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 140, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\PBO\\daun.png")); // NOI18N
        jLabel3.setText(" ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 130, 90));

        jLabel2.setText(" ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kuota/program/icon/Regis.back1.png"))); // NOI18N
        jLabel4.setText(" ");
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 140));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kuota/program/icon/icon.Regis.png"))); // NOI18N
        jLabel10.setText("  ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, 130));

        miniRegis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        miniRegis.setForeground(new java.awt.Color(255, 255, 255));
        miniRegis.setText("-");
        miniRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniRegisMouseClicked(evt);
            }
        });
        jPanel1.add(miniRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 20, 30));

        exitRegis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitRegis.setForeground(new java.awt.Color(255, 255, 255));
        exitRegis.setText("X");
        exitRegis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitRegisMouseClicked(evt);
            }
        });
        jPanel1.add(exitRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sudah Punya Akun?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FormRegistrasi().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrasiActionPerformed
        // TODO add your handling code here:
        try {
            if (txtnama.getText().equals("")|| txtnik.getText().equals("")|| txtno_telp.getText().equals("")){
                JOptionPane.showMessageDialog(this,"DATA TIDAK BOLEH KOSONG","PESAN", JOptionPane.ERROR_MESSAGE);
                hapuslayar();
            }else{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/kuota","root","");
                st = con.createStatement();
                String simpan = "insert into customer values ('"+txtnama.getText()+"','" + txtnik.getText()+"','"+txtno_telp.getText()+"')";
                st = con.createStatement();
                int SA = st.executeUpdate(simpan);
                JOptionPane.showMessageDialog(this, "REGISTRASI BERHASIL");
                this.setVisible(false);
                new LoginKuota(null,true).setVisible(true);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "AKUN SUDAH ADA/DUPLIKAT AKUN", "PESAN", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrasiActionPerformed

    private void txtno_telpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtno_telpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtno_telpActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txtnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnikActionPerformed

    private void miniRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniRegisMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniRegisMouseClicked

    private void exitRegisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitRegisMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitRegisMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void RegToLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegToLogMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginKuota().setVisible(true);
    }//GEN-LAST:event_RegToLogMouseClicked

    private void jLabel4AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4AncestorMoved

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
            java.util.logging.Logger.getLogger(FormRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegToLog;
    private javax.swing.JButton btnRegistrasi;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel exitRegis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel miniRegis;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtno_telp;
    // End of variables declaration//GEN-END:variables
}
