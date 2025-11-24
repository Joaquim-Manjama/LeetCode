package LeetCode;

public class LongestPalindrome {
	public static String longestPalindrome(String s) {
		String longestPalindrome = "";

		if (isPalindrome(s))
			return s;

		for (int i = 0; i < s.length(); i++) {
			if (longestPalindrome.length() > s.length() / 2)
				break;
			for (int j = i + 1; j <= s.length(); j++) {
				if (s.charAt(i) == s.charAt(j - 1)) {
					if (isPalindrome(s.substring(i, j))) {
						if (s.substring(i, j).length() > longestPalindrome.length()) {
							longestPalindrome = s.substring(i, j);
						}
					}
				}
			}
		}

		return longestPalindrome;
	}

	private static boolean isPalindrome(String string) {
		StringBuilder temp = new StringBuilder(string);
		temp.reverse();
		String reverseString = temp.toString();
		return string.equals(reverseString);
	}
}
