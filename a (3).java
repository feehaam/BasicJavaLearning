package Enum;

/****************************
 *                VERY BASICS               *
****************************/

//Defining enum: always public static final
enum bazar {
      Rice, Potato, Onion, Oil, Egg, Beaf, Chicken, Fish, Suger, Salt
}

class Practice {
      //Creating enum object
      bazar B = bazar.Egg;
      
      void uses(){
            // [if] using enum
            if(B == bazar.Egg)
                  B = bazar.Oil;
            
            // [switch] using enum
            switch(B){
                  case Egg: //...........;
                  case Onion: //...........;
                  case Beaf: //...........;
                  case Fish: //...........;
            }
            
            //The values( ) method returns an array that contains a list of the enumeration constants. 
            for(bazar B : bazar.values())
                  System.out.println(B);
            //another one
             bazar bs[] = bazar.values();     
             for(bazar a : bs)       
                   System.out.println(a); 
             
             //valueOf( ) method returns the enumeration constant whose value corresponds to the 
             //string passed in str.  In both cases, enum-type is the type of the enumeration
             B = bazar.valueOf("Egg");
             System.out.println("Printing B: " + B);
      }
}


/************************************************
 *                   CONSTRUCTOR AND VARIABLES                  *
*************************************************/

enum bazar2{
      //Defining enum bazar2 with values.
       Rice(55.0, 5), Potato(22.0, 5), Onion(2), Oil(90.02), Egg(10.0, 12), Beaf(500.0, 1), Chicken(120.0), Fish, Suger(), Salt(20.0, 2);
       
       //Defining enum variables.
       private Double price;
       private int quantity;
       
       //Constructor 1 for no value. Example: Fish, Suger()
       bazar2(){
             price = 0.00;
             quantity = 0;
       }
       
       //Constructor 2 for only price given
       bazar2(Double x){
             price = x;
             quantity = 0;
       }
       
       //Constructor 3 for only quantity given
       bazar2(int y){
             price = 0.0;
             quantity = y;
       }
       
       //Constructor 4 for both value given
       bazar2(Double x, int y){
             price = x;
             quantity = y;
       }
       
       //Four different get and set methods.
       void setPrice(Double x){
             price = x;
       }
       void setQuantity(int x){
             quantity = x;
       }
       Double getPrice(){
             return price;
       }
       int getQuantity(){
             return quantity;
       }
}
class Practice2{
      int totalCost = 0;
      void uses(){
            bazar2 B;
            System.out.println("\n\nPrinting bazar2 values");
            for(bazar2 B2 : bazar2.values())
                  System.out.println(B2);
            
            System.out.println("\nPrinting bazar2 details from loop");
            bazar2 B3[] = bazar2.values();
            for(int i=0; i<B3.length; i++){
                  B = B3[i];
                  System.out.println("Name: "+B.toString()+", Price: "+B.getPrice()+", Quantity: "+B.getQuantity()+", Cost: "+B.getPrice()*B.getQuantity());
                  totalCost += B.getPrice();
            }
            System.out.println("Total price: "+totalCost);
      }
}

/************************************************
 *             SOME MORE BUILT-IN METHODS               *
*************************************************/

      //WILL BE REUSING bazar ENUM HERE

class Practice3{
      
      bazar B1 = bazar.Beaf, B2 = bazar.Egg, B3 = bazar.Beaf;      
      
      void uses(){
            System.out.println("\n\nUsing some built in methods.");
            
            //We can obtain a value that indicates an enumeration constant’s position in the list of constants. 
            //This is called its ordinal value, and it is retrieved by calling the ordinal( ) method
            System.out.println("Position of B1 is: "+B1.ordinal());
            System.out.println("Position of B2 is: "+B2.ordinal());
            
            //Using compareTo() method can compare positions of enum constraints
            //If equal returns 0, If index higher: 1, If index lower: -1
            System.out.println(B1.compareTo(B2));
            System.out.println(B1.compareTo(B3));
            System.out.println(B2.compareTo(B1));
      }
      
}

/************************************************
 *                  Q&A PROBLEM FROM BOOK                  *
*************************************************/
//An easier version than book

enum ans{
      YES, NO, MAYBE, LATER, SOON, NEVER
}
class Practice4{
      
      void uses(){
            int x = 50;
            ans A;
            A = getAns(x);
            System.out.println(A.toString());
      }
      
      
      ans getAns(int x){
            if(x<10)
                  return ans.NEVER;
            else if(x<30)
                  return ans.NO;
            else if(x<50)
                  return ans.LATER;
            else if(x<60)
                  return ans.MAYBE;
            else if(x<80)
                  return ans.SOON;
            else 
                  return ans.YES;
      }
}

class a{
      public static void main(String args[]){
            Practice prac = new Practice();
            prac.uses();
            
            Practice2 prac2 = new Practice2();
            prac2.uses();
            
            Practice3 prac3 = new Practice3();
            prac3.uses();
            
            Practice4 prac4 = new Practice4();
            prac4.uses();
      }
}