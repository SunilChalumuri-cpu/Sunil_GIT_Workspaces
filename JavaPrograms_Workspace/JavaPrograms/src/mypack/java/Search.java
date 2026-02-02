package mypack.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;


class Algorithms {
	static {
		System.out.println("hello" );
	}
	
	{
		System.out.println("In the initializer.." + this);
	}
	
	public Algorithms() {
		System.out.println("In the constructor...");
	}
	
	public void sort(int s[]) {
		for (int i = 0; i < s.length; i++) {
			int temp = 0;
			if (s[i] > s[i++]) {
				temp = s[i++];
				s[i++] = s[i];
				s[i] = temp;
			}
		}
	}

	public int binsearch(int s[], int n) {
		for (int i = 0; i < s.length; i++) {
			if (s[i] == n) {
				return i;
				// break;
			}
		}

		return -1;
	}
	void meth()
	{
		Integer[] a= new Integer[4];
	}
	public void print(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	private void printClass() {
		String abc = "abc";
		System.out.println("class of abc is " + abc.getClass());
		int[] numbers = new int[5];
		System.out.println("class of numbers is " + numbers.getClass());
		int[] another = new int[11];
		System.out.println("class of numbers is " + another.getClass());
		Integer[][][] doubleArr = new Integer[5][][];
		System.out.println("class of numbers is " + doubleArr.getClass());
	}

	public void test() {
		Vector a = new Vector();
		System.out.println("Enter the numbers");
// DataInputStream din = new DataInputStream(System.in);
// for (int i = 0; i == '\0'; i++)
// a.a = Integer.parseInt(din.readLine());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Select a number");
// int num = Integer.parseInt(din.readLine());
		System.out.println("Before sorting: ");
		/*
		 * print(a); sort(a); System.out.println("After sorting: "); print(a);
		 * int loc=binsearch(a,num); System.out.println("The location is:
		 * "+loc);
		 */
	}
	
	public static void main(String[] args) {
//		Algorithms algo ;
		Algorithms algo = new Algorithms();
		algo = new Algorithms();
//		algo.printClass();
	}
}