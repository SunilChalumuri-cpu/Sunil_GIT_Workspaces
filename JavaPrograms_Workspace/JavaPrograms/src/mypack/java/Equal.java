package mypack.java;

class DummyClass {
	int a;

	public DummyClass(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Value of instance variable a: " + a;
	}

	// override the Object equals() function as per business logic.
	// Default function behaves same as ==.
	public boolean equals(DummyClass obj) {
		return obj.a == this.a; // returns true if both object variables have same value.
	}

}

public class Equal {
	public static void main(String a[]) throws ClassNotFoundException {
		DummyClass objectA = new DummyClass(3);
		DummyClass objectB = new DummyClass(3);
		System.out.println("objectA hashcode= " + objectA.hashCode());
		System.out.println("objectB hashcode= " + objectB.hashCode());

		if (objectA == objectB)
			System.out.println("Comparing objects using == -->both objectA&objectB are equal");
		else
			System.out.println("Comparing objects using == -->Both objectA&objectB are not equal");

		if (objectA.equals(objectB))
			System.out.println("Comparing objects using equals() -->both objectA&objectB are equal");
		else
			System.out.println("Comparing objects using equals() -->Both objectA&objectB are not equal");

		// The below will append the toString() value of objectA Id and print on
		// console.
		System.out.println(objectA);

		// Difference b/n String literal and String object
		String str1 = "hello1";
		String str2 = "hello1";
		String str3 = new String("hello1");
		String str4 = new String("hello2");

		System.out.println("the string str1 is: " + str1.hashCode());
		System.out.println("the string str2 is: " + str2.hashCode());
		System.out.println("the string str3 is: " + str3.hashCode());
		System.out.println("the string str4 is: " + str4.hashCode());
		System.out.println("String comparison conditions");
		System.out.print("compare str1 == str2 is:");
		System.out.println( str1==str2);
		System.out.print("compare str2 == 'hello1' is:");
		System.out.println(str2=="hello1");
		System.out.print("compare str3 == str1 is:");
		System.out.println(str3==str1);
		System.out.println("str3.equals(str1) is:"+str3.equals(str1));
		str4=str1;
		System.out.println("Post str4=str1 operation");
		System.out.print("compare str4 == str1 is:");
		System.out.println(str4 == str1);
	}
}