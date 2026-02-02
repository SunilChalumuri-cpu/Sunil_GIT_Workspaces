package mypack.java;

public class LamdaExample {
	public LamdaExample() {
		System.out.println("Calling LamdaExample");
	}

	public static void main(String args[]) {
		// Implementation of functional interface using Lambda expressions.
		InterFunctional lamdaInstance1 = (a, b) -> {
			return Integer.parseInt(a) + Integer.parseInt(b);
		};
		InterFunctional lamdaInstance2 = (a, b) -> Integer.parseInt(a) + Integer.parseInt(b);

		System.out.println("Calling the implemented Functional Interface method ");
		System.out.println("Instance1 - addChar()--> " + lamdaInstance1.addChar("5", "6"));
		System.out.println("Instance2 - addChar()--> " + lamdaInstance2.addChar("6", "8"));
	}
}
