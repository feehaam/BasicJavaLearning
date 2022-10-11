public class Code03 {
      public static void main(String args[]){
            String s="Hello, Mr. Annonymous! \nWelcome to our website! And happy teaming!";
            for(int i=0; i<s.length(); i++){
                  try{
                        Thread.sleep(100);
                  System.out.println(s.charAt(i));
                  } catch(InterruptedException e) {
                        System.out.println("Error occured!");
                  }
            }
      }
}
