package LeetCode;

public class LengthOfSubstring {
	public static int lengthOfLongestSubstring(String s) {
		int longestLength = 0;
		int index = 0;
		String substring = "";

		while (index < s.length()) {
			if (substring.contains(s.substring(index, index + 1))) {

				for (int i = 0; i < substring.length(); i++) {
					if (substring.charAt(i) == s.charAt(index)) {
						index = index - substring.length() + i;
						substring = "";
					}
				}

			} else {
				substring += s.charAt(index);
				longestLength = Math.max(longestLength, substring.length());
			}

			index++;
		}

		return longestLength;
	}
}
