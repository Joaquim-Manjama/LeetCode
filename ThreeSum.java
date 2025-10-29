package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	// Given an integer array nums
	// Return all the triplets [nums[i], nums[j], nums[k]]
	// Such that i != j, i != k, and j != k
	// And nums[i] + nums[j] + nums[k] == 0.
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> output = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					output.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1])
						left++;
					while (left < right && nums[right] == nums[right + 1])
						right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return output;
	}
}
