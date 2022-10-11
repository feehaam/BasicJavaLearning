public class Directob {
      double h, w, d, v;
      Directob(){
            System.out.println("Sizzzze of box is not declared!");
      }
      Directob(double h, double w, double d)
      {
            this.h=h;
            this.d=d;
            this.w=w;
            v=h*d*w;
            System.out.println("Volube of the box is: "+v);
      }
      void welcome(){
            System.out.println("Welcome to the test code of creating a direct object without a pointer!");
      }
}
