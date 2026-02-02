package mypack.java;

public class ColorAbsFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color.equalsIgnoreCase("RED"))
			return new Red();
		else if (color.equalsIgnoreCase("BLUE"))
			return new Blue();
		else
			return null;
	}
}
