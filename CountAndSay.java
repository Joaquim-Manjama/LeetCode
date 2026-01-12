package LeetCode;

public class CountAndSay {

	// Given a positive integer n, return the nth element of the count-and-say
	// sequence.
	public static String countAndSay(int n) {

		if (n == 1)
			return "1";

		return runLengthEncoding(countAndSay(n - 1));
	}

	private static String runLengthEncoding(String digits) {
		int length = digits.length();
		int count = 0;
		char currentDigit;
		char nextDigit;

		StringBuilder output = new StringBuilder("");

		for (int i = 0; i < length; i++) {
			currentDigit = digits.charAt(i);

			if (i < length - 1) {

				nextDigit = digits.charAt(i + 1);

				if (nextDigit == currentDigit) {
					count++;

				} else {
					count++;
					output.append(count);
					output.append(currentDigit);
					currentDigit = nextDigit;
					count = 0;
				}

			} else {
				count++;
				output.append(count);
				output.append(currentDigit);
				count = 0;
			}
		}

		return output.toString();
	}
}
