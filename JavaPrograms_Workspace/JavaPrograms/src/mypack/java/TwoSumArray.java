package mypack.java;

import java.util.HashMap;
import java.util.Map;

//Function to take an array of numbers and return the indices of the numbers whose sum = target
//TimeComplexity = O(n2)
public class TwoSumArray {
	public int[] twoSumUsingArray(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target)
					return new int[] { i, j };
			}
		}
		return nums;
	}

//Fast and best implementation of the above function using map and only 1 iteration
// TimeComplexity = O(n)
	// Logic is to check the map which contains the difference number that sums up
	// to the target
	// and the index of the number which is being traversed in the loop
	public int[] twoSumUsingMap(int[] nums, int target) {
		Map<Integer, Integer> complements = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer complementIndex = complements.get(nums[i]); // this will return the index of that number
			// which will sum up to target
			if (complementIndex != null)
				return new int[] { complementIndex, i };
			complements.put(target - nums[i], i);
		}
		return nums;
	}

	public static void main(String ar[]) {
		TwoSumArray instance1 = new TwoSumArray();
		int[] results = instance1.twoSumUsingArray(new int[] { 3, 4, 1, 6, 5 }, 11);
		System.out.println("The results using Array iteration are : " + results[0] + "," + results[1]);
		results = instance1.twoSumUsingMap(new int[] { 3, 4, 1, 6, 5 }, 11);
		System.out.println("The results using Map iteration are : " + results[0] + "," + results[1]);
	}
}
