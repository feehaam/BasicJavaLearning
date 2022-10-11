public class Data {
      static Double cgpa = 0.0;
      static String mainText = "";
      static String htmlText = "";
      static int courseCount[] = new int [10], ccp=-1, c1=0, c2=0, c3=0;
      static String courses[] = new String[200];
      static Double credit[] = new Double[200], result[] = new Double[200];
      public static Boolean retakable[] = new Boolean[200];
      static String consoleOutput="";
      static void x(){
            int c =0, j=0;
            for(int i =0 ; i<10; i++){
                  if(courseCount[i]>0){
                        System.out.println("Sem = "+(i+1));
                        for(j=c; j<courseCount[i]+c; j++){
                              System.out.println(courses[j]+credit[j]+result[j]);
                        }
                        c=j;
                  }
            }
      }
      
      static String generateBody(){
            String s="";
            int c =0, j=0;
            Double cgc=0.0, cgr=0.0;
            for(int i =0 ; i<10; i++){
                  Double tc=0.0, tr=0.0;
                  if(courseCount[i]>0){
                        s+="(SEMESTER "+(i+1)+")";
                        for(j=c; j<courseCount[i]+c; j++){
                              s+="\n      "+courses[j]+" | "+credit[j]+" | "+ifRetakable(result[j]) + " | "+getGrade(result[j]);
                              tr=tr*tc+credit[j]*result[j];
                              cgr=cgr*cgc+credit[j]*result[j];
                              tc+=credit[j];
                              cgc+=credit[j];
                              tr=tr/tc;
                              cgr=cgr/cgc;
                              cgpa = cgr;
                        }
                        c=j;
                        s+="\n"+"{Credit: "+tc+" | GPA: "+String.format("%.3f", tr)+" | CGPA: "+String.format("%.3f", cgr)+"}\n";
                  }
            }
            return getHtmlText(s);
      }
      
      static String ifRetakable(Double x){
            if(x<=3.00)
                  return "["+x+"]";
            else 
                  return Double.toString(x);
      }
      static void setBase(){
            for(int i=0; i<retakable.length; i++)
                  retakable[i] = false;
            String s = mainText;
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='#'){
                        for(int j=i+1; j<s.length(); j++){
                              if(s.charAt(j)=='#'||j==s.length()-2){
                                    setSem(s.substring(i+1,j));
                                    i=j;
                              }
                        }
                  }
            }
      }
      
      static void setSem(String s){
            int c =0;
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='>'){
                        i=s.length()+1;
                  }
            }
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='>'){
                        c++;
                        courses[c1++]=s.substring(i+2,i+8);
                        credit[c2++]=Double.parseDouble(s.substring(i+9,i+12));
                        result[c3++]=Double.parseDouble(s.substring(i+13,i+17));
                        if(result[c3-1]<=3.00)
                              retakable[c3-1] = true;
                        i+=3;
                  }
            }
            courseCount[++ccp] = c;
      }
      
      static String getHtmlText(String s){
            htmlText = s;
            for(int i=0; i<htmlText.length(); i++){
                  if(htmlText.charAt(i)=='\n'){
                        htmlText = htmlText.substring(0, i) + " <br/>"+ htmlText.substring(i+1,htmlText.length());
                        i+=5;
                  }
            }
            htmlText = htmlText.replace("{", "<b>");
            htmlText = htmlText.replace("}", "</b>");
            
            htmlText = htmlText.replace("(", "<font color='teal'><b>");
            htmlText = htmlText.replace(")", "</b></font>");
            
            htmlText = htmlText.replace("[", "<font color='red'><b>");
            htmlText = htmlText.replace("]", "</b></font>");
            String r = "<html>"+htmlText+"</html>";
            return r;
      }
      
      static String getGrade(Double x){
            String a[] = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D"};
            Double b[] = {4.00, 3.75, 3.50, 3.25, 3.00, 2.75, 2.50, 2.25, 2.00};
            for(int i=0; i<b.length; i++){
                  if(x.equals(b[i]))
                        return a[i];
            }
            return "F";
      }
      
      static void command(String s){
            s=s.toLowerCase();
            String course ="";;
            String rs = "";
            if(s.contains("retake") || s.contains("modify") || s.contains("update")){
                  s=s.replace("retake ", "");
                  s=s.replace("modify ", "");
                  s=s.replace("update ", "");
                  for(int i=s.length()-1; i>0; i--){
                        if(s.charAt(i)==' '){
                              rs = s.substring(i+1, s.length());
                              break;
                        }
                  }
                  for(int i=0; i<s.length(); i++){
                        if(s.charAt(i+1)==' '&& (s.charAt(i)>='0' && s.charAt(i)<='9')){
                              course = s.substring(0, i+1).toUpperCase();
                              break;
                        }
                  }
                  String c = course;
                  Double r = Double.parseDouble(rs);
                  if(r<2.00||r>4.0){
                        consoleOutput = ">>Invalid result expected!";
                        return;
                  }
                  for(int i=0; i<courses.length-1; i++){
                        if(courses[i]==null){
                              consoleOutput = ">> Incorrect command or incorrect course.";
                              break;
                        }
                        if(courses[i].equals(c)){
                              result[i]=r;
                              consoleOutput = ">> Modification successfull. \nIt may cost you "+ credit[i]*2650 + "taka.";
                              return;
                        }
                  }
                  consoleOutput = ">> Incorrect command or incorrect course.";
            }
            else if(s.contains("exit") || s.contains("done") || s.contains("fuck")|| s.contains("hydra"))
                  System.exit(0);
            
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}