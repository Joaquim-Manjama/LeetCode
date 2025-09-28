package LeetCode;

public class Sqrt {

	// Return the square root of x
	public static int mySqrt(int x) {
		if (x == 0 || x == 1)
			return x;

		int low = 1;
		int high = x / 2;
		int ans = 0;

		while (low <= high) {
			int mid = (high + low) / 2;

			if ((long) mid * mid == x)
				return mid;
			else if ((long) mid * mid < x) {
				ans = mid;
				low = mid + 1;
			} else
				high = mid - 1;

		}

		return ans;

	}
}
