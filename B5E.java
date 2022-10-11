package LabReport04;
class UDE extends Exception{
      String s;
      UDE(String s){
            this.s=s;
      }
      public String toString(){
            return "Error: "+s;
      }
}
public class B5E {
      public static void main(String args[]){
            for(int i=1; i<11; i++){
                  try{
                        if(i==5){
                              throw new UDE("Black 5");
                        } else {
                              System.out.println(100/i);
                        }
                  } catch(UDE exp) {
                        System.out.println(exp);
                  }
            }
      }
}
