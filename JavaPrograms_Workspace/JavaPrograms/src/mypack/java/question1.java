package mypack.java;

public class question1 {
	public static void main(String args[]) {
		for (int i = 1; i < 10; i++) {
			if (i > 6)
				break;
			callFunction("hi-"+i);
			//return;
		}
		callFunction("Finally");
	}

	static void callFunction(String s) {
		System.out.println(s + "-->This is called function");
	}
}
