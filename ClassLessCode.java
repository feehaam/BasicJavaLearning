import java.util.Scanner;
public class ClassLessCode {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the IP address");
            String IP = sc.nextLine();
            
            String bin ="";
            int beg = 0;
            for(int i=0; i<IP.length(); i++){
                  if(IP.charAt(i) == '.' || IP.charAt(i) == '/'){
                        int n = Integer.parseInt(IP.substring(beg, i));
                        bin += formBin(n);
                        beg = i+1;
                  }
            }
            bin = bin.substring(0, bin.length()-1);
            System.out.println("IP In binary: "+bin);
            
            int res = Integer.parseInt(IP.substring(IP.indexOf("/")+1, IP.length()));
            
            long netN = (new Double(Math.pow(2, res) - 2.0)).longValue();
            long netH = (new Double(Math.pow(2, (32-res)) - 2.0)).longValue();
            
            System.out.println("Number of hosts: "+Integer.parseInt(String.valueOf(netH)));
            System.out.println("Number of networks: "+Integer.parseInt(String.valueOf(netN)));
      }
      static String formBin(int n){
            String bin = Integer.toBinaryString(n);
            while(bin.length()<8)
                  bin = "0" + bin;
            bin += ".";
            return bin;
      }
}