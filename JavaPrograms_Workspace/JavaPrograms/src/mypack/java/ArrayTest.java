package mypack.java;

import java.lang.reflect.Array;

public class ArrayTest {
	public static void main(String args[]) {
		String strarry1[] = new String[3]; // initializing string array with null values
		String[] strarry2 = { "one", "two" }; // initializing string array with values
		System.out.println("String Array1 Length: " + strarry1.length);
		System.out.println("Array1 elements: " + strarry1[0] + "," + strarry1[1] + "," + strarry1[2]);
		System.out.println("String Array2 Length: " + strarry2.length);
		System.out.println("Array2 elements: " + strarry2[0] + "," + strarry2[1]);
		System.out.println("----------------------");
		// Arrays creation
		int[] intarry; // defining array
		intarry = new int[5]; // initializing int array with default values
		System.out.println("integer array without values assigned: " + intarry);
		System.out.println("value of array index 3: " + intarry[2]);
		intarry = new int[] { 5, 23, 13, 64, 45 }; // initializing int array with values
		System.out.println("integer array with values assigned: " + intarry);
		System.out.println("value of array index 3: " + intarry[2]);
		intarry = (int[]) Array.newInstance(int.class, 6); // array creation by reflection
		System.out.println("integer array created by reflection without values assigned: " + intarry);
		System.out.println("value of array index 3: " + intarry[2]);
	}
}
