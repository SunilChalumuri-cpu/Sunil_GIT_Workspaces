package mypack.java;

public class CircleProto extends ShapeProto {
	public CircleProto() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("This is a Circle class: draw method");
	}
}
