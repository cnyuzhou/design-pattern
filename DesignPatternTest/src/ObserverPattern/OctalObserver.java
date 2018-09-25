package ObserverPattern;

public class OctalObserver extends Observer{
 
   @Override
   public void update(Integer i) {
     System.out.println( "Octal String: " 
     + Integer.toOctalString(i) ); 
   }
}
