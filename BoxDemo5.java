public class BoxDemo5 {
        public static void main(String args[]) 
        {     
              Box mybox1 = new Box();     
              Box mybox2 = new Box();     
              double vol; 
              
            mybox1.setvalues(10, 20, 15);     
            mybox2.setvalues(3, 6, 9); 

            vol = mybox1.volcount();     
            System.out.println("Volume is " + vol); 
            vol = mybox2.volcount();    
            System.out.println("Volume is " + vol);   
        }
}
