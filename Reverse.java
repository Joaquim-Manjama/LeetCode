package LeetCode;

public class Reverse {
	// Given a signed 32-bit integer x, return x with its digits reversed.
	public static int reverse(int x) {

		if (x > 2147483647 || x < -2147483647)
			return 0;

		if (Math.abs(x) < 10)
			return x;

		int reverse = 0;
		int multiplier = x / Math.abs(x);
		x = Math.abs(x);
		int power = String.valueOf(Math.abs(x)).length() - 1;

		while (x > 0) {
			reverse += x % 10 * Math.pow(10, power--);
			x /= 10;
		}

		if (reverse >= 2147483647)
			return 0;

		return reverse * multiplier;
	}
}
