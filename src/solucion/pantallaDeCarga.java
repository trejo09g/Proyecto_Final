/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package solucion;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class pantallaDeCarga extends javax.swing.JFrame {

    private int pc;

    /**
     * Creates new form pantallaDeCarga
     */
    public pantallaDeCarga() {
        initComponents();
        setResizable(false);
        setSize(415, 400);
        // setLocation(20,50);
        setLocationRelativeTo(null);
        //setTitle("Hola");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carga = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        valor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carga.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        carga.setForeground(new java.awt.Color(255, 255, 255));
        carga.setText("Loading...");
        jPanel1.add(carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 380, 430, 30));

        valor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        valor.setForeground(new java.awt.Color(255, 255, 255));
        valor.setText("0 %");
        jPanel1.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 50, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/come.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -40, 480, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colores-mezclados-en-ondas_1920x1080_5844.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(pantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallaDeCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        pantallaDeCarga pc = new pantallaDeCarga();
        pc.setVisible(true);
        try {
            for(int i=0;i<=100;i++){
              Thread.sleep(100);
              pc.valor.setText(i +"%");
              if(i==10){
                  pc.carga.setText("Loading...");
              }
              if(i==20){
                  pc.carga.setText("Loading..");
              }
              if(i==50){
                 pc.carga.setText("Loading..."); 
              }
              if(i==70){
                 pc.carga.setText("Loading.."); 
              }
              if(i==80){
                  pc.carga.setText("Loading..");
              }
              pc.jProgressBar1.setValue(i);
              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        new login().setVisible(true); 
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel carga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JProgressBar jProgressBar1;
    public static javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables
}
