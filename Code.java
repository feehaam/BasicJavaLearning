package lab02;
import java.util.Random;
public class Code {
            static Random rand = new Random();
      public static void main(String args[]){
            DOIT(1000);
            DOIT(10000);
            DOIT(100000);
      }
      static void DOIT(int in){
            int arr[] = new int[in];
            for(int i=0; i<in; i++){
                  Integer x = rand.nextInt(1000000);
                  arr[i] = x;
            }
            System.out.print("Original array (randomly generated):");
            for(int x: arr)
                  System.out.print("  "+x);
           
            long timeForSelection = System.currentTimeMillis();
            new selection(arr);
            timeForSelection = System.currentTimeMillis() - timeForSelection; 
            
            long timeForInsertion = System.currentTimeMillis();
            new insertion(arr);
            timeForInsertion = System.currentTimeMillis() - timeForInsertion;
            
            System.out.println("\nTOTAL TIME TAKEN BY INSETION SORT  FOR "+in+" inputs: "+timeForInsertion+" ms.");
            System.out.println("TOTAL TIME TAKEN BY SELECTION SORT FOR "+in+" inputs: "+timeForSelection+" ms."+"\n");
      }
}
class selection{
      selection(int [] arr){
            int min, loc;
            for(int i=0; i<arr.length; i++){
                  min = arr[i];
                  loc = i;
                  for(int j=i; j<arr.length; j++)
                        if(arr[j]<min) {
                              loc = j;
                              min = arr[j];
                        }
                  int temp = arr[i];
                  arr[i] = min;
                  arr[loc] = temp;
            }
            System.out.print("\nArray after selection sort:");
            for(int x: arr)
                  System.out.print("  "+x);
      }
}
class insertion{
      insertion(int [] arr){
            for(int i=1; i<arr.length; i++){
                  for(int j = i; j>0 && arr[j-1]>arr[j]; j--){
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                  }
            }
            System.out.print("\nArray after insertion sort:");
            for(int x: arr)
                  System.out.print("  "+x);
      }
}           