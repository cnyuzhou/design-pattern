package BridgePattern;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Color red = new Red();
		Shape circle = new Circle(100, 100, 10);
		circle.setColor(red);
		circle.draw();

		Color green = new Green();
		Shape rectangle = new Rectangle(100, 200);
		rectangle.setColor(green);
		rectangle.draw();

		Color black = new Black();
		Shape square = new Square(20, 20);
		square.setColor(black);
		square.draw();
	}
}
