public abstract class Area {
      final double pi=3.1416;
      abstract double area(double x);
      abstract double area(double x, double y);
}

class AreaOfCircle extends Area{

      @Override
      double area(double x) {
            return pi*x*x;
      }

      @Override
      double area(double x, double y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }
}

class AreaOfRec extends Area{
      @Override
      double area(double x){
            return 0;
      }
      @Override 
      double area(double x, double y){
            return x*y;
      }
}