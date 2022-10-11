import java.util.Scanner;
//Let's consider a website which has contents for a certain age range
//i.e.: Old peoples cloths. 70s' fasion items.
//Or it contains voilant word or age restricted items. 
//Here is my AgeException, wahich was built based on that exception.
public class AgeExceptoin extends Exception{
      int age;
      AgeExceptoin (int a){
            age=a;
      }
      public String toString(){
            return "You are "+age+", you can not enter the website!";
      }
}

class MyException{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your age: ");
            int age = sc.nextInt();
            if(age>=18)
                  System.out.println("You can enter the website.");
            else
                  try{
                        throw new AgeExceptoin(age);
                  }
                  catch (AgeExceptoin e){
                        System.out.println("This site may contain age restricted contents.\n"+e);
                  }
      }
}
