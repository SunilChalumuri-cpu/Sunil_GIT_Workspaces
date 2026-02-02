package mypack.java;

public class FactoryPatternDemo {
	public static void main(String args[]) {
		ShapeFactory sfactory = new ShapeFactory();
		Shape shapeObject = sfactory.getShapeObject("CIRCLE");
		shapeObject.draw();
		shapeObject = sfactory.getShapeObject("RECTANGLE");
		shapeObject.draw();
	}
}
