package mypack.java;

public class ShapeFactory {
	public Shape getShapeObject(String shape1) {
		if (shape1.equalsIgnoreCase("Circle"))
			return new Circle();
		else if (shape1.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else
			return null;
	}
}
