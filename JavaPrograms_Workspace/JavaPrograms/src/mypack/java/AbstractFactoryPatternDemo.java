package mypack.java;

public class AbstractFactoryPatternDemo {
	public static void main(String args[]) {
		AbstractFactory factory = AbFactoryProducer.getFactory("Shape_Factory"); // calling the static method of
																			// FactoryProducer
		Shape shapeObject = factory.getShape("Circle");
		shapeObject.draw();
		factory = AbFactoryProducer.getFactory("Color_Factory");
		Color colorObject = factory.getColor("Blue");
		colorObject.fillColor();
	}
}
