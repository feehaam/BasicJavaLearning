package Generics;
public class Code7 {
      
}
class GenSup<T> {
      T ob;
      GenSup(T o) {
            ob = o;
       }
      // Return ob.
      T getob() {
            return ob;
      }
}
// A subclass of Gen.
class Gen2<SubT> extends GenSup<SubT> {
      Gen2(SubT o) {
            super(o);
      }
}