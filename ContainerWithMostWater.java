package LeetCode;

public class ContainerWithMostWater {
	
	// Return the maximum amount of water a container can store.
	public static int maxArea(int[] height) {
		int lindex = 0;
		int rindex = height.length - 1;
		int area = 0;

		while (lindex < rindex) {
			area = Math.max(area,
			Math.min(height[lindex], height[rindex]) * (rindex - lindex));

			if (height[lindex] < height[rindex])
				lindex++;
			else
				rindex--;
		}

		return area;
	}
}
