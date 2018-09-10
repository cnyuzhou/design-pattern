package FactoryPattern;

public class ShapeFactory {
	public static Shape getShape(ShapeType type) {
		switch (type) {
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		case CIRCLE:
			return new Circle();
		}
		return null;
	}
}
