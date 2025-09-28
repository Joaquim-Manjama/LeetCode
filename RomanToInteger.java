package LeetCode;

import java.util.HashMap;

public class RomanToInteger {

	// Convert a roman numeral string into an integer
	public static int romanToInt(String s) {
		HashMap<Character, Integer> values = new HashMap<>() {
			{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}
		};

		int number = 0;

		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1) {
				if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V' || s.charAt(i) == 'I' && s.charAt(i + 1) == 'X'
						|| s.charAt(i) == 'X' && s.charAt(i + 1) == 'C' || s.charAt(i) == 'X' && s.charAt(i + 1) == 'L'
						|| s.charAt(i) == 'C' && s.charAt(i + 1) == 'D' || s.charAt(i) == 'C' && s.charAt(i + 1) == 'M')
					number -= values.get(s.charAt(i));
				else
					number += values.get(s.charAt(i));
			} else
				number += values.get(s.charAt(i));
		}
		return number;
	}
}
