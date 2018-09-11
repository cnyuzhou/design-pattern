package BridgePattern;

public class Square extends Shape {
	private int x, y;

	public Square(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("Shape: SQUARE, Color: " + color.getColor() + ", x, y: " + x + ", " + y);
	}
}
