import java.awt.*;
import java.awt.event.*;

public class balls  { 
      public static void main(String args[])  {  
            Texteditor to=new Texteditor();  
      }  
}  
 class AboutDialog extends Dialog implements ActionListener  {  
      AboutDialog(Frame parent,String title)  
       {  
            super(parent,title,false);  
            this.setResizable(false);  
            setLayout(new FlowLayout(FlowLayout.LEFT));  
            setSize(500,300);  
       }  
       public void actionPerformed(ActionEvent ae)  {  
            dispose();  
      }  
 }  