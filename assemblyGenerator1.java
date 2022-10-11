public class assemblyGenerator1 {
      public static void main(String args[]){
            String s1 = "C";
            int n = 1;
            String s2 =    " PROC \n" +
                                    "    PRINT ': '\n" +
                                    "    CALL SCAN_NUM \n" +
                                    "    MOV AX, CX\n" +
                                    "    MOV CH, BH\n" +
                                    "    MOV CL, BL\n" +
                                    "    \n" +
                                    "    PRINTN\n" +
                                    "    PRINT ': '\n" +
                                    "    CALL RESULT\n" +
                                    "    RET    \n" +
                                    "C";
            String s3 = " ENDM\n\n";
            for(int i=1; i<40; i++, n++){
                  System.out.println(s1+n+s2+n+s3);
            }
      }
}
