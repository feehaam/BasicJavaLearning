/**
 *
 * @author MD.Feeham
 */
public class BasicOperationSpeedTester {
      public static void main(String[] args) {
            Tester(10000000);
      }
      
      public static void Tester(int n){
            int temp=0;
            long t1=System.currentTimeMillis();
            for(int i=1; i<n; i++)
                  x();
            for(int i=1; i<n; i++){
                  if(i>0)
                        temp=1;
                  else temp=0;
            }
            for(int i=1; i<n; i++){
                  int trash;
            }
            for(int i=1; i<n; i++){
                  String trash;
            }
            for(int i=1; i<n; i++){
                  Double trash;
            }
            for(int i=1; i<n; i++){
                  temp++;
            }
            
            System.out.println("Total time taken: "+(System.currentTimeMillis()-t1));
      }
      
      public static void x(){
            
      }
}