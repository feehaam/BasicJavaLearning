public class Code09 {
      public static void main(String args[]) throws InterruptedException{
            new th();
            Thread.sleep(2600);
            System.out.println("\nRunning out of Main function");
      }
}
class th implements Runnable{
      th(){
            Thread T = new Thread(this, "NoName");
            T.start();
      }
      
      public void run() {
            for(int i=1; i<=5; i++)
            {
                  try {
                        Thread.sleep(500);
                  } catch (InterruptedException ex) {}
                  System.out.print(i+" ");
            }
      }
      
}