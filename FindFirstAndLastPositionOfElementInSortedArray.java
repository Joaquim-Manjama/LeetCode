package LeetCode;

public class FindFirstAndLastPositionOfElementInSortedArray {

	// Given an array of integers nums sorted in non-decreasing order, find the
	// starting and ending position of a given target value.
	public static int[] searchRange(int[] nums, int target) {
		int length = nums.length;
		int left = 0;
		int right = length - 1;

		while (left <= right) {

			int mid = (left + right) / 2;

			if (nums[mid] == target) {

				left = mid;
				right = mid;

				while (left > 0) {
					left--;

					if (nums[left] != target) {
						left++;
						break;
					}
				}

				while (right < length - 1) {
					right++;

					if (nums[right] != target) {
						right--;
						break;
					}
				}

				return new int[] { left, right };

			} else {

				if (nums[mid] < target)
					left = mid + 1;
				else
					right = mid - 1;
			}
		}

		return new int[] { -1, -1 };
	}
}
