package mypack.java;

import java.util.Enumeration;

class Enumeratedemo implements Enumeration {
	private int count = 0;
	private boolean more = true;

	public boolean hasMoreElements() {
		return more;
	}

	public Integer nextElement() {
		count++;
		if (count > 4)
			more = false;
		return new Integer(count);
	}
}

public class Enum
{
	public static void main(String a[]) {
		Enumeration enum1 = new Enumeratedemo();
		while (enum1.hasMoreElements()) {
			System.out.println(enum1.nextElement());
		}
	}
}
