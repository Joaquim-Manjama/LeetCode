package LeetCode;

public class Atoi {

	// Converts a string to a 32-bit signed integer.
	public static int myAtoi(String s) {
		String answer = "";
		boolean minus = false;

		s = s.trim();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '-' && minus == true || s.charAt(i) == '+' && minus == true)
				break;

			if (s.charAt(i) != '0' && s.charAt(i) != '1'
			&& s.charAt(i) != '2' && s.charAt(i) != '3'
			&& s.charAt(i) != '4' && s.charAt(i) != '5'
			&& s.charAt(i) != '6' && s.charAt(i) != '7'
			&& s.charAt(i) != '8' && s.charAt(i) != '9') {
				if (s.charAt(i) == '-' && i == 0) {
					minus = true;
				} else if (s.charAt(i) == '+' && i == 0) {

				} else
					break;
			}

			answer += s.charAt(i);
		}

		if (answer.equals("") || answer.equals("-") || answer.equals("+"))
			answer = "0";

		try {
			return Integer.parseInt(answer);
		} catch (Exception e) {
			if (minus)
				return -2147483648;
			else
				return 2147483647;
		}
	}

}
