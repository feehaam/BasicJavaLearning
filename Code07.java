public class Code07 implements Runnable{
      String name;
      Thread t; 
 
      Code07(String threadname) {     
            name = threadname;     
            t = new Thread(this, name);     
            System.out.println("New thread: " + t);     
            t.start();
       } 
  
  public void run() {     try {       for(int i = 5; i > 0; i--) {         System.out.println(name + ": " + i);         Thread.sleep(1000);       }     } catch (InterruptedException e) {       System.out.println(name + " interrupted.");     }     System.out.println(name + " exiting.");   } 
}

class DemoJoin {   
      public static void main(String args[]) {     
            Code07 ob1 = new Code07("One");
            Code07 ob2 = new Code07("Two");     
            Code07 ob3 = new Code07("Three"); 
            
             System.out.println("Thread One is alive: "                         + ob1.t.isAlive());     
             System.out.println("Thread Two is alive: "                         + ob2.t.isAlive());     
             System.out.println("Thread Three is alive: "                         + ob3.t.isAlive());   
             
             try {       
                   System.out.println("Waiting for threads to finish.");       
                   ob1.t.join();       
                   ob2.t.join();       
                   ob3.t.join();     
             } catch (InterruptedException e) {       
                   System.out.println("Main thread Interrupted");     
             }
             
             System.out.println("Thread One is alive: "                         + ob1.t.isAlive());     
             System.out.println("Thread Two is alive: "                         + ob2.t.isAlive());     
             System.out.println("Thread Three is alive: "                         + ob3.t.isAlive()); 
 
            System.out.println("Main thread exiting."); 
      }
}
