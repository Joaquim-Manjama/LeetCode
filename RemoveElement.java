package LeetCode;

public class RemoveElement {
	// Remove all occurences of val in nums
	public static int removeElement(int[] nums, int val) {
		int count = 0;
		int[] clean = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				clean[count] = nums[i];
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			nums[i] = clean[i];
		}

		return count;
	}
}
