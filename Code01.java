public class Code01 {
      public static void main(String args[]){
            Thread t;
            t=Thread.currentThread();
            System.out.println("Current thread: "+t);
            
            t.setName("My thread");
            System.out.println("After change: "+t);
            
            try{
                  for(int n=5; n>0; n--){
                        System.out.println(n);;
                        Thread.sleep(1000);
                  } 
            } catch (InterruptedException e) {
                  System.out.println("Main thread is interrupted!");
            }
      }
}
