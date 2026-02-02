package mypack.java;

import java.io.*;

public class Factorial {
	public static int fact(int k) {
		int s = 1;
		for (int i = 1; i <= k; i++)
			s = k * fact(k - 1);
		return s;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number : ");
		int f = Integer.parseInt(d.readLine());
		System.out.println("The factorial of " + f + " is : " + fact(f));
	}
}
