public class Code05 {
      public static void main(String args[]) throws InterruptedException{
            new NewThread2();
                  for(int i=1; i<5; i++){
                        System.out.println("Main thread: "+i);
                        Thread.sleep(1000);
                  }
      }
}

class NewThread2 implements Runnable{
      Thread t;
      NewThread2(){
            t=new Thread(this,"Demo Thread");
            System.out.println("Child Thread: "+t);
            t.start();
      }
      @Override
      public void run(){
                  for(int i=1; i<5; i++){
                        System.out.println("Child Thread: "+i); try { 
                        Thread.sleep(505); } catch (InterruptedException ex) {} } 
                  
            System.out.println("Exiting child thread.");
      }
      
}