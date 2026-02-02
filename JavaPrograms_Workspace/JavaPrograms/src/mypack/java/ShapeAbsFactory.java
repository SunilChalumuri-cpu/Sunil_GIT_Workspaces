package mypack.java;

public class ShapeAbsFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shape) {
		if (shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if (shape.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		else
			return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
