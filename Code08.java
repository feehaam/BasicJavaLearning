public class Code08 {
      static dis obj1=new dis(1),  obj2=new dis(5), obj3=new dis(10);
      
      public static void main(String args[]) throws InterruptedException{
            System.out.println("Waiting for other threads to be done.");
            obj1.T.join();
            obj2.T.join();
            obj3.T.join();
            System.out.println("Done waiting...");
            System.out.println("Lets try another one!");
            new dis(3).T.join();
      }
}

class dis implements Runnable{
      Thread T=new Thread(this, "NoName");
      int x;
      dis(int x){
            this.x=x;
            T.start();
      }
      @Override
      public void run(){
            for(int i=0; i<5; i++){
                  try {
                        Thread.sleep(300);
                  } catch (InterruptedException ex) { }
                  System.out.println(i*x);
            }
      }
}