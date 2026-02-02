package mypack.java;

public class FacadePatternDemo {
	public static void main(String args[]) {
		ShapeMaker shapemaker = new ShapeMaker();

		shapemaker.drawCircle();
		shapemaker.drawRectangle();
	}

}
