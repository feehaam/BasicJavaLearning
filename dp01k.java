import java.util.Scanner;
public class dp01k {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int item, capacity, p[][] = new int[100][100], item_weight[]=new int[100], item_price[]=new int[100];
            System.out.println("Total Items: ");
            item = sc.nextInt();
            //System.out.println("Container capacity: ");
            capacity = sc.nextInt();
            
            for(int i=0; i<item; i++){
                  //System.out.println("Enter item "+(i+1)+" wt: ");
                  item_weight[i] = sc.nextInt();
                  //System.out.println("Enter item "+(i+1)+" price: ");
                  item_price[i] = sc.nextInt();
            }
            
            for(int i=0; i<=capacity; i++)
                  p[0][i] = 0;
            for(int i=0; i<=item; i++)
                  p[i][0] = 0;
            
            for(int i=1; i<=item; i++)
                  for(int j=1; j<=capacity; j++){
                        if(item_weight[i-1]<=j){
                              int x = item_weight[i-1];
                              int q = item_price[i-1] + p[i-1][j-x];
                              int r = p[i-1][j];
                              p[i][j] = max(q,r);
                              if(p[i][j]==q){
                                    System.out.println("Took item: "+i);
                              }
                        }
                        else
                              p[i][j] = p[i-1][j];
                  }
            System.out.println("\n\nProfit: "+p[item][capacity]);
      }
      
      static int max(int a, int b){
            if(a>b)
                  return a;
            else return b;
      }
}
