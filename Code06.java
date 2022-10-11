public class Code06 {
      public static void main(String args[]) throws InterruptedException{
            new NewThread3();
                  for(int i=1; i<5; i++){
                        System.out.println("Main thread: "+i);
                        Thread.sleep(1000);
                  }
      }
}

class NewThread3 extends Thread{
      NewThread3(){
            super("Demo Thread");
            System.out.println("Child Thread: "+this);
            start();
      }
      
      public void run(){
            try {
                  for(int i=1; i<5; i++){
                        System.out.println("Child Thread: "+i);
                        Thread.sleep(500);
                  }
            } catch(InterruptedException e){
                  
            }
            System.out.println("Exiting child thread.");
      }
}
