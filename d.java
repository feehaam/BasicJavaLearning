
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MD.Feeham
 */
public class d extends javax.swing.JFrame {

      /**
       * Creates new form d
       */
      public d() {
            initComponents();
      }
      
      public void paint(Graphics g){
            g.fill3DRect(0, 0, 5000, 5000, false);
            g.setColor(Color.white);
            try{
                  for(int j=0; j<900; j+=10){
                        if(j%20==0)
                        for(int i=0; i<1930; i+=10){
                              if(i%20==0){
                                    Thread.sleep(1);
                                    if(i%7==0)
                                          g.setColor(Color.orange);
                                    else if (i%6==0)
                                          g.setColor(Color.green);
                                    else if (i%5==0)
                                          g.setColor(Color.orange);
                                    else if (i%4==0)
                                          g.setColor(Color.darkGray);
                                    else if (i%3==0)
                                          g.setColor(Color.yellow);
                                    else 
                                          g.setColor(Color.white);
                                    g.fill3DRect(i,j,10,10,false);
                              }
                        }
                  }
            } catch(InterruptedException e){}
            g.setColor(Color.white);
            try{
                  for(int j=0; j<1000; j+=40){
                        if(j%20==0)
                        for(int i=0; i<1930; i+=40){
                              if(i%20==0){
                                    Thread.sleep(1);
                                    g.fill3DRect(i,j,10,10,false);
                              }
                        }
                  }
            } catch(InterruptedException e){}
            
            g.setColor(Color.blue);
            try{
                  for(int j=0; j<1000; j+=50){
                        if(j%20==0)
                        for(int i=0; i<1930; i+=50){
                              if(i%20==0){
                                    Thread.sleep(1);
                                    g.fill3DRect(i,j,10,10,false);
                              }
                        }
                  }
            } catch(InterruptedException e){}
            
            g.setColor(Color.darkGray);
            try{
                  for(int j=0; j<1000; j+=60){
                        if(j%20==0)
                        for(int i=0; i<1930; i+=60){
                              if(i%20==0){
                                    Thread.sleep(1);
                                    g.fill3DRect(i,j,10,10,false);
                              }
                        }
                  }
            } catch(InterruptedException e){}
            
            g.setColor(Color.cyan);
            try{
                  for(int j=0; j<1000; j+=80){
                        if(j%20==0)
                        for(int i=0; i<1930; i+=80){
                              if(i%20==0){
                                    Thread.sleep(1);
                                    g.fill3DRect(i,j,10,10,false);
                              }
                        }
                  }
            } catch(InterruptedException e){}
            
            g.setColor(Color.black);
            try{
                  for(int j=0; j<1000; j+=40){
                        if(j%20==0)
                        for(int i=0; i<1930; i+=40){
                              if(i%20==0){
                                    Thread.sleep(1);
                                    g.fill3DRect(i,j,10,10,false);
                              }
                        }
                  }
            } catch(InterruptedException e){}
            
            g.setColor(Color.white);
            try{
                  for(int j=0; j<1000; j+=40){
                        if(j%20==0)
                        for(int i=0; i<1930; i+=40){
                              if(i%20==0){
                                    Thread.sleep(1);
                                    g.fill3DRect(i,j,10,10,false);
                              }
                        }
                  }
            } catch(InterruptedException e){}
            
            g.setColor(Color.red);
            try{
                  for(int j=0; j<1000; j+=40){
                        if(j%20==0)
                        for(int i=0; i<1930; i+=40){
                              if(i%7==0){
                                    Thread.sleep(1);
                                    g.fill3DRect(i,j,10,10,false);
                              }
                        }
                  }
            } catch(InterruptedException e){}
            
      }
      
      
      
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 1858, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 862, Short.MAX_VALUE)
            );

            pack();
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
                  java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new d().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      // End of variables declaration//GEN-END:variables
}
