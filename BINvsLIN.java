package lab3;
/**
 *
 * @author MD.Feeham
 */
public class BINvsLIN {
      static int arr[] = {5, 10, 20, 25, 35, 45, 95, 111, 250, 251, 100101};
      static int c=0;
      
      public static void main(String args[]){
            System.err.println("COMPLEXITY COUNTER RESULTS");
            System.out.println("Best case in Lenear: "+Lin(5));
            c=0;
            System.out.println("Best case in Binary: "+Bin(45, 0, arr.length));
            System.out.println("Average case in Lenear: "+Lin(111));
            c=0;
            System.out.println("Average case in Binary: "+Bin(111, 0, arr.length));
            System.out.println("Worst case in Lenear: "+Lin(0));
            c=0;
            System.out.println("Worst case in Binary: "+Bin(0, 0, arr.length));
      }
      
      static int Lin(int item){
            c=0;
            for(int i=0; i<arr.length; i++){
                  c++;
                  if(item == arr[i])
                        return ++c;
                  else c++;
            }
            return c;
      }
      static int Bin(int item, int b, int e){
            int m = (b+e)/2;
            c++;
            if(arr[m]==item||b>e)
                  return ++c;
            else if(arr[m]>item){
                  c+=2;
                  Bin(item, b, m-1);
            }
            else{
                  c+=3;
                  Bin(item, m+1, e);
            }
            return c;
      }
}
