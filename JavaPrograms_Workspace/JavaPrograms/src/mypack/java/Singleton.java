package mypack.java;

public class Singleton {

	private static Singleton single_instance = null;
	private static int instanceCount = 0;

	private Singleton() {
		instanceCount++;
		System.out.println("Count of Singleton instance= " + instanceCount);
	}

	public static Singleton getInstance() {
		if (single_instance == null)
			single_instance = new Singleton();
		return single_instance;
	}

}
