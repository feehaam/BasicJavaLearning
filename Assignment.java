import java.io.*;
import java.nio.file.*;
import javafx.stage.FileChooser;
public class Assignment {
      public static void main(String args[]){
            FileChooser f = new FileChooser();
            
            String s=Read("F:\\GP\\data.txt");
            new Wallet(s).display();
      }
      private static String Read(String fileName) {
            try { return new  String(Files.readAllBytes(Paths.get(fileName)));} 
            catch (IOException e) { e.printStackTrace(); return null;}
      }
      int getNumberFromString(String s){
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)>='0'&&s.charAt(i)<='9')
                        for(int j=i+1; j<s.length(); j++){
                              if(s.charAt(j)>='0'&&s.charAt(j)<='9') continue;
                              return Integer.parseInt(s.substring(i,j));
                        }
            } 
            return 0;
      }
}