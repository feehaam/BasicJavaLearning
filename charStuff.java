import java.util.*;
public class charStuff {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String data = sc.next(), f = sc.next(), s = sc.next();
            data = f+data.replace(f, (s+f))+f;
            System.out.println("Stuffed data: "+data);
            data = data.replace((s+f), f);
            data = data.substring(1,data.length()-1);
            System.out.println("De-Stuffed data: "+data);
      }
}