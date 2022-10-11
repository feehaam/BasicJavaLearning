package ProjectAlpha;
public class AAAAAAA {
      static String i;
     
      public static void main(String[] args) {
            bb temp = new bb("ok");
            System.out.println(i);
            temp.setVisible(true);
            bb temp2 = new bb(i);
            temp2.setVisible(true);
      }
      
public static class bb extends javax.swing.JFrame {
public int o;
      public bb() {
            initComponents();
      }
      public bb(String x) {
            initComponents();
            jLabel1.setText(x);
            i="from bb";
      }
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setBackground(new java.awt.Color(153, 153, 0));
            jLabel1.setText("Show Data");

            jButton1.setText("Exit");
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
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(171, Short.MAX_VALUE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(263, 263, 263))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton1)
                        .addContainerGap(143, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>                        

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
            setVisible(false);
      }                                        

      // Variables declaration - do not modify                     
      private javax.swing.JButton jButton1;
      private javax.swing.JLabel jLabel1;
      // End of variables declaration
}

}
