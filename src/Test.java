
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Test extends javax.swing.JFrame {
Pregunta pregu=new Pregunta();
Cuestionario cu=new Cuestionario();
int contador=0;
int resp=0;
int pregnum=1;


 
    
    public Test() {
        initComponents();
        jLabel2.setText("Pregunta  "+pregnum);
        jButton2.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        buttonGroup1.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver a realizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        pregnum++;
        jLabel2.setText("Pregunta  "+pregnum);
        if(jRadioButton1.isSelected()==true){
   
    System.out.println(cu.Res[0]);
   
    
    if(pregu.opc1[0].equals(cu.Res[0])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
}      
if(jRadioButton2.isSelected()==true){
   
    System.out.println(cu.Res[0]);
   
    
    if(pregu.opc1[0].equals(cu.Res[0])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
}
if(jRadioButton3.isSelected()==true){
   
    System.out.println(cu.Res[0]);
   
    
    if(pregu.opc1[0].equals(cu.Res[0])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
}  
if(jRadioButton4.isSelected()==true){
   
    System.out.println(cu.Res[0]);
   
    
    if(pregu.opc1[0].equals(cu.Res[0])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
}  

      
        contador++;
if(contador==0){    
jLabel1.setText(pregu.pregunta[0]);
jRadioButton1.setText(pregu.opc1[0]);
jRadioButton2.setText(pregu.opc1[0]);
jRadioButton3.setText(pregu.opc1[0]);
jRadioButton4.setText(pregu.opc1[0]);

}
if(contador==1){
    //aqui
    if(jRadioButton1.isSelected()==true){
   
    System.out.println(cu.Res[1]);
   
    
    if(pregu.opc1[1].equals(cu.Res[1])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    if(jRadioButton2.isSelected()==true){
   
    System.out.println(cu.Res[1]);
   
    
    if(pregu.opc1[1].equals(cu.Res[1])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    if(jRadioButton3.isSelected()==true){
   
    System.out.println(cu.Res[1]);
   
    
    if(pregu.opc1[1].equals(cu.Res[1])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    if(jRadioButton4.isSelected()==true){
   
    System.out.println(cu.Res[1]);
   
    
    if(pregu.opc1[1].equals(cu.Res[1])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    jLabel1.setText(pregu.pregunta[1]);
    jRadioButton1.setText(pregu.opc1[1]);
    jRadioButton2.setText(pregu.opc1[1]);
    jRadioButton3.setText(pregu.opc1[1]);
    jRadioButton4.setText(pregu.opc1[1]);
}
if(contador==2){
    //aqui
    if(jRadioButton1.isSelected()==true){
   
    System.out.println(cu.Res[2]);
   
    
    if(pregu.opc1[2].equals(cu.Res[2])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    if(jRadioButton2.isSelected()==true){
   
    System.out.println(cu.Res[2]);
   
    
    if(pregu.opc1[2].equals(cu.Res[2])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    if(jRadioButton3.isSelected()==true){
   
    System.out.println(cu.Res[2]);
   
    
    if(pregu.opc1[2].equals(cu.Res[2])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
  
    if(jRadioButton4.isSelected()==true){
   
    System.out.println(cu.Res[2]);
   
    
    if(pregu.opc1[2].equals(cu.Res[2])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    jLabel1.setText(pregu.pregunta[2]);
    jRadioButton1.setText(pregu.opc1[2]);
    jRadioButton2.setText(pregu.opc1[2]);
    jRadioButton3.setText(pregu.opc1[2]);
    jRadioButton4.setText(pregu.opc1[2]);
   
}
if(contador==3){
    //aqui
    if(jRadioButton1.isSelected()==true){
   
    System.out.println(cu.Res[3]);
   
    
    if(pregu.opc1[3].equals(cu.Res[3])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
}
    if(jRadioButton2.isSelected()==true){
   
    System.out.println(cu.Res[3]);
   
    
    if(pregu.opc1[3].equals(cu.Res[3])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
}
       if(jRadioButton3.isSelected()==true){
   
    System.out.println(cu.Res[3]);
   
    
    if(pregu.opc1[3].equals(cu.Res[3])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
}
          if(jRadioButton4.isSelected()==true){
   
    System.out.println(cu.Res[3]);
   
    
    if(pregu.opc1[3].equals(cu.Res[3])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    jLabel1.setText(pregu.pregunta[3]);
    jRadioButton1.setText(pregu.opc1[3]);
    jRadioButton2.setText(pregu.opc1[3]);
    jRadioButton3.setText(pregu.opc1[3]);
    jRadioButton4.setText(pregu.opc1[3]);
}
if(contador==4){
    //aqui
       if(jRadioButton1.isSelected()==true){
   
    System.out.println(cu.Res[4]);
   
    
    if(pregu.opc1[4].equals(cu.Res[4])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
              if(jRadioButton2.isSelected()==true){
   
    System.out.println(cu.Res[4]);
   
    
    if(pregu.opc1[4].equals(cu.Res[4])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
       if(jRadioButton3.isSelected()==true){
   
    System.out.println(cu.Res[4]);
   
    
    if(pregu.opc1[4].equals(cu.Res[4])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
}
     if(jRadioButton4.isSelected()==true){
   
    System.out.println(cu.Res[4]);
   
    
    if(pregu.opc1[4].equals(cu.Res[4])){
        resp++;
        System.out.println("Esta bien");
    }
    else{
       
        System.out.println("Error");
    }
  
} 
    
    
    jLabel1.setText(pregu.pregunta[4]);
    jRadioButton1.setText(pregu.opc1[4]);
    jRadioButton2.setText(pregu.opc1[4]);
    jRadioButton3.setText(pregu.opc1[4]);
    jRadioButton4.setText(pregu.opc1[4]);
    
}
if(contador==4){
    System.out.println("Tu calificacion fue:  "+resp);
    jButton1.setEnabled(false);
     jButton2.setEnabled(true);
     JOptionPane.showMessageDialog(rootPane,"Tu resultado es:   " +resp+"  de 5");
}
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Test ts1=new Test();
        ts1.hide();
        cu.show();
        
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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JRadioButton jRadioButton3;
    public javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
