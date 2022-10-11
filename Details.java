package ProjectBeta;
/**
 *
 * @author MD.Feeham
 */
class Details extends Coder{
      void Reg(String id, String name, String pas){
            String temp = code(id,"@@@",name,"@@@",pas,"@@@@@");
            Fileop.Add("F:\\cgpa\\"+id+".txt",temp);
      }

      String exploreMain(String id){
            int i=0,j;
            String s=Fileop.Read("F:\\cgpa\\"+id+".txt");
            if(s.charAt(s.length()-4)=='x'){
                  StuData.regStatus=100;
                  StuData.CurrentSem=Integer.parseInt(s.substring(s.length()-2, s.length()));
            }
            s=decode(s);
            for( j=i; i<s.length(); i++){
                  if((s.charAt(i)=='@')&&(s.charAt(i+2)=='@')){ 
                        StuData.id=s.substring(j,i);
                        i+=3; break;  }
            }
            for( j=i; i<s.length(); i++){
                  if((s.charAt(i)=='@')&&(s.charAt(i+2)=='@')){ 
                        StuData.name=s.substring(j, i);
                        i+=3; break;  }
            }
            for( j=i; i<s.length(); i++){
                  if((s.charAt(i)=='@')&&(s.charAt(i+2)=='@')){ 
                        break;  }
            }
            return s.substring(j, i);
      }

      void exploreData(){
            String data = new Fileop().Read("F:\\cgpa\\"+StuData.id+" data.txt");
            data=decode(data);
            int i=0, j=0, xx, yy=0;
            
            for(xx=0; xx<data.length(); xx++){
                  if(data.charAt(xx)=='@')
                  {i++; j=0;}
                  if(data.charAt(xx)==':')
                        yy=xx;
                  if(data.charAt(xx)=='|'){
                        j++;
                        StuData.semester[i][j]=data.substring(xx+1, xx+7);
                        xx+=6;
                  }
            }
            for(yy=yy,i=0,j=0; yy<data.length(); yy++){
                  if(data.charAt(yy)=='=')
                  {i++; j=0;}
                  if(data.charAt(yy)=='~'){
                        j++;
                        StuData.semresult[i][j]=Double.parseDouble(data.substring(yy+1, yy+5));
                        yy+=3;
                  }
            }
      }
      void zipData(){
            String courses="";
            String results="";
            
            for(int i=1; i<=StuData.CurrentSem; i++){
                  courses+="@";
                  results+="=";
                  for(int j=1; j<=8; j++){
                        if(StuData.semester[i][j]==null)
                              continue;
                        courses+="|"+StuData.semester[i][j];
                        results+="~"+String.format("%.02f", StuData.semresult[i][j]);
                        
                  }
            }
            String save=courses+""+results;
            save=code(save);
            new Fileop().Create("F:\\cgpa\\"+StuData.id+" data.txt");
            new Fileop().Write("F:\\cgpa\\"+StuData.id+" data.txt",save);
            
            
            Fileop.Add("F:\\cgpa\\"+StuData.id+".txt", "xxxxx");
            Integer sem=StuData.CurrentSem;
            String temps=sem.toString();
            if(StuData.CurrentSem<10){
                  Fileop.Add("F:\\cgpa\\"+StuData.id+".txt", "0");
            }
            Fileop.Add("F:\\cgpa\\"+StuData.id+".txt", temps);
      }
      
      String point(double num){
            if(num>=80)
                  return "A+";
            else if(num<80&&num>=75)
                  return "A";
            else if(num<75&&num>=70)
                  return "A-";
            else if(num<70&&num>=65)
                  return "B+";
            else if(num<65&&num>=60)
                  return "B";
            else if(num<60&&num>=55)
                  return "B-";
            else if(num<55&&num>=50)
                  return "C+";
            else if(num<50&&num>=45)
                  return "C";
            else if(num<45&&num>=40)
                  return "D";
            else return "FAIL";
   }
      String point(double num, String s){
            if(num>=80)
                  return "4.00";
            else if(num<80&&num>=75)
                  return "3.75";
            else if(num<75&&num>=70)
                  return "3.50";
            else if(num<70&&num>=65)
                  return "3.25";
            else if(num<65&&num>=60)
                  return "3.00";
            else if(num<60&&num>=55)
                  return "2.75";
            else if(num<55&&num>=50)
                  return "2.50";
            else if(num<50&&num>=45)
                  return "2.25";
            else if(num<45&&num>=40)
                  return "2.00";
            else return "0.00";
   }

}
