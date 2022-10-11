public class Code02 {
      public static void main(String args[]) {
            try{
                  funa();
                  //To call fun have to either use try catch or add "function throws exception"
            } catch(Exception e){
                  System.out.println("Error");
            }
            funb();
      }
      
      private static void funa() throws InterruptedException{
            for(int i=1; i<=10; i++){
                  Thread.sleep(1000);
                  System.out.println(i);
            }
      }
      
      private static void funb(){
            for(int i=1; i<=10; i++){
                  try{
                        Thread.sleep(1000);
                        System.out.println(i);
                  } catch(InterruptedException e){
                        System.out.println("Error!");
                  }
            }
      }
}
