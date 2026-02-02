package mypack.java;

public class AbFactoryProducer {
	public static AbstractFactory getFactory(String choiceFactory) {
		if (choiceFactory.equalsIgnoreCase("SHAPE_FACTORY"))
			return new ShapeAbsFactory();
		else if (choiceFactory.equalsIgnoreCase("COLOR_FACTORY"))
			return new ColorAbsFactory();
		else
			return null;
	}
}
