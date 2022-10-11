package Generics;

class Gen<Type>{
      Type obj;
      
      Gen(Type x){
            obj = x;
      }
      
      Type getItem(){
            return obj;
      }
      
      void disType(){
            System.out.println(obj.getClass().getName());
      }
}
public class Code1 {
      public static void main(String[] args) {
            Gen<Integer> obj1 = new Gen<Integer> (10);
            //Gen<int> obj12 = new Gen<int> (10); error!!
            Gen<Double> obj2 = new Gen<Double> (10.0);
            Gen<String> obj3 = new Gen<String> ("Feeham");

            System.out.println("Value: "+obj1.getItem());
            obj1.disType();
            
            System.out.println("Value: "+obj2.getItem());
            obj2.disType();
            
            System.out.println("Value: "+obj2.getItem());
            obj2.disType();
            
            System.out.println("Value: "+obj3.getItem());
            obj3.disType();
            
//            obj1 = obj2;
//            obj3 = obj2;
//            Both error, although both are object of same class!!!
      }
}