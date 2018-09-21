package CommandPattern;

public class CommandPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock=new Stock();
		
		BuyStock buyStockOrder=new BuyStock(stock);
		SellStock sellStockOrder=new SellStock(stock);
		
		Broker broker=new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(buyStockOrder);
		
		broker.placeOrders();
	}

}
