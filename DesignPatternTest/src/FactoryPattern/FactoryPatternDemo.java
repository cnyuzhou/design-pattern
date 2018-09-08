package FactoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1=ShapeFactory.getShape(ShapeType.RECTANGLE);
		shape1.draw();
		Shape shape2=ShapeFactory.getShape(ShapeType.SQUARE);
		shape2.draw();
		Shape shape3=ShapeFactory.getShape(ShapeType.CIRCLE);
		shape3.draw();
	}

}
















