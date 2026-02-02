package mypack.java;
class Newthread implements Runnable
{
	String name;
	Thread t;

	Newthread(String threadname)
	{
		name = threadname;
		t = new Thread(this, name);
		System.out.println(" New Thread: " + t);
		t.start();
	}

	public void run()
	{
		try
		{
			for(int i=5; i>0; i--)
			{
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(name + " interrupted ");
		}
		System.out.println(name + " exiting ");
	}
}

class Threadfun
{
	public static void main(String[] args)
	{
		Newthread ob1 = new Newthread(" one ");
		Newthread ob2 = new Newthread(" Two ");
		//change the priority of the thread
		ob2.t.setPriority(8);
		System.out.println("After thread priority change: "+ob2.t);
		Newthread ob3 = new Newthread(" Three ");
		System.out.println(" Thread One is alive: " + ob1.t.isAlive());
	    System.out.println(" Thread Two is alive: " + ob2.t.isAlive());
		System.out.println(" Thread Three is alive: " + ob3.t.isAlive());
		try
		{
			System.out.println(" Waiting for threads to finish ");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(Exception e)
		{
			System.out.println(" Main thread interrupted ");
		}
		System.out.println(" Thread One is alive: " + ob1.t.isAlive());
		System.out.println(" Thread Two is alive: " + ob2.t.isAlive());
		System.out.println(" Thread Three is alive: " + ob3.t.isAlive());
		System.out.println(" Main thread exiting ");
	}
}
