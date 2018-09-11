package BridgePattern;

public class Circle extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println(
				"Shape: CIRCLE, Color: " + color.getColor() + ", x, y, radius: " + x + ", " + y + ", " + radius);
	}
}
