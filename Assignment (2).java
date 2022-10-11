public class Assignment {
      public static void main(String args[]){
            Rectangle r1=new Rectangle(10,10);
            Rectangle r2=new Rectangle(2,10);
            Triangle t1=new Triangle(55,20);
            Triangle t2=new Triangle(55,20);
            
            int res;
            res=r1.compareTo(r2);
            System.out.println("Received returned value: "+res);
            if(res<0) System.out.println("Area of invoking Rectangle is smaller than passed one.");
            else if(res>0) System.out.println("Area of invoking Rectangle is larger than passed one.");
            else System.out.println("Area of both Rectangle are Equal.");
            
            res=t1.compareTo(t2);
            System.out.println("Received returned value: "+res);
            if(res<0) System.out.println("Area of invoking Triangle is smaller than passed one.");
            else if(res>0) System.out.println("Area of invoking Triangle is larger than passed one.");
            else System.out.println("Area of both Triangle are Equal.");
      }
}
abstract class Figure{
      double dim1;
      double dim2;
      Figure(double a, double b){
            dim1=a;
            dim2=b;
      }
      abstract double area();
      abstract int compareTo(Figure s);
}
class Rectangle extends Figure{
      Rectangle(double a, double b){
            super(a,b);
      }
      @Override
      double area() {
            //System.out.println("Inside Area for Rectangle.");
            return dim1*dim2;
      }
      @Override
      int compareTo(Figure s) {
            //System.out.println("Inside Rectangle comparing method.");
            if(area()>s.area())
                  return 1;
            else if(area()<s.area())
                  return -1;
            else return 0;
      }
}
class Triangle extends Figure{
      Triangle(double a, double b){
            super(a,b);
      }
      @Override
      double area() {
            //System.out.println("Inside Area for Triangle.");
            return dim1*dim2/2;
      }
      @Override
      int compareTo(Figure s) {
            //System.out.println("Inside Triangle comparing method.");
            if(area()>s.area())
                  return 1;
            else if(area()<s.area())
                  return -1;
            else return 0;
      }
      
}