package mypack.java;
//import mypack.java.Singleton;

class Func1 {
	public static void show() {
		System.out.println(" Hello Sunil-- This is static funtion show() of first class");
	}
}

class Func2 {
	public static void view() {
		System.out.println(" Inside static function view() of second class");
	}
}

public class SingletonPatternDemo {
	public static void main(String[] a) {
		Func1.show();
		Func2.view();
		Singleton object1 = Singleton.getInstance();
		Singleton object2 = Singleton.getInstance();
// remove the private access modifier of Singleton Constructor to check for new
// instance creation
// Singleton object3 = new Singleton();
		System.out.println("Hashcode of Singleton object1 is " + object1.hashCode());
		System.out.println("Hashcode of Singleton object2 is " + object2.hashCode());

// Condition check
		if (object1 == object2) {

			// Print statement
			System.out.println(
					"Singleton objects1&2 point to the same memory location on the heap i.e, to the same object");
		}

		else {
			// Print statement
			System.out.println("Singleton objects1&2 DO NOT point to the same memory location on the heap");
		}
	}
}
