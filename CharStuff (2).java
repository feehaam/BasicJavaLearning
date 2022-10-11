import java.util.*;
public class CharStuff {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String data = sc.next(), flag = sc.next(), stuff = sc.next(), x = stuff+flag+"";
            int n = 0;
            for(int i=0; i<data.length()-1; i++)
                  if(data.charAt(i)==flag.charAt(0)&&data.charAt(i+1)!=stuff.charAt(0)){
                        n++;
                        data = data.substring(0,i) + x + data.substring(i+1,data.length());
                  }
            System.out.println("Modified data: \n"+flag+data+flag+"\nNumber of char stuffed: "+n);
      }
}
