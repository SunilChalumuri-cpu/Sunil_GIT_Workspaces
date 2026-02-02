package mypack.java;

public class PrototypePatternDemo {
	public static void main(String args[]) {
		ShapeCache.loadCache();
		ShapeProto clonedShape1 = ShapeCache.getShape("1");
		ShapeProto clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape1.getType());
		clonedShape1.draw();
		System.out.println("Shape: " + clonedShape2.getType());
		clonedShape2.draw();
	}
}
