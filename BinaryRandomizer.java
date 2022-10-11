import java.util.Random;
public class BinaryRandomizer {
      String item1, item2;
      Double percentage1, percentage2;
      BinaryRandomizer(String i1, String i2, double p1){
            item1 = i1;       item2 = i2;
            percentage1 = p1;       percentage2 = 100-p1;
      }
      public String[] generate(int numberOfItems){
            Random r = new Random();
            String items[] = new String[numberOfItems];
            Double pi1=0.0, pi2=0.0, n = 0.0, n1 = 0.0, n2 = 0.0;
            for(int i = 0; i<numberOfItems; i++){
                  if(r.nextBoolean() && pi1<= percentage1){
                        n1++;
                        items[i] = item1;
                  }
                  else {
                        if(pi2 <= percentage2){
                              items[i] = item2;
                              n2++;
                        }
                        else {
                              items[i] = item1;
                              n1++;
                        }
                  }
                  n++;
                  pi1 = (n1/n) * 100;
                  pi2 = (n2/n) * 100;
            }
            for(int i=0; i<items.length; i++){
                  int pos1 = r.nextInt(numberOfItems);
                  int pos2 = r.nextInt(numberOfItems);
                  String x = items[pos1];
                  items[pos1] = items[pos2];
                  items[pos2] = x;
            }
            return items;
      }
}