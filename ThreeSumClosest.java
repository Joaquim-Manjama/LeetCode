package LeetCode;

import java.util.Arrays;

// Return the sum of the three integers that is the closest to the target;
public class ThreeSumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		int sum = 0;
		int oldSum = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1, right = nums.length - 1;

			while (left < right) {
				sum = nums[i] + nums[left] + nums[right];

				if (Math.abs(target - sum) < Math.abs(target - oldSum)) {
					oldSum = sum;
				}

				if (sum < target) {
					left++;

				} else if (sum > target) {
					right--;

				} else {
					return sum;
				}
			}
		}
		return oldSum;
	}
}
