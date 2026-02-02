package mypack.java;

public class RectangleProto extends ShapeProto {
	public RectangleProto() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("This is a Rectangle class: draw method");
	}
}