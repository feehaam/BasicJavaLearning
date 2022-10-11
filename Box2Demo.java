class Box2Demo {   public static void main(String args[]) 
{     
     Box2 mybox1 = new Box2(10, 20, 15);     
     Box2 mybox2 = new Box2(3, 6, 9); 
     
     double vol; 
     
     vol = mybox1.volume();     System.out.println("Volume is " + vol); 
     vol = mybox2.volume();     System.out.println("Volume is " + vol);   
}
}