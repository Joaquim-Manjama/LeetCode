package LeetCode;

import java.util.HashMap;

public class TwoSum {

	// Find the indices of two numbers in the array such that they add up to target
	public static int[] twoSum(int[] nums, int target) {
		int[] indexes = new int[2];
		int other;
		HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			other = target - nums[i];
			if (values.containsKey(other)) {
				indexes[0] = values.get(other);
				indexes[1] = i;
				return indexes;
			}
			values.put(nums[i], i);
		}

		return indexes;
	}
}
