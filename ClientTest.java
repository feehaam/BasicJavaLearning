import javax.swing.JFrame;
public class ClientTest {
      public static void main (String[]args){
            Clients con;
            con=new Clients ("127.0.0.1");
            con.setVisible(true);
            con.startRunning();
      }
}