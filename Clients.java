import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Clients extends javax.swing.JFrame {
      private ObjectOutputStream output;
      private ObjectInputStream input;
      private String message ="";
      private String serverIP;
      private Socket connection;
      
      public Clients(String host) {
            super("The client side...") ;
            serverIP= host;
            initComponents();
      }
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            chatWindow = new javax.swing.JTextArea();
            jButton1 = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            userText = new javax.swing.JTextArea();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);

            jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
            jLabel1.setText("LAN Messenger");

            chatWindow.setEditable(false);
            chatWindow.setBackground(new java.awt.Color(204, 204, 204));
            chatWindow.setColumns(20);
            chatWindow.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
            chatWindow.setRows(5);
            chatWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));

            jButton1.setBackground(new java.awt.Color(51, 51, 51));
            jButton1.setFont(new java.awt.Font("Footlight MT Light", 1, 48)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("SEND");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            userText.setBackground(new java.awt.Color(255, 255, 255));
            userText.setColumns(20);
            userText.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
            userText.setRows(5);
            userText.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jScrollPane1.setViewportView(userText);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(chatWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 3, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chatWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                              .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String s = userText.getText();
            userText.setText("");
            sendMessage ("C - "+s);
      }//GEN-LAST:event_jButton1ActionPerformed

      public static void main(String args[]) {
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
                  java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        //new Clients().setVisible(true);
                  }
            });
      }

      //connect  to server 
      public void startRunning() {
            try{
                  connectToServer();
                  setupStreams();
                  whileChatting();
            }catch(EOFException eofException){
                  showMessages("\n Client terminated connection");
            }catch(IOException ioException){
                  ioException.printStackTrace();
            }finally{
                  closeCrap();
            }
      }

      //  connect to server 
      private void connectToServer() throws IOException{
            showMessages("Attempting connection.....\n");
            connection= new Socket(InetAddress.getByName (serverIP),6789);
            showMessages("Connected to: " + connection.getInetAddress().getHostName());
        }

       //set up  streams to and receive  message
      private void setupStreams() throws IOException{
            output=new ObjectOutputStream(connection.getOutputStream());
            output.flush();
            input=new ObjectInputStream(connection.getInputStream());
            showMessages("Connection stable.");
        }

      // while chatting with server 
      private void whileChatting() throws IOException{
            ableToType(true);
            do{
                  try{
                        message=(String) input.readObject();
                        showMessages("\n"+message);
                  } catch(ClassNotFoundException  ClassNotfoundException){
                        showMessages("\n I dont know that object type");
                  }
            }while (!message.equals("S - END"));
      }


        // close the streams and sockets
      private void closeCrap(){
            showMessages("\nClosing connection...");
            ableToType(false);
            try{
                  output.close();
                  input.close();
                  connection.close();
            }catch(IOException ioException){
                  ioException.printStackTrace();
            }
      }

        // send message to server 
      private  void sendMessage(String message){
            try{
                  output.writeObject(message);
                  output.flush();
            }catch(IOException ioException){
                  chatWindow.append("\nError sending message!");
            }
      }

       //change/ update chatWindow

      private void showMessages(final String m){
            SwingUtilities.invokeLater(
                  new Runnable(){
                        public void run(){
                              chatWindow.append(m);
                        }
                  }
            );
      }

       //gives user permission to type crap into the text box
      private void ableToType(final boolean tof){
            SwingUtilities.invokeLater(
                  new Runnable(){
                        public void run(){
                              userText.setEditable(tof);
                        }
                  }
            );
      }
      
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JTextArea chatWindow;
      private javax.swing.JButton jButton1;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JTextArea userText;
      // End of variables declaration//GEN-END:variables
}
