package mypack.java;
public class Try
{
	public static void main(String[] ar)
	{
		int b=5, a =2;
		Test1 t=new Test1();
		b = a*b/(a=b);
		System.out.println("the value is: "+b);
		print();
	}
	public static void print()
	{
		System.out.println("HELLO-Try");
	}
}