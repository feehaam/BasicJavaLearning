class Box2 
{   
      double width;   double height;   double depth; 
      
      Box2(double w, double h, double d) 
      {     
            width = w;     height = h;     depth = d;   
      } 

      double volume()
      {     
            return width * height * depth;   
      } 
} 