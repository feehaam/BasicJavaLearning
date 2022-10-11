class Box 
{   
      double width;   
      double height;  
      double depth; 

      void volume() 
      {     
            System.out.print("Volume is ");     
            System.out.println(width * height * depth);   
      } 
      double volcount()
      {
            return width * height * depth;
      }
      void setvalues(double w, double h, double d)
      {
             width = w;     height = h;     depth = d; 
      }
}
