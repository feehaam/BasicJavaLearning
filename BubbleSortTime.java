package lab01;
import java.util.Arrays;
import java.util.Random;
public class BubbleSortTime {
      public static void main(String args[]){
            Random rand = new Random();
            int arr[] = new int[20000];
            String s = "";
            for(int i=0; i<20000; i++){
                  Integer x = rand.nextInt(100000);
                  arr[i] = x;
                  s+= x.toString() + "\n";
            }
            FFiles.create("F:\\Input 20k.txt");
            FFiles.create("F:\\Input 20k sorted.txt");
            FFiles.changeData("F:\\Input 20k.txt", s);
            long time = System.currentTimeMillis();
            //Bubble sort...
            for(int i=0; i<arr.length; i++){
                  for(int j = 0; j<arr.length-1; j++){
                        if(arr[j]>arr[j+1]){
                              int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
                        }
                  }
            }
            time = System.currentTimeMillis() - time;
            s = "";
            for(int i=0; i<arr.length; i++){
                  Integer x = arr[i];
                  s+= x.toString() + "\n";
            }
            FFiles.changeData("F:\\Input 20k sorted.txt", s);
            System.out.println(time);
      }
}
