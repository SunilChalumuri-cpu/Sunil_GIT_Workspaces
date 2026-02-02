package mypack.java;
class Fun1
{
	public static void main()
	{
		System.out.println(" Hello Sunil-- This is first main function:");
	}

}

class Fun2
{
	public static void main()
	{
		System.out.println(" This is second main function:");
	}
}

public class Polymain
{
	public static void main(String[] arg)
	{
		Fun1.main();
		Fun2.main();
	}
}
