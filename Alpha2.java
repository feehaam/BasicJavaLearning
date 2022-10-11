package ProjectAlpha;
public class Alpha2 extends javax.swing.JFrame {
      public Alpha2() {
            initComponents();
      }
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jComboBox1 = new javax.swing.JComboBox();
            jComboBox2 = new javax.swing.JComboBox();
            jTextField1 = new javax.swing.JTextField();
            jTextField2 = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Temparature converter");
            setResizable(false);

            jPanel1.setBackground(new java.awt.Color(204, 0, 0));

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("Temp. Converter");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(185, 185, 185))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addContainerGap(78, Short.MAX_VALUE))
            );

            jComboBox1.setBackground(new java.awt.Color(204, 0, 51));
            jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celcius", "Fehrenheit" }));
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jComboBox1ActionPerformed(evt);
                  }
            });

            jComboBox2.setBackground(new java.awt.Color(204, 0, 51));
            jComboBox2.setForeground(new java.awt.Color(240, 240, 240));
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fehrenheit", "Celcius" }));

            jTextField1.setBackground(new java.awt.Color(233, 250, 255));
            jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jTextField1.setForeground(new java.awt.Color(153, 0, 51));
            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField1ActionPerformed(evt);
                  }
            });

            jTextField2.setEditable(false);
            jTextField2.setBackground(new java.awt.Color(233, 250, 255));
            jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jTextField2.setForeground(new java.awt.Color(153, 0, 51));

            jButton1.setBackground(new java.awt.Color(0, 51, 51));
            jButton1.setForeground(new java.awt.Color(240, 240, 240));
            jButton1.setText("Convert");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            jButton2.setBackground(new java.awt.Color(0, 51, 51));
            jButton2.setForeground(new java.awt.Color(240, 240, 240));
            jButton2.setText("Clear");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });

            jButton3.setBackground(new java.awt.Color(0, 51, 51));
            jButton3.setForeground(new java.awt.Color(240, 240, 240));
            jButton3.setText("Exit");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(122, 122, 122)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                          .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2))
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(146, 146, 146))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jButton1)
                              .addComponent(jButton2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(47, 47, 47))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            jTextField1.setText("");
            jTextField2.setText("");
      }//GEN-LAST:event_jButton2ActionPerformed

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            System.exit(0);
      }//GEN-LAST:event_jButton3ActionPerformed

      private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            
      }//GEN-LAST:event_jTextField1ActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String box1 = (String)jComboBox1.getSelectedItem();
            String box2 = (String)jComboBox2.getSelectedItem();
            
            if(box1.equals("Celcius") && box2.equals("Fehrenheit"))
            {
                  double c = Double.parseDouble(jTextField1.getText());
                  double f = (double) (c * 1.8 +32);
                  
                  jTextField2.setText(String.valueOf(f));
            }
            if(box1.equals("Fehrenheit") && box2.equals("Celcius"))
            {
                  double f = Double.parseDouble(jTextField1.getText());
                  double c = (double) ((f-32)/1.8);
                  
                  jTextField2.setText(String.valueOf(c));
            }
      }//GEN-LAST:event_jButton1ActionPerformed

      private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jComboBox1ActionPerformed

/*      public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new Alpha2().setVisible(true);
                  }
            });
      }*/

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JComboBox jComboBox1;
      private javax.swing.JComboBox jComboBox2;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JTextField jTextField1;
      private javax.swing.JTextField jTextField2;
      // End of variables declaration//GEN-END:variables
}
