
import javax.swing.JOptionPane;
import java.io.*;
import java.nio.file.*;
public class Createa extends javax.swing.JFrame {
      public Createa() {
            initComponents();
      }
int xm,ym,xx,yy;
      String s;
      int saveStatus=0;
      
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel2 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jLabel5 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            name = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            bg = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/close1.jpg"))); // NOI18N
            jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel2MouseClicked(evt);
                  }
            });
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 50, 40));

            jButton1.setBackground(new java.awt.Color(153, 153, 153));
            jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jButton1.setText("SAVE");
            jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });
            getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 100, 30));

            jLabel5.setForeground(new java.awt.Color(102, 0, 0));
            jLabel5.setText("Round 555 (Div 2)");
            getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel4.setText("Name should be like:");
            getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

            name.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
            name.setForeground(new java.awt.Color(204, 0, 0));
            name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            name.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 500, 70));

            jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
            jLabel3.setText("Please Enter name of Contest :");
            getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 380, 40));

            bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internal Files/addcbg.jpg"))); // NOI18N
            bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        bgMouseDragged(evt);
                  }
            });
            bg.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        bgMousePressed(evt);
                  }
            });
            getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            s=name.getText();
            File file = new File(Data.dir+"CFNotes\\"+s);
            boolean i = file.mkdir();
            if(i){
                  Data.addcon(s);
                  JOptionPane.showMessageDialog(this, "Addition successfull.");
                  String cl; 
                  cl=" @"+s+"; ";
                  Fileop.Add(Data.dir+"CFNotes\\"+"Conlist.txt", cl);
                  Fileop.Create(Data.dir+"CFNotes\\"+s+"\\Problems.txt");
            }
            else{
                  JOptionPane.showMessageDialog(this, "Contest with same name may already exists!");
            }
            
            Data.showcon();
            Note obj = new Note();
            obj.setVisible(true);
            obj.setmenu();
            setVisible(false);
      }//GEN-LAST:event_jButton1ActionPerformed

      private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            setVisible(false);
            Note obj = new Note();
            obj.setVisible(true);
            obj.setmenu();
      }//GEN-LAST:event_jLabel2MouseClicked

      private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
            xm=evt.getX();
            ym=evt.getY();
      }//GEN-LAST:event_bgMousePressed

      private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
            xx= evt.getXOnScreen();
            yy= evt.getYOnScreen();
            
            this.setLocation(xx-xm, yy-ym);
      }//GEN-LAST:event_bgMouseDragged

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
                  java.util.logging.Logger.getLogger(Createa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Createa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Createa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Createa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new Createa().setVisible(true);
                  }
                  
            });
      }
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel bg;
      private javax.swing.JButton jButton1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JTextField name;
      // End of variables declaration//GEN-END:variables
}
