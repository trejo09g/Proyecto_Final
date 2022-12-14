/*
-
 */
package solucion;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class MétodosBúsquedaOrdenamiento extends javax.swing.JFrame {

    vector vprincipal = null;
    
    public MétodosBúsquedaOrdenamiento() {
        initComponents();
        setLocationRelativeTo(null);
        //setSize(980, 650);
        setTitle("MÉTODOS");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        qs = new javax.swing.JButton();
        ms = new javax.swing.JButton();
        bs = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bb = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        TA5 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        TA4 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TA2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TA3 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextPane();
        TF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MÉTODOS DE ORDENAMIENTO Y BÚSQUEDA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESE EL VALOR DEL VECTOR:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INGRESE EL DATO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MÉTODOS DE ORDENAMIENTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        B2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        B2.setText("VACIAR");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        B1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        B1.setText("INGRESAR");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        qs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        qs.setText("QUICK SORT");
        qs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qsActionPerformed(evt);
            }
        });
        jPanel1.add(qs, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        ms.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ms.setText("MERGE SORT");
        ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msActionPerformed(evt);
            }
        });
        jPanel1.add(ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        bs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bs.setText("BUSQUEDA SECUENCIAL");
        bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsActionPerformed(evt);
            }
        });
        jPanel1.add(bs, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MÉTODOS DE BUSQUEDA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        bb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bb.setText("BUSQUEDA BINARIA");
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });
        jPanel1.add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        TA5.setEditable(false);
        jScrollPane6.setViewportView(TA5);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 190, 50));

        TA4.setEditable(false);
        jScrollPane5.setViewportView(TA4);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 190, 50));

        TA2.setEditable(false);
        jScrollPane4.setViewportView(TA2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 190, 50));

        TA3.setEditable(false);
        jScrollPane3.setViewportView(TA3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 190, 50));

        TA1.setEditable(false);
        jScrollPane2.setViewportView(TA1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 190, 50));

        TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFActionPerformed(evt);
            }
        });
        jPanel1.add(TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colores-mezclados-en-ondas_1920x1080_5844.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 440));

        jMenu1.setForeground(new java.awt.Color(255, 0, 0));
        jMenu1.setText("MENUS");

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setText("MENU PRINCIPAL");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setText("SALIR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 0, 0));
        jMenu2.setText("DESPLAZAMIENTO");

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setText("MÉTODO DE BURBUJA");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       dispose();
       new menuP().setVisible(true); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        //
        if (TF.getText().length()>0)//Compruba los datos de entrada de longitud 
        {
            vector vIngreso = new vector();
            
            if(!vIngreso.esnumero(TF.getText())){//verifica el valor númerico de la longitud 
                JOptionPane.showMessageDialog(this, "El valor ingresado debe ser numerico ");
                return;
            }
            if (Integer.parseInt(TF.getText())<0)//verifica que el valor númerico sea positivo 
            {
                JOptionPane.showMessageDialog(this, "El valor ingresado debe ser un entero positivo");
                return;
            }
            int longitud_vector =Integer.parseInt(TF.getText());//se define la longitud y la inicialización del vector 
            vIngreso.setlongitud(longitud_vector);
            vIngreso.inicializarvector();
            
            for(int i=0;i<vIngreso.longitud;i++)
            {
                //EL cuadro de ingreso de datos 
                String dato=JOptionPane.showInputDialog("Ingrese el dato para la posición [" + i + "] del vector");
                
                if(!vIngreso.esnumero(dato)){//verifica si el dato ingresado en el vector es numerico 
                    JOptionPane.showMessageDialog(this, "El valor ingresado no es numérico,\n porfavor intente todo el ");
                    this.B2ActionPerformed(evt);
                    return;
                }
                vIngreso.insertar(i, Integer.valueOf(dato));//vector formado 
            }
            TA1.setText(vIngreso.imprimir());//Donde se visualiza el vector 
            this.vprincipal = new vector(longitud_vector);
            this.vprincipal.setArreglo(vIngreso.getArreglo());
        }
        else {
            JOptionPane.showMessageDialog(this, "Debe ingresar el tamaño del vector");
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        this.vprincipal= null;
        this.TA1.setText("");
        this.TA2.setText("");
        this.TA3.setText("");
        this.TA4.setText("");
        this.TA5.setText("");
        this.TF.setText("");
    }//GEN-LAST:event_B2ActionPerformed

    private void qsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qsActionPerformed
        // TODO add your handling code here:
        if(this.vprincipal==null){//verifica que exista datos en el vector 
            JOptionPane.showMessageDialog(this, "Antes de ordenar, debe ingresar\nun vector con sus datos");
        }else{
            int[] vector_ordenenado = this.vprincipal.quicksort(vprincipal.getArreglo(),0, vprincipal.longitud-1);
            TA2.setText(this.vprincipal.imprimir(vector_ordenenado));
            JOptionPane.showMessageDialog(this, "Sus valores son:" + vprincipal.imprimir(vector_ordenenado));
        }
    }//GEN-LAST:event_qsActionPerformed

    private void msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msActionPerformed
        // TODO add your handling code here:
        if(this.vprincipal==null){//verifica que exista datos en el vector 
            JOptionPane.showMessageDialog(this, "Antes de ordenar, debe ingresar\nun vector con sus datos");
        }else{
            this.vprincipal.mergesort(vprincipal.getArreglo());
            TA3.setText(this.vprincipal.imprimir());
            JOptionPane.showMessageDialog(this, "Sus valores son:" + vprincipal.imprimir());
        }
        
    }//GEN-LAST:event_msActionPerformed

    private void bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsActionPerformed
        // TODO add your handling code here:
        if(this.vprincipal==null){//verifica que exista datos en el vector 
            JOptionPane.showMessageDialog(this, "Antes de ordenar, debe ingresar\nun vector con sus datos");
        }else{//compara el dato a buscado con los datos del vector 
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que quiera buscar:"));
            TA4.setText(this.vprincipal.busquedasecuencial(dato));
            JOptionPane.showMessageDialog(this, "EL valor buscado esta en la " + vprincipal.busquedasecuencial(dato));
        }
    }//GEN-LAST:event_bsActionPerformed

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed
        // TODO add your handling code here:
                if(this.vprincipal==null){//verifica que exista datos en el vector 
            JOptionPane.showMessageDialog(this, "Antes de ordenar, debe ingresar\nun vector con sus datos");
        }else{//sale un cuadro para ingresar el valor a buscar 
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que quiera buscar:"));
            int [] vector_ordenado = this.vprincipal.quicksort(vprincipal.getArreglo(), 0 , vprincipal.longitud-1);
            int pos =this.vprincipal.busquedabinaria(vector_ordenado, dato);
            //compara el dato a buscar con los datos del vector ordenado  
            if (pos==-1){
                TA5.setText("No se encontro el dato: " + dato + " en el vector");
            }else{
                TA5.setText(this.vprincipal.imprimir(vector_ordenado) + "\n" + "posición: " + pos);
                JOptionPane.showMessageDialog(this, "EL valor buscado esta en la posición"+ pos);
            }
        }
    }//GEN-LAST:event_bbActionPerformed

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
            java.util.logging.Logger.getLogger(MétodosBúsquedaOrdenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MétodosBúsquedaOrdenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MétodosBúsquedaOrdenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MétodosBúsquedaOrdenamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MétodosBúsquedaOrdenamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JTextPane TA1;
    private javax.swing.JTextPane TA2;
    private javax.swing.JTextPane TA3;
    private javax.swing.JTextPane TA4;
    private javax.swing.JTextPane TA5;
    private javax.swing.JTextField TF;
    private javax.swing.JButton bb;
    private javax.swing.JButton bs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton ms;
    private javax.swing.JButton qs;
    // End of variables declaration//GEN-END:variables
}
