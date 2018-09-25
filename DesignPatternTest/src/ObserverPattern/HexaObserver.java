package ObserverPattern;

public class HexaObserver extends Observer{
 
   @Override
   public void update(Integer i) {
      System.out.println( "Hex String: " 
      + Integer.toHexString(i).toUpperCase() ); 
   }
}
