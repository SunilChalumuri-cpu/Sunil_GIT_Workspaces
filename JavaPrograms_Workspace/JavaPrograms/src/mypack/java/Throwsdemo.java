package mypack.java;

class Throwsdemo
{
	static void throwone() throws Exception
	{
		System.out.println(" Inside throwone ");
	    throw new Exception("anil");
	}
	public static void main(String arg[])
	{
		try
		{
			throwone();
		}
		catch(Exception e)
		{
			System.out.println(" Caught " + e);
		}
	}
}