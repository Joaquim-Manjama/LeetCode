package LeetCode;

public class IsPalindrome {

	// Return if an integer is a palindrome
	public static boolean isPalindrome(int x) {
		int original = x;
		int reversed = 0;

		while (x > 0) {
			reversed = (reversed * 10) + (x % 10);
			x /= 10;
		}

		return (original == reversed);
	}
}
