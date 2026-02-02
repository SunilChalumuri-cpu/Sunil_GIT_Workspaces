package mypack.java;

abstract class A
{
	A(int a)
	{
		System.out.println(" abstract class A's constructor " + a);
	}
	abstract void callme();
	void callmetoo()
	{
		System.out.println(" class A's Concrete fuction ");
	}
	public static int a = 5;
}

class B extends A
	{
	B()
	{
	super(45);
	}
	@Override
	void callme()
	{
		System.out.println( " class B's overrides callme funtion of Class A ");
	}
}

class AbstractExcerise
{
	public static void main(String a[])
	{
		B objectb = new B();
		A objecta = new B();
		Derived objectc = new Derived();  // This is Class "Derived" object in the same package.
		objecta.callme();
		objectb.callme();
		objecta.callmetoo();
	}
}