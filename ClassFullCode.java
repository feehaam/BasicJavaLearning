import java.util.Scanner;
public class ClassFullCode {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the IP address");
            String IP = sc.nextLine()+".", bin ="";
            int beg = 0;
            for(int i=0; i<IP.length(); i++){
                  if(IP.charAt(i) == '.'){
                        int n = Integer.parseInt(IP.substring(beg, i));
                        String B = Integer.toBinaryString(n);
                        while(B.length()<8)
                              B = "0" + B;
                        bin += B+".";
                        beg = i+1;
                  }
            }
            System.out.println("IP In binary: "+bin.substring(0, bin.length()-1));
            
            if(bin.startsWith("1111")) print(4, 'E');
            else if(bin.startsWith("1110")) print(4, 'D');
            else if(bin.startsWith("110")) print(24, 'C');
            else if(bin.startsWith("10")) print(16, 'B');
            else print(8, 'A');
      }
      static void print(int n, char c){
            Long N = (new Double(Math.pow(2, n))).longValue()-2;
            Long H = (new Double(Math.pow(2, (32-n)))).longValue()-2;
            System.out.println("Class: "+c+"\nNumber of networks: "+N+"\nNumber of hosts: "+H);
      }     }