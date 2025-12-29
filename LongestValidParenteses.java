package LeetCode;

public class LongestValidParenteses {
	// Given a string containing just the characters '(' and ')', return the length
	// of the longest valid (well-formed) parentheses substring.
	public static int longestValidParentheses(String s) {
		int open = 0;
		int close = 0;
		int length = s.length();
		int longest = 0;

		// Left to right
		for (int i = 0; i < length; i++) {

			if (s.charAt(i) == '(')
				open++;
			else
				close++;

			if (open == close)
				longest = Math.max(longest, open + close);

			if (open < close) {
				open = 0;
				close = 0;
			}
		}

		open = 0;
		close = 0;

		// Right to left
		for (int j = length - 1; j >= 0; j++) {

			if (s.charAt(j) == ')')
				open++;
			else
				close++;

			if (open == close)
				longest = Math.max(longest, open + close);

			if (open < close) {
				open = 0;
				close = 0;
			}
		}

		return longest;
	}
}
