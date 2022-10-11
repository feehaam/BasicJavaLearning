import java.util.Scanner;
public class CRC {
      static Scanner sc = new Scanner(System.in);  
      static String in, s, ss="", div, rem="", out;  
      public static void main(String[] args) {
            s = in =  sc.next();  
            div = sc.next(); 
            int n = div.length()-1; 
            while(n-->0) s+="0"; 
            System.out.println("Modified data: "+s);
            crcbit();
            System.out.println("Data send: "+out+"\n");
            
            while(!out.endsWith("000")){
                  ss=""; rem="";
                  n = div.length()-1;
                  s = in = out;
                  while(n-->0) s+="0"; 
                  System.out.println("Modified data: "+s);
                  crcbit();
                  System.out.println("Data send: "+out);
            }
            System.out.println("\nCRC bit is 000,  it is done.");
      }
      
      static void crcbit(){
            while(rem.startsWith("0"))                                                                                                                                                                                             
                  ss = rem = rem.replaceFirst("0", "");           
            if(ss.length()+s.length()<div.length()){                                                                                                                                                                                             
                  while(rem.length()<div.length()-1)                                                                                                                                                                                             
                        rem = "0"+rem;                                                                                                                                                                                             
                  out = in+rem;   
                  System.out.println("CRC bit: "+rem);
                  return;                                                                                                                                                                                             
            }  
            rem = "";                                                                                                                                                                                             
            while(ss.length()<div.length()){                                                                                                                                                                                             
                  ss+=String.valueOf(s.charAt(0));                                                                                                                                                                                             
                  s = s.substring(1);
            }
            for(int i=0; i<div.length(); i++)
                  if(div.charAt(i)==ss.charAt(i)) rem+= "0";
                  else rem+="1";
            crcbit();
}     }