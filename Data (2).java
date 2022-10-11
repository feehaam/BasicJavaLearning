public class Data {
      
      static String dir="D:\\";
      static String con[][] = new String[100][10];
      static int conptr=-1;
      static String type[][]=new String[11][1000];
      static String diff[][]=new String[11][1000];
      
      
      static void addcon(String s){
            conptr++;
            con[conptr][0]=s;
      }
      
      static void showcon(){
            for(int i=0; i<=99; i++){
                  
                  if(con[i][0]==null)
                        break;
                  for(int j=0; j<10; j++){
                        if(con[i][j]==null)
                              break;
                  }
            }
      }
      
      //currently selected section
      static String cscon;
      static String csprob;
      static String cstype;
      static String csdiff;
      static String photoname;
      static String photoparent;
      
      //editor section
      static int urptr=-1, urptr2=-1;
      static String ur[]=new String[10000];
      static String ur2[]=new String[1000];
      
      
            static String coder(String text){
            Character n=10;
            String nl=n.toString();
            String temp;
            int i, j;
            for(i=0; i<text.length(); i++){
                  if(text.charAt(i)=='<')
                        if(text.charAt(i+1)=='c'&&text.charAt(i+4)=='e'){
                              for(j=i; j<text.length(); j++){
                                  if(text.charAt(j)=='<')
                                        if(text.charAt(j+2)=='c'&&text.charAt(j+5)=='e')
                                              break;
                              }
                              System.out.println(i+"fff"+j);
                              System.out.println(text.length());
                         temp=text.substring(i, j);
                         temp = temp.replace(nl, "<br/>");
                         text=text.substring(0, i)+temp+text.substring(j, text.length());
                         i=j;
                        }
            }
            text=text.replaceAll("<code>","<table border = \"1\"><tr><td>");
            text=text.replaceAll("</code>","</td></tr></table>");
            return text;
      }
            
            //Createb section
            static String selectedtag;
            static String cbname;
            static String cbtype;
            static String cbcon;
            static String cbdiff;
            
}
