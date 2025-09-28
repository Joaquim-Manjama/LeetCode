package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

	// Find the longest common prefix string amongst an array of strings
	public static String longestCommonPrefix(String[] strs) {
		String prefix = "";

		Arrays.sort(strs);

		for (int i = 1; i <= Math.min(strs[0].length(), strs[strs.length - 1].length()); i++) {
			if (strs[0].substring(0, i).equals(strs[strs.length - 1].substring(0, i))) {
				prefix = strs[0].substring(0, i);
			}
		}

		return prefix;
	}
}
