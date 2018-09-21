package CommandPattern;

public class BuyStock implements Order {
	private Stock stock;
	
	public BuyStock(Stock stock) {
		this.stock=stock;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.buy();
	}

}
