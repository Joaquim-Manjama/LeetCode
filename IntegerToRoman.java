package LeetCode;

public class IntegerToRoman {

	// Given an integer, convert it to a Roman numeral.
	public static String intToRoman(int num) {

		int value;
		StringBuilder output = new StringBuilder(9);

		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		for (int i = 0; i < values.length; i++) {

			value = values[i];

			if (value > num) {
				continue;
			}

			output = output.append(symbols[i].repeat((int) num / value));

			num %= value;

			if (num < 1) {
				break;
			}
		}

		return output.toString();
	}
}
