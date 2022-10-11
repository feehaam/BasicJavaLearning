import java.util.Scanner;
public class Bitstuffing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter flag bits: ");
        String f = sc.next();
        System.out.print("Enter Binary sequence: ");
        String s = sc.next();
       
        String f2;
        int d;
        if(f.length()%2==0)
              d = f.length()/2;
        else
              d = f.length()/2+1;
        f2 = f.substring(0, d)+"0"+f.substring(d,f.length());
        
        s = stuffing(s, f, f2);
          destuffing(s, f, f2);
    }
    static String stuffing(String s, String f, String f2){
         s = s.replace(f, f2);
         s = f+s+f;
         System.out.println("After bit stuffing: "+s);
         return s;
    }
    static void destuffing(String s, String f, String f2){
          s = s.replace(f, "");
          s = s.replace(f2, f);
          System.out.println("After bit de-stuffing: "+s);
    }
}