package mypack.java;

public class Test1
{
	Test1(){System.out.println("hi buddy--this is class Test constructor");}
    public static void main(String a[])
	{
	    System.out.println("Inside Class Test");
    	System.out.println("This is class Try static method call");
	    Try.main(a);
	    Class cl;
	    try
	    {
	    	cl = Class.forName("mypack.java.Try");
	    	Try tt = (Try)cl.newInstance();
	    	tt.print();
	    }catch (Exception ex)
	    {
	    	ex.printStackTrace();
	    }
	    
	    int num;
	    // Object str = new String("hello sunil");  not allowed
	    String str = new String("hello sunil");
	    System.out.println(str);
	    num = 100;
	    System.out.println(" The number is "+num);
	    num = num * 2;
	    System.out.print(" The product is ");
	    System.out.println(num);
	    
	}
}