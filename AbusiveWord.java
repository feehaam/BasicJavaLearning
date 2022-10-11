import java.util.*;
class AbusiveWordException extends Exception{
      String s;
      AbusiveWordException(String s){
            this.s=s;
      }
      public String toString(){
            return "an abusive word "+s+" has been used.";
      }
}
public class AbusiveWord {
      public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
      //Real abusive words can corrupt environment of code.
      //So I used some self made word and considered these as abusive-word.
      String abusiveList[]={"abc", "def", "ghi", "jkl", "mno", "pqr"};
      
            boolean msg=true;
            String m=sc.nextLine();
            for(int i=0; i<abusiveList.length; i++){
                  if(m.toLowerCase().contains(abusiveList[i])){
                        try{
                              throw new AbusiveWordException(abusiveList[i].charAt(0)+"***");
                        } catch (AbusiveWordException e) {
                              msg=false;
                              System.out.println("Sorry, unable to send message! \nBecause "+e);
                        }
                  }
            }
            if(msg)
                  message(m);
      }
      static void message(String m){
            System.out.println("New message: ");
            System.out.println(m);
      }
            
}