import java.util.Random;
public class CreateData {
      public static void main(String args[]){
            setAChar();
            String data[][] = new String[100001][2];
            
            for(int i=0; i<data.length; i++){
                  data[i][0] = fixLength(i, 6);
                  data[i][1] = makePassword();
            }
            
            Random r = new Random();
            for(int i=0; i<data.length; i++){
                  String temp1 = data[i][0], temp2 = data[i][1];
                  int pos = r.nextInt(100001);
                  data[i][0] = data[pos][0];
                  data[i][1] = data[pos][1];
                  data[pos][0] = temp1;
                  data[pos][1] = temp2;
            }
            
            String intoTheFile = "";
            for(int j=0; j<333; j++){
                  for(int i=j*333; i<j*333+333 && i<data.length; i++)
                        intoTheFile += data[i][0]+"\n"+data[i][1]+"\n";
                  FFiles.addTo("F:\\dt\\data.txt", intoTheFile);
                  intoTheFile = "";
            }
      }
      
      static char chars[] = new char[62];
      static String makePassword(){
            Random r = new Random();
            
            String pas = "";
            int len = ((r.nextInt(8)+8));
            for(int i=0; i<len; i++)
                  pas += chars[r.nextInt(62)];
            
            return pas;
      }
      
      static void setAChar(){
            for(int i=0; i<10; i++)
                  chars[i] = (char) (i+48);
            
            for(int i=10; i<36; i++)
                  chars[i] = (char) (i+55);
            
            for(int i=36; i<62; i++)
                  chars[i] = (char) (i+61);
      }
      
      static String fixLength(int number, int len){
            String fixedNum = String.valueOf(number);
            while(fixedNum.length()<len)
                  fixedNum = "0" + fixedNum;
            
            return fixedNum;
      }
}