package mypack.java;
class Outer
{
	int m1=10;
	//Inner class
	protected class Inn
	{
		int m2=20;
		public void print()
		{
			System.out.println("outer class's m1="+m1);
			System.out.println("inner class m2="+m2);
		}
	}
	public void print()
	{
		Inn ob = new Inn();
		ob.print();
	}
}

public class Innertest
{
	public static void main(String arg[])
	{
		Outer ob = new Outer();
		ob.print();
		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
			
		};
		
		new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}