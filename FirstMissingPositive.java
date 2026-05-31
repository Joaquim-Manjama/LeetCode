package LeetCode;

public class FirstMissingPositive {

    // Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
    public static int firstMissingPositive(int[] nums) {

        int[] container = new int[nums.length];

        for  (int i = 0; i < nums.length; i++) {

            if (nums[i] < nums.length + 1 && nums[i] > 0) {
                container[nums[i] - 1] = 1;
            }
        }

        for (int i = 0; container.length > i; i++) {

            if (container[i] == 0) {
                return i + 1;
            }
        }

        return nums.length + 1;
    }
}
