import java.util.Arrays;
import java.util.Scanner;

public class CF220621 {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0; i<t; i++){
                  int n = sc.nextInt();
                  int arr[] = new int[n];
                  int b = Integer.MIN_VALUE;
                  int s = Integer.MAX_VALUE;
                  for(int j=0; j<n; j++){
                        arr[j] = sc.nextInt();
                        if(arr[j] > b)
                              b = arr[j];
                        if(arr[j] < s)
                               s = arr[j];
                  }
                  int x = 0, y=0, z=-1;
                  for(int k=0; k<arr.length; k++)
                        if(arr[k] == s){
                              y=k+1;
                              break;
                        }
                  for(int k=arr.length-1; k>=0; k--)
                        if(arr[k] == s){
                              z=arr.length-k;
                              break;
                        }
                  x = Integer.min(y, z);
                  if(z!=-1)
                        Arrays.copyOfRange(arr, x, arr.length);
                  else 
                        Arrays.copyOfRange(arr, x, arr.length);
                  for(int f: arr)
                        System.out.print(f);
                  System.out.println(x);
            }
      }
}
