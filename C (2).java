package dataComProject;
import java.net.*;  
import java.io.*;  
import java.util.Scanner;
class C{  
      public static void main(String args[])throws Exception{  
            doit(); 
     }
      static void doit() throws Exception{
            Scanner sc = new Scanner(System.in);
            Socket s=new Socket("localhost",3333);  
            DataInputStream din=new DataInputStream(s.getInputStream());  
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  

            String str="",str2="";  
            while(!str.equals("stop")){  
                  str=sc.nextLine();
                  dout.writeUTF(str);  
                  dout.flush();  
                  str2=din.readUTF();  
                  System.out.println("Server says: "+str2);  
            }  

            dout.close();  
            s.close();  
      }
}  