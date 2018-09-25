package ObserverPattern;

public class BinaryObserver extends Observer{
 
   @Override
   public void update(Integer i) {
      System.out.println( "Binary String: " 
      + Integer.toBinaryString(i) ); 
   }
}
