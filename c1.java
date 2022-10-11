package Lambda;

public class c1 {
      public static void main(String args[]){
            myNumber myNum;
            myNum = ()->55.5;
            
            System.out.println(myNum.getValue());
      }
}

interface myNumber {
      double getValue();
}