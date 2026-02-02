package mypack.java;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, ShapeProto> shapeMap = new Hashtable();

	public static ShapeProto getShape(String shapeId) {
		ShapeProto cachedShape = (ShapeProto) shapeMap.get(shapeId);
		return (ShapeProto) cachedShape.cloner(); // returning the cloned object from Hashtable.
	}

	// for each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding 2 shapes
	public static void loadCache() {
		CircleProto circle = new CircleProto();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		RectangleProto rectangle = new RectangleProto();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}
