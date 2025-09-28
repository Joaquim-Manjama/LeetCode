package LeetCode;

public class SearchInsertPosition {
	// Search Insert Position
	// Return the index if the target is found, otherwise, return the index where it
	// would be if it were inserted in order
	public static int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int middle = low + (high - low) / 2;

			if (nums[middle] == target) {
				return middle;
			} else if (nums[middle] < target) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}

		return low; // low is the insertion point
	}
}
