package mypack.java;

class X
{
	X()
	{
		System.out.println(" Class A ");
	}
}

class Y extends X
{
	Y()
	{
		System.out.println(" Class B ");
	}
}

class Z extends Y
{
	Z()
	{
		System.out.println(" Class C ");
	}
}
public class Derived extends Z
{
	public static void main(String a[])
	{
		Z obc = new Z();
	}
}
