package mypack.java;
class Dup implements Runnable 
{
	
	Dup()
	{
		t = new Thread(this, "sunilthread");
		System.out.println("Child thread: " + t);
		t.start();
	}
	Thread t;
	public void run()
	{
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println(" Child thread: " + i);
				Thread.sleep(500);
			}
		}
		catch (Exception e)
		{
			System.out.println(" Child interrupted ");
		}
		System.out.println(" Exiting child thread ");
	}


	public static void main(String[] args) 
	{
		//new Dup();
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