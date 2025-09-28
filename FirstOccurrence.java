package LeetCode;

public class FirstOccurrence {

	// Find the Index of the First Occurrence in a String
	public static int strStr(String haystack, String needle) {
		if (haystack.equals(needle))
			return 0;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if (haystack.substring(i, i + needle.length()).equals(needle))
				return i;
		}

		return -1;
	}
}
