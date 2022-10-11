public class Code04 {
      public static void main(String args[]){
            new NewThread();
            try{
                  for(int i=1; i<5; i++){
                        System.out.println("Main thread: "+i);
                        Thread.sleep(1000);
                  }
            } catch(InterruptedException e) {
                  System.out.println("Main got interrupted!");
      }
            System.out.println("Main thread exited.");
}
}
class NewThread implements Runnable{
      Thread t;
      NewThread(){
            t=new Thread(this,"Demo Thread");
            System.out.println("Child Thread: "+t);
            t.start();
      }
      @Override
      public void run(){
            try{
                  for(int i=1; i<5; i++){
                        System.out.println("Child Thread: "+i);
                        Thread.sleep(505);
                  } 
            } catch(InterruptedException e) {
                  System.out.println("Child Interrupted!");
            }
            System.out.println("Exiting child thread.");
      }
      
}
//A better to understand version of this program is written in Code05