package mypack.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Methods {
	// Bubble sort
	public int[] sort(int[] a) {
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length - 1 - j; i++) {
				int temp = 0;
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		return a;
	}

	// Insertion sort
	public int[] insert(int[] a, int num) {
		int[] c = new int[a.length + 1];
		for (int i = 0; i < a.length; i++)
			c[i] = a[i];
		c[c.length-1]=num;
		sort(c);
		/*for (int i = 0, temp = 0; i < c.length; i++) {
			if (i == c.length - 1) {
				c[i] = num;
			}
			if (num < c[i]) {
				temp = c[i];
				c[i] = num;
				num = c[i + 1];
				c[i + 1] = temp;
			}
		}*/
		return c;
	}

	// Print array
	public void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);
		System.out.println();
	}
}

public class Sort {
	public static void main(String[] args) {
		Methods met = new Methods();
		BufferedReader data = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter the numbers");
		int[] a = null;
		int m = 0;
		try {
			String s = data.readLine();
			StringTokenizer token = new StringTokenizer(s);
			int d = token.countTokens();
			a = new int[d];
			while (token.hasMoreElements()) {
				a[m] = Integer.parseInt((String) (token.nextElement()));
				m++;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("Before sorting: ");
		met.print(a);
		a = met.sort(a);
		System.out.println("After Sorting: ");
		met.print(a);

		// Binary Search
		m = a.length % 2 == 0 ? a.length / 2 : a.length / 2 + 1;
		int num = 0;
		System.out.println("Enter the number for Search");
		try {
			num = Integer.parseInt(data.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (num <= a[m - 1]) {
			for (int i = 0; i <= m - 1; i++) {
				if (num == a[i]) {
					System.out.println("The positon of the number is: " + ++i);
					return;
				}
				if (num < a[i]) {
					System.out.println("After Insertion:");
					met.print(met.insert(a, num));
					return;
				}
			}
		} else {
			for (int i = m; i <= a.length; i++) {
				if (num == a[i]) {
					System.out.println("The positon of the number is: " + ++i);
					return;
				}
				if (num < a[i]) {
					System.out.println("After Insertion:");
					met.print(met.insert(a, num));
					return;
				}
			}
		}
	}
}
