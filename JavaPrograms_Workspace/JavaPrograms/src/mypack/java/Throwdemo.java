package mypack.java;
class Throwdemo
{
	static void demoproc() throws Exception
	{
			throw new NullPointerException("Sunil");

	}
	public static void main(String[] args)
	{
        try
		{
			Throwdemo.demoproc();
	    }
        catch(Exception e)
		{
           System.out.println(" Recaught: " + e);
		}
	}
}