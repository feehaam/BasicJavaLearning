package LabReport04;
public class AE {
      public static void main(String args[]){
            int a=0;
            int b=5;
            int c;
            try {
                  c=b/a;
            } catch (ArithmeticException e) {
                  System.out.println("A mathematical error occred!");
                  c=0;
            }
            System.out.println("Now c = "+c);
      }
}
