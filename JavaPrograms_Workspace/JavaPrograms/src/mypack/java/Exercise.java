package mypack.java;

import java.util.ArrayList;
import java.util.List;

class Referred {
	Referred() {
		System.out.println("Constructor of class Referred");
	}
}

class Demo {
	Referred referred = new Referred();

	Demo() {
		System.out.println("Constructor of class Demo");
		try {
			finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	void meth1() {
		meth2();
		this.meth2();
	}

	void meth2() {
		int a = 5;
		System.out.println("Inside of meth2()");
	}

	@Override
	protected void finalize() throws Throwable {
		System.err.println("this is a overridden finalize code");
	}
}

public class Exercise extends Referred {
	static Demo d = new Demo();

	Exercise() {
		//super();
		this("baby! ");
		System.out.println("hello! This is overloaded default Constructor");
	}

	Exercise(String s) {
		System.out.println(s + "This is String Constructor");
		new Demo() {
			@Override
			void meth1() {
				// TODO Auto-generated method stub
				super.meth1();
			}
		};
	}

	public static void main(String[] args) {
		Exercise ob1 = new Exercise();
		new Exercise("Hi Buddy!");
		Exercise[] ob3;
		Exercise[] ob4 = new Exercise[2];
		Referred[] names = new Referred[5];
		names = ob4;
		String[] s = { "string1", "string2", "string3" };
		for (int i = 0; i < s.length; i++)
			System.out.println(s[i]);
		temp();
		
		List list = ob1.createList();
		java.lang.Object[] alas = list.toArray();
	}

	private List createList() {
		List list = new ArrayList();
		return list;
	}

	private static void temp() {
		int a = 10;
		Demo d = new Demo();
		try {
			d.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		d.meth1();
	}
}
