package ProjectBeta;
import java.util.Arrays;

public class Coder {
      char code[]=new char[100000];
      char decode[]=new char[100000];
      int c,x,i;
      String code(String ... s){
            c=0;
            for(String str : s){
                  for(i = 0;  i<str.length(); i++){
                        x=str.charAt(i);
                        while(x>47){
                              code[c]=111; c++;
                              x-=10;
                        }
                   code[c]=(char)x; c++;
                  }
            }
            for(i=0; i>-1; i++)
            if(code[i]==0)
                  break;
            code = Arrays.copyOf(code, i);
            return new String(code);
      }
      String decode(String ... s){
            c=0;
            for(String str : s){
                  x=0;
                  for(i = 0;  i<str.length(); i++){
                        if(str.charAt(i)==111)
                              x+=10;
                        else
                        {      
                              x=x+(int)(str.charAt(i));
                              decode[c]=(char)x;      c++;      x=0;
                        }
                  }
            }
            for(i=0; i>-1; i++)
            if(decode[i]==0)
                  break;
            decode = Arrays.copyOf(decode, i);
            return new String(decode);
      }
}
