package mypack.java;
class Mainthread
{
	public static void main(String[]ar)
	{
		Thread t;
		t = Thread.currentThread();
		System.out.println(" Current Thread: " + t);
		t.setName(" Sunilthread ");
		System.out.println(" After name change: " + t);

		try
		{
			for(int n=4; n>0; n--)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(" Main thread interrupted ");
		}
	}
}
