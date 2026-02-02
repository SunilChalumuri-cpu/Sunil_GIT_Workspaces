package mypack.java;
class Private
{
	Private()
	{
		System.out.println("Private Constructor");
	}
	private int i;
	public int var=4;
	void seti(int k)
	{
		i=k;
		System.out.println(" the value of i is: " + i);
	}
}

class Inher extends Private
{
	int j = 3 +var;
	Inher(int k)
	{
		System.out.println("Inher Constructor"+k);
	}
	void seti(int m)
	{
		System.out.println("Value of overrided i: "+m);
	}
}

class Inherprivate
{
	public static void main(String a[])
	{
		//Private supercl = new Private();
		Private subcl = new Inher(3);
		subcl.seti(5);
		Inher inher = new Inher(8);
        System.out.println("the value of j is: "+ inher.j);
	}
}

