public class assemblyGenerator2 {
      public static void main(String args[]){
            String s1 = "\tCMP BL, ";
            String s2 = "\n\tJE CALL C";
            
            for(int i=1; i<40; i++)
                  System.out.println(s1+i+s2+i+"\n");
      }
}
