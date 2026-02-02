package mypack.java;

class Const {
	public Const() {
		System.out.println("Calling default constructor of class Const");
	}

	public Const(int i) {
//		super(); //Calls the Object class constructor
		this(); //Calls the overridden default constructor
		System.out.println("Calling constructor of class Const with argument=" + i);
	}
}

public class Constructors {
	Constructors() {
		System.out.println("Constructor of class Constructors");
	}

	public static void main(String[] args) {
		//Calling argument constructor
		Const con = new Const(6);
		Constructors construct = new Constructors();
	}
}
