package LeetCode;

public class LenghtOfLastWord {

	// Return the length of the last word in the string
	public static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		return words[words.length - 1].length();
	}
}
