/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7tugas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class frame1 extends javax.swing.JFrame {

    String temp ="";
    Double ti, bt, h1;
    
    /**
     * Creates new form frame1
     */
    public frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Tinggi = new javax.swing.JTextField();
        Ideal = new javax.swing.JTextField();
        Perempuan = new javax.swing.JRadioButton();
        Laki = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Keluar = new javax.swing.JButton();
        Hitung = new javax.swing.JButton();
        Coba = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Berat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Saran = new javax.swing.JTextField();
        Hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CEK IDEAL TUBUH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 110, 30);

        jLabel2.setText("Jenis Kelamin");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 150, 130, 30);

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 60, 60, 30);

        jLabel4.setText("Tinggi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 90, 70, 30);

        jLabel5.setText("Berat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 120, 70, 30);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(150, 60, 150, 30);
        getContentPane().add(Tinggi);
        Tinggi.setBounds(150, 90, 70, 30);
        getContentPane().add(Ideal);
        Ideal.setBounds(230, 250, 70, 30);

        buttonGroup1.add(Perempuan);
        Perempuan.setText("Perempuan");
        getContentPane().add(Perempuan);
        Perempuan.setBounds(150, 150, 110, 40);

        buttonGroup1.add(Laki);
        Laki.setText("Laki - laki");
        getContentPane().add(Laki);
        Laki.setBounds(250, 150, 120, 40);

        jLabel6.setText("kg");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 250, 70, 30);

        jLabel7.setText("cm");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 90, 60, 30);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar);
        Keluar.setBounds(270, 190, 80, 40);

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });
        getContentPane().add(Hitung);
        Hitung.setBounds(80, 190, 80, 40);

        Coba.setText("Coba Lagi");
        Coba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CobaActionPerformed(evt);
            }
        });
        getContentPane().add(Coba);
        Coba.setBounds(160, 190, 110, 40);

        jLabel8.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 290, 200, 40);
        getContentPane().add(Berat);
        Berat.setBounds(150, 120, 70, 30);

        jLabel9.setText("kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 120, 70, 30);

        jLabel10.setText("Berat badan ideal anda adalah");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 240, 200, 40);
        getContentPane().add(Saran);
        Saran.setBounds(20, 380, 360, 30);
        getContentPane().add(Hasil);
        Hasil.setBounds(20, 330, 360, 30);

        setSize(new java.awt.Dimension(408, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
        
        if(Nama.getText().equals("")||Tinggi.getText().equals("")||
                Berat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Data inputan harus diisi");
        } else if(Perempuan.isSelected()||Laki.isSelected()){
            try{
                Proses();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data inputan salah");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Jenis Kelamin belum dipilih");
        }
    }//GEN-LAST:event_HitungActionPerformed

    private void CobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CobaActionPerformed
        // TODO add your handling code here:
        
        Nama.setText("");
        Tinggi.setText("");
        Berat.setText("");
        buttonGroup1.clearSelection();
        Ideal.setText("");
        Hasil.setText("");
        Saran.setText("");
    }//GEN-LAST:event_CobaActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JButton Coba;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Hitung;
    private javax.swing.JTextField Ideal;
    private javax.swing.JButton Keluar;
    private javax.swing.JRadioButton Laki;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton Perempuan;
    private javax.swing.JTextField Saran;
    private javax.swing.JTextField Tinggi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        //To change body of generated methods, choose Tools | Templates.
        ti = Double.valueOf(Tinggi.getText());
        bt = Double.valueOf(Berat.getText());
        
        if(Perempuan.isSelected()){
            h1 = (ti - 100) * 1;
        } else if(Laki.isSelected()){
            h1 = (ti - 104) * 1;
        }
        temp = Double.toString(h1.intValue());
        
        if(h1 < bt){
            Ideal.setText(temp);
            Hasil.setText("Maaf " + Nama.getText() + ", Sepertinya anda Overweight");
            Saran.setText("Banyaklah berolahraga dan hindari makanan berlemak");
        } else if(h1 > bt){
            Ideal.setText(temp);
            Hasil.setText("Maaf " + Nama.getText() + ", Sepertinya anda Underweight");
            Saran.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
        } else{
            Ideal.setText(temp);
            Hasil.setText("Selamat " + Nama.getText() + ", berat anda sudah ideal");
            Saran.setText("Lanjutkan olahraga dan hidup sehat anda");
        }
    }
}
