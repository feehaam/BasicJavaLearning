package Generics;
class genThree<A, B, C>{
      A oba;
      B obb; 
      C obc;
      genThree(A oba, B obb, C obc){
            this.oba = oba;
            this.obb = obb;
            this.obc = obc;
      }
      A getA(){
            return oba;
      }
      B getB(){
            return obb;
      }
      C getC(){
            return obc;
      }
      void mulA(){
            //System.out.println(oba*oba); error
      }
      void disType(Object o){
            System.out.println(o.getClass().getName());
      }
      void disType(){
            System.out.println("Type of A is " +
            oba.getClass().getName());
            System.out.println("Type of B is " +
            obb.getClass().getName());
            System.out.println("Type of C is " +
            obc.getClass().getName());
      }
}
public class Code3 {
      public static void main(String[] args) {
            genThree<String, Double, Integer> O = new genThree<String, Double, Integer>("Feeham", 99.2, 22);
            O.disType(O);
            O.disType();
            
            String s = O.getA();
            double d = O.getB();
            int i = O.getC();
            
            System.out.println(
                    s
            +"\n"+
                    d
            +"\n"+
                    i);
            
            genThree<Integer, String, String> O2 = new genThree<>(5, "Yeasar", "Shartaz");
            O2.disType(O2);
            O2.disType();
            
            System.out.println(O2.getA());
            System.out.println(O2.getB());
            System.out.println(O2.getC());
            
            O2.mulA();
      }
}
