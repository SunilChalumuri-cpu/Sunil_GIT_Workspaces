package mypack.java;

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeFactory);

	abstract Color getColor(String colorFactory);
}
