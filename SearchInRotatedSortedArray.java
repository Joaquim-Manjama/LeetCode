package LeetCode;

public class SearchInRotatedSortedArray {
	
	// Given the array nums after the possible rotation and an integer target,
		// return the index of target if it is in nums, or -1 if it is not in nums.
		public static int search(int[] nums, int target) {
			int length = nums.length;

			if (length == 0)
				return -1;

			if (nums[0] < nums[length - 1]) {

				// Binary search
				int left = 0;
				int right = length - 1;
				int mid;

				while (left <= right) {
					mid = (right + left) / 2;

					if (nums[mid] == target)
						return mid;

					if (nums[mid] < target)
						left = mid + 1;
					else
						right = mid - 1;
				}

				return -1;
			}

			if (target >= nums[0]) {

				for (int i = 0; i < length; i++)
					if (nums[i] == target)
						return i;

			} else {

				for (int i = length - 1; i >= 0; i--)
					if (nums[i] == target)
						return i;
			}

			return -1;
		}
}
