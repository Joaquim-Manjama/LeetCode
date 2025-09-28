package LeetCode;

public class RemoveDuplicates {
	// Remove Duplicates from Sorted Array
	public static int removeDuplicates(int[] nums) {
		int[] better = new int[nums.length];
		int current = -101;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (current != nums[i]) {
				better[count] = nums[i];
				count++;
				current = nums[i];
			}
		}

		for (int i = 0; i < count; i++) {
			nums[i] = better[i];
		}

		return count;
	}
}
