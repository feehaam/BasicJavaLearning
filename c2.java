package Lambda;
public class c2 {
      public static void main(String args[])
      {
            MyNumber myNum;    
            // Here, the lambda expression is simply a constant expression.
            myNum = () -> 123.45;
            System.out.println("A fixed value: " + myNum.getValue());
            
            // Here, a more complex expression is used.
            myNum = () -> Math.random() * 100;
            System.out.println("A random value: " + myNum.getValue());
            
            System.out.println("Another random value: " + myNum.getValue());
                                                      // A lambda expression must be compatible with the method
                                                      // defined by the functional interface. Therefore, this won't work:
                                                      // myNum = () -> "123.03"; // Error!
      }
}
                                                      // Demonstrate a simple lambda expression.
                                                      // A functional interface.
interface MyNumber {
      double getValue();
}