package BridgePattern;

public class Rectangle extends Shape {
	private int x, y, radius;

	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("Shape: RECTANGLE, Color: " + color.getColor() + ", x, y: " + x + ", " + y);
	}
}
