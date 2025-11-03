package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	// Return all possible letter combinations that the number could represent.
	public static List<String> letterCombinations(String digits) {
		Map<String, String[]> map = new HashMap<>() {
			{
				put("2", new String[] { "a", "b", "c" });
				put("3", new String[] { "d", "e", "f" });
				put("4", new String[] { "g", "h", "i" });
				put("5", new String[] { "j", "k", "l" });
				put("6", new String[] { "m", "n", "o" });
				put("7", new String[] { "p", "q", "r", "s" });
				put("8", new String[] { "t", "u", "v" });
				put("9", new String[] { "w", "x", "y", "z" });
			}
		};

		List<String> arr = Arrays.asList(map.get(digits.substring(0, 1)));

		for (int i = 1; i < digits.length(); i++) {
			arr = combine(arr, map.get(digits.substring(i, i + 1)));
		}

		return arr;

	}

	public static List<String> combine(List<String> arr1, String[] arr2) {
		List<String> arr = new ArrayList<>();

		for (int i = 0; i < arr1.size(); i++) {

			for (int j = 0; j < arr2.length; j++) {
				arr.add(arr1.get(i) + arr2[j]);
			}
		}

		return arr;
	}
}
