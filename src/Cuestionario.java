
public  class Cuestionario extends javax.swing.JFrame {
Pregunta preg=new Pregunta();

static String[] Res=new String[5];

int modificador;
   
    
    public Cuestionario() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        guardar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        guardar2 = new javax.swing.JButton();
        guardar3 = new javax.swing.JButton();
        guardar4 = new javax.swing.JButton();
        guardar5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        respuesta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 36, 257, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 61, 124, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 90, 124, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 119, 124, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 153, 124, -1));

        guardar1.setText("Pregunta 1");
        guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 35, -1, -1));

        jButton1.setText("Relizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 295, -1, -1));

        guardar2.setText("Pregunta 2");
        guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar2ActionPerformed(evt);
            }
        });
        getContentPane().add(guardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 60, -1, -1));

        guardar3.setText("Pregunta 3");
        guardar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar3ActionPerformed(evt);
            }
        });
        getContentPane().add(guardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 89, -1, -1));

        guardar4.setText("pregunta 4");
        guardar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar4ActionPerformed(evt);
            }
        });
        getContentPane().add(guardar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 118, -1, -1));

        guardar5.setText("Pregunta 5");
        guardar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar5ActionPerformed(evt);
            }
        });
        getContentPane().add(guardar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 152, -1, -1));

        jLabel1.setText("Pregunta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, -1, -1));

        jLabel2.setText("Opcion 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        jLabel3.setText("Opcion 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jLabel4.setText("Opcion 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, -1, -1));

        jLabel5.setText("Opcion 4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 47, -1));

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel6.setText("Pregunta a modificar solo numero");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 243, -1, 34));
        getContentPane().add(respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 193, 124, -1));

        jLabel7.setText("Respuesta");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, -1, -1));

        jLabel8.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 398, 20));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar1ActionPerformed
        
      
    preg.pregunta[0]=jTextField1.getText();
    preg.opc1[0]=jTextField2.getText();
    preg.opc2[0]=jTextField3.getText();
    preg.opc3[0]=jTextField4.getText();
    preg.opc4[0]=jTextField5.getText();
    Res[0]=respuesta.getText();
    guardar1.setEnabled(false);
        
    }//GEN-LAST:event_guardar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Test ts=new Test();
        Cuestionario cuest=new Cuestionario();
        ts.show();
        cuest.hide();
        
     ts.jLabel1.setText(preg.pregunta[0]);
      ts.jRadioButton1.setText(preg.opc1[0]);
      ts.jRadioButton2.setText(preg.opc2[0]); 
       ts.jRadioButton3.setText(preg.opc3[0]);
        ts.jRadioButton4.setText(preg.opc4[0]);
        System.out.println(preg.pregunta[1]);
                  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guardar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar4ActionPerformed
        preg.pregunta[3]=jTextField1.getText();
    preg.opc1[3]=jTextField2.getText();
    preg.opc2[3]=jTextField3.getText();
    preg.opc3[3]=jTextField4.getText();
    preg.opc4[3]=jTextField5.getText();
     Res[3]=respuesta.getText();
    guardar4.setEnabled(false);
    }//GEN-LAST:event_guardar4ActionPerformed

    private void guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar2ActionPerformed
        
     preg.pregunta[1]=jTextField1.getText();
    preg.opc1[1]=jTextField2.getText();
    preg.opc2[1]=jTextField3.getText();
    preg.opc3[1]=jTextField4.getText();
    preg.opc4[1]=jTextField5.getText();
     Res[1]=respuesta.getText();
    guardar2.setEnabled(false);
    }//GEN-LAST:event_guardar2ActionPerformed

    private void guardar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar3ActionPerformed
         preg.pregunta[2]=jTextField1.getText();
    preg.opc1[2]=jTextField2.getText();
    preg.opc2[2]=jTextField3.getText();
    preg.opc3[2]=jTextField4.getText();
    preg.opc4[2]=jTextField5.getText();
     Res[2]=respuesta.getText();
    guardar3.setEnabled(false);
    }//GEN-LAST:event_guardar3ActionPerformed

    private void guardar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar5ActionPerformed
          preg.pregunta[4]=jTextField1.getText();
    preg.opc1[4]=jTextField2.getText();
    preg.opc2[4]=jTextField3.getText();
    preg.opc3[4]=jTextField4.getText();
    preg.opc4[4]=jTextField5.getText();
     Res[4]=respuesta.getText();
    guardar5.setEnabled(false);
    }//GEN-LAST:event_guardar5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificador=Integer.parseInt(jTextField6.getText());
        
        if(modificador==1){
            guardar1.setEnabled(true);
            jLabel8.setText("");
        }
        else{
            jLabel8.setText("ERROR fuera del rango solo se puede de 1-5");
        }
        if(modificador==2){
            guardar2.setEnabled(true);
            
        }
        if(modificador==3){
         guardar3.setEnabled(true);   
        }
        if(modificador==4){
            guardar4.setEnabled(true);
            
        }
        if(modificador==5){
            guardar5.setEnabled(true);
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar1;
    private javax.swing.JButton guardar2;
    private javax.swing.JButton guardar3;
    private javax.swing.JButton guardar4;
    private javax.swing.JButton guardar5;
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
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    public javax.swing.JTextField respuesta;
    // End of variables declaration//GEN-END:variables
}
