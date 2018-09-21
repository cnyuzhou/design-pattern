package CommandPattern;

public class Stock {
	private String name="000555";
	private int quantity=1000;
	
	public void buy() {
		System.out.println("Stock: [ Name: "+name
				+", Quantity: "+quantity+" ] bought");
	}
	
	public void sell() {
		System.out.println("Stock: [ Name: "+name
				+", Quantity: "+quantity+" ] sold");
	}
}
