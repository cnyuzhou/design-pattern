package BuilderPattern;

import java.util.List;

public class Order {
	public List<Burger> getBurger() {
		return mBurger;
	}

	public void setBurger(List<Burger> mBurger) {
		this.mBurger = mBurger;
	}

	public List<Meal> getSuit() {
		return mSuit;
	}

	public void setSuit(List<Meal> mSuit) {
		this.mSuit = mSuit;
	}

	private List<Burger> mBurger;
	private List<Meal> mSuit;
}