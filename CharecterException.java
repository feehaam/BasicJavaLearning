import java.util.Scanner;
public class CharecterException extends Exception{
      int c;
      CharecterException(int i){
            c=i;
      }
      public String toString(){
            return c+" is not in the range of Alphabets!";
      }
}
class MyExceptoin{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number of which, you want to see charecter value.");
            System.out.println("[Alphabets only]");
            int n=sc.nextInt();
            if((n>='a'&&n<='z') || (n>='A'&&n<='Z'))
                  System.out.println(n+" represents: "+(char) n);
            else try{
                  throw new CharecterException(n);
            } catch(CharecterException e){
                  System.out.println("Error occured: "+e);
            }
      }
}