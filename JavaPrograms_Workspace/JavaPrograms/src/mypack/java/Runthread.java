package mypack.java;
class Threaddemo implements Runnable
{
	Thread t;

	Threaddemo()
	{
		t = new Thread(this, "sunilthread");   // Thread constructor
		System.out.println("New thread: " + t);
		t.start();
	}

	public void run()
	{
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println(" Child thread: " + i);
				//Thread.sleep(500);
			}
		}
		catch (Exception e)
		{
			System.out.println(" Child interrupted ");
		}
		System.out.println(" Exiting child thread ");
	}
}

class Runthread
{
	public static void main(String[] args)
	{
		new Threaddemo();
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println(" Main Thread: " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(" Main thread interrupted ");
		}
		System.out.println(" Main thread exiting ");
	}
}