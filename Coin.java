public class Coin extends Money{
      Coin(String det){
            super(det);
            value();
      }
      @Override
      void value() {
            if(coin){
                  finalvalue=val=new Assignment().getNumberFromString(det);
                  if(gold)
                        finalvalue=val+20;
            }
      }
      @Override
      String totalValue() {
            if(coin){
                  String toReturn="a "+val+" dollar ";
                  if(gold) toReturn+="gold ";
                  toReturn+="coin worth "+finalvalue+" dollars.";
                  return toReturn;
            }
            return "";
      }
}
