package mypack.java;

interface Abc {
	void addition();

	final int b = 14;
}

class Bb implements Abc {
	public void addition() {
		System.out.println(" This is first implementation of interface : " + b);
	}

	protected void subtract() throws Exception {
		System.out.println(" This is inside Class Bb");
	}
}

abstract class C extends Bb implements Abc // Duplicate implementation of Interface Abc
{
	abstract void show(long i, String s);

	// method overriding in subclass
	public void addition() {
		super.addition();
		System.out.println(" This is an abstract class overriding addition() method->1");
	}

	// method overriding in subclass
	public void subtract() {
		System.out.println(" This is overriding subtract() method in Class C");
	}
}

class Inter extends C implements Abc{
	@Override
	public void show(long i, String s) {
		System.out.println(" this is implementation of abstract method show()");
	}
	
	//method overriding again in subclass
		public void addition()
		{
			super.addition();
			System.out.println(" This is concrete class overriding addition() method->2");
		}

	public static void main(String args[]) {
		C in = new Inter();
		Bb b = new Bb();
		b.addition();
		in.addition();
		in.subtract();
		in.show(3, "Hi");

	}
}