import java.util.*;;
public class a{
      static Scanner sc=new Scanner(System.in);
      public static void main(String[] args) {
            int t=sc.nextInt();
            while(t-->0){
                  int t1=sc.nextInt();
                  int t2=sc.nextInt();
                  String f=sc.next();
                  int d1=sc.nextInt();
                  int d2=sc.nextInt();
                  //System.out.println(f);
                  boolean ss=false;
                  if(f.equals("PM")){
                        t1+=12;
                        ss=true;
                  }
                        
                  //System.out.println(t1);
                  t1+=d1;
                  System.out.println(t1+"      "+t2);
                  while(d2-->-0){
                        if(t2+1==60){
                              t2=0;
                              t1++;
                        }
                        else t2++;
                  }
                  System.out.println(t1+"      "+t2);
                  String ans="";
                  int d=0;
                  while(t1>=24){
                        d++;
                        t1-=24;
                  }
                  if(t1>12){
                        ans+="AM";
                        t1-=12;
                  }
                  else 
                        ans+="PM";
                  if(t1==0){
                        t1=12;
                  }
                        
                  String res="";
                  if(d==0)
                        res+="Today at";
                  else if(d==1)
                        res+="Tomorow at";
                  else if(d==2)
                        res+="The day after tomorow at";
                  else if(d==3)
                        res+="The day after the day after tomorow at";
                  System.out.println(res+" : "+t1+":"+t2+" "+ans);
                  
            }
            
      }
}
