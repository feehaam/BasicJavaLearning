import java.util.Scanner;
public class CGextractor {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            for(int i=0; i<100; i++)
                  s = s.replace("  ", " ");
            String list[] = new String[100];
            int beg = 0, end = 0;
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i) == '-' && s.charAt(i-1)>='0'&&s.charAt(i-1)<='9'){
                        beg = i-10;
                        for(int j=i+1; j<s.length(); j++){
                              if((s.charAt(j)=='-' && s.charAt(j-1)>='0'&&s.charAt(j-1)<='9') || j==s.length()-1){
                                    end = j-10;
                                    i = j-13;
                                    if(j==s.length()-1)
                                          end = s.length();
                                    break1(s.substring(beg,end));
                                    beg = end;
                              }        }          }          }        }
      static void break1(String s){
            System.out.println(s);
            String a = s.substring(0,3);
            String b =s.substring(3,10);
            s = s.substring(19,s.length());
            String c;
            if(s.endsWith("+") || s.endsWith("-")){
                  c = s.substring(s.length()-2,s.length());
                  s = s.substring(0,  s.length()-2);
            }
            else{
                  c = s.substring(s.length()-1,s.length());
                  s = s.substring(0,  s.length()-1);
            }
            String d = s.substring(s.length()-3, s.length());
            String e="", f="";
            s=s.replace("IG", "@iG");
            s=s.replace("IC", "@iC");
            s=s.replace("IL", "@iL");
            for(int i=1; i<s.length(); i++){
                  if((s.charAt(i-1)>='a'&&s.charAt(i-1)<='z')  && (s.charAt(i)>='A'&&s.charAt(i)<='Z')){
                        e = s.substring(0,i);
                        f = s.substring(i,s.length()-3);
                        break;
                  }      }
            e=e.replace("@i", "I");
            System.out.println("    "+a);
            System.out.println("    "+b);
            System.out.println("    "+e);
            System.out.println("    "+f);
            System.out.println("    "+d);
            System.out.println("    "+c);
            System.out.println();
      }     }