
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class a extends javax.swing.JFrame {
      int x1=100;
      int y1=100;
      int x2=400;
      int y2=400;
      public a() {
            initComponents();
            
      }
      // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setForeground(new java.awt.Color(51, 51, 51));

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 1881, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 855, Short.MAX_VALUE)
            );

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
                  .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
      }// </editor-fold>                        
      
      public void paint(Graphics g){
            g.draw3DRect(100, 100, 1200,500, false);
            
            Random rand = new Random();
            int i=100,j=100;
            while(j<700)
            try{
                  Thread.sleep(100);
                  if(i<700){
                        i+=20;
                        if(i<600)
                        g.drawLine(100, i, 1300, i);
                        g.drawLine(0, 100, i, 600);
                        g.drawLine(1400, 100, 1400-i, 600);
                  }
                  if(j<700){
                        j+=20;
                        g.drawLine(j, 100, j, 600);
                        g.drawLine(1400-j, 100, 1400-j, 600);
                  }
            } catch (InterruptedException e){}
      }
      public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new a().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify                     
      private javax.swing.JPanel jPanel1;
      // End of variables declaration                   
}
