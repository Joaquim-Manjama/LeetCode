package LeetCode;

// Given n non-negative integers representing an elevation map where the width of each bar is 1,
// compute how much water it can trap after raining.
public class TrappedWater {

    public static int trap(int[] height) {
        int gaps = 0, left = 0, right = 0;
        int length = height.length;

        for  (int i = 1; i < length - 1; i++) {

            if (height[i - 1] > left) {
                for (int j = i - 1; j >= 0; j--) {
                    left = Math.max(left, height[j]);
                }
            }

            if (height[i] >= right) {
                right = 0;
                for (int k = i + 1; k < length; k++)
                    right = Math.max(right, height[k]);
            }

            gaps += Math.max(Math.min(left, right) - height[i], 0);
        }
        return gaps;
    }
}