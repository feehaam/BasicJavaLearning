package LabReport04;
import java.util.*;
class ABUSEE extends Exception{
      String s;
      ABUSEE(String s){
            this.s=s;
      }
      public String toString(){
            return "Sorry an Abusive word "+s+" has been used.";
      }
}
public class AbuE {
      public static void main(String args[]){
            //I considered some words as abusive which are not actually abusive. Additionally, these words are taken from a cartoon movie called Minion and the language is called Minionese.
            String ab[]={"poing", "booyaa", "papoye", "englando", "islando", "kuh", "gerato", "parabuka"};
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String w=sc.next();
            w=w.toLowerCase();
            for(int i=0; i<ab.length; i++){
                  if(w.equals(ab[i]))
                        try{
                              throw new ABUSEE("");
                        } catch (ABUSEE e) {
                              System.out.println(e);
                        }
            }
      }
}