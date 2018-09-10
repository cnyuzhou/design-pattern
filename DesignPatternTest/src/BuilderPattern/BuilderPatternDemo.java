package BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());

		OrderBuilder orderBuilder = new OrderBuilder();
		orderBuilder.burger(new VegBurger(), 1);
		orderBuilder.burger(new ChickenBurger(), 2);
		orderBuilder.suit(mealBuilder.prepareVegMeal(), 1);
		orderBuilder.suit(mealBuilder.prepareNonVegMeal(), 2);
		Order order = orderBuilder.build();

		System.out.println("\n\nMeal--µã²Í£¨µ¥µã¡¢Ì×²Í£©");
		float cost = 0.0f, cost1 = 0.0f, cost2 = 0.0f;
		Meal meal = new Meal();
		for (Item item : order.getBurger()) {
			meal.addItem(item);
		}
		meal.showItems();
		cost1 = meal.getCost();
		System.out.println("====================================");
		System.out.println("Burger subtotal Cost: " + cost1);
		System.out.println("====================================");
		for (Meal meal1 : order.getSuit()) {
			meal1.showItems();
			cost2 += meal1.getCost();
		}
		cost = cost1 + cost2;
		System.out.println("====================================");
		System.out.println("Meal subtotal Cost: " + cost2);
		System.out.println("====================================");
		System.out.println("Total Cost: " + cost);
	}

}