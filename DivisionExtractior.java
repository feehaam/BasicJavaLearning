import java.util.Scanner;
public class DivisionExtractior {
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String s = "Barisal	6	Barguna, Barisal, Bhola, Jhalokati, Patuakhali, Pirojpur\n" +
"Chittagong	11	Bandarban, Brahmanbaria, Chandpur, Chittagong, Comilla, Cox's Bazar, Feni, Khagrachari, Lakshmipur, Noakhali, Rangamati\n" +
"Dhaka	13	Dhaka, Faridpur, Gazipur, Gopalganj, Kishoreganj, Madaripur, Manikganj, Munshiganj, Narayanganj, Narsingdi, Rajbari, Shariatpur, Tangail\n" +
"Khulna	10	Bagerhat, Chuadanga, Jessore, Jhenaidah, Khulna, Kushtia, Magura, Meherpur, Narail, Satkhira\n" +
"Mymensingh	4	Jamalpur, Mymensingh, Netrokona, Sherpur\n" +
"Rajshahi	8	Bogra, Jaipurhat, Naogaon, Natore, Nawabganj, Pabna, Rajshahi, Sirajganj\n" +
"Rangpur	8	Dinajpur, Gaibandha, Kurigram, Lalmonirhat, Nilphamari, Panchagarh, Rangpur, Thakurgaon\n" +
"Sylhet	4	Habiganj, Moulvibazar, Sunamganj, Sylhet";
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                        s=s.substring(0,i) + s.substring(i+1, s.length());
                  }
            }
            
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                        s=s.substring(0,i) + s.substring(i+1, s.length());
                  }
            }
            
            while(s.contains("\t"))
                  s=s.replace("\t", " ");
            while(s.contains(","))
                  s=s.replace(",", " ");
            while(s.contains("  "))
                  s=s.replace("  ", " ");
            while(s.contains(" "))
                  s=s.replace(" ", "\n");
            
            int b=0; 
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='\n' || i==s.length()-1){
                        String x = s.substring(b, i);
                        b=i+1;
                        System.out.println("<option value=\""+x.toLowerCase()+"\">"+x+"</option>");
                  }
            }
      }
}
