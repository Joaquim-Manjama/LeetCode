package LeetCode;

public class NextPermutation {
	// Given an array of integers nums, find the next permutation of nums.
	public static void nextPermutation(int[] nums) {
		int length = nums.length;
		int index1 = length - 2;
		int index2;

		if (length <= 1) {
			return;
		}

		// Find first decreasing element
		while (index1 > 0 && nums[index1] >= nums[index1 + 1]) {
			index1--;
		}

		index2 = index1 + 1;

		// Find number just larger than nums[index1]
		while (index2 < length && nums[index2] > nums[index1]) {
			index2++;
		}

		index2--;

		// Swap decreasing element and the number just larger than it
		swap(index1, index2, nums);

		// Replace numbers in the left to number in the right
		replace(index1 == index2 ? -1 : index1 /* Check if decreasing value was found */
				, nums, length);
	}

	private static void replace(int start, int[] nums, int length) {
		int left = start + 1;
		int right = length - 1;

		while (left < right) {
			swap(left, right, nums);
			left++;
			right--;
		}

	}

	private static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
