package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
	private List<Burger> mBurger = new ArrayList<Burger>();
	private List<Meal> mSuit = new ArrayList<Meal>();

	public void burger(Burger burger, int num) {
		for (int i = 0; i < num; i++) {
			mBurger.add(burger);
		}
	}

	public void suit(Meal suit, int num) {
		for (int i = 0; i < num; i++) {
			mSuit.add(suit);
		}
	}

	public Order build() {
		Order order = new Order();
		order.setBurger(mBurger);
		order.setSuit(mSuit);
		return order;

	}
}
