package mypack.java;

class Except
{
	public static void main(String args[])
	{
		int d, a;
		try
		{
			d=0;
			a=3/args.length;
			System.out.println(" this will not execute ");
		}
		catch(ArithmeticException e)
		{
			System.out.println(" Division by zero ");
		}
		finally
		{
			System.out.println(" This is a final statement ");
		}
		System.out.println(" After catch statement ");
	}
}
