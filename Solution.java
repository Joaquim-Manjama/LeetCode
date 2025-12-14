package LeetCode;

import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		String[] words = {"word", "good", "best", "good"};
		String s = "wordgoodgoodgoodbestword";
		display(findSubstring(s, words));

	}
	
	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> output = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();

		int wordSize = words[0].length();
		int stringSize = wordSize * words.length;
		int start = 0;

		while (start <= s.length() - stringSize) {
			map.clear();

			 for (String word : words) {
	        	 if (map.containsKey(word)) {
            		 int value = map.get(word);
            		 map.replace(word, value + 1);
           		 } else {
               		 map.put(word, 1);
				 }
            }

			int end = start + stringSize;
			String string = s.substring(start, end);

			if (isValid(string, wordSize, words, map)) {
				output.add(start);
				start += wordSize;
			}
			
			start += 1;
		}

		return output;
	}

	private static boolean isValid(String s, int wordSize, String[] words, Map<String, Integer> map) {
		
		int start = 0;

		while (start <= s.length() - wordSize) {
			int end = start + wordSize;
			String string = s.substring(start, end);
			
			if (map.containsKey(string)) {
				int value = map.get(string);
				if (value == 1) {
					map.remove(string);
				
				} else {
					map.replace(string, value - 1);
				}
			
			} else {
				return false;
			}

			start += wordSize;
		}

		return true;
	}

	// PRINT A STRING
	private static void display(String message) {
		System.out.println(message);
	}

	// PRINT AN INT 
	private static void display(int number) {
		System.out.println(number);
	}

	// PRINT A DOUBLE
	private static void display(double number) {
		System.out.println(number);
	}

	// PRINT A BOOLEAN
	private static void display(boolean bool) {
		System.out.println(bool);
	}

	// PRINT A LIST OF INTEGERS
	private static void display(List<Integer> list) {
		StringBuilder output = new StringBuilder("[ ");

		for (int i = 0; i < list.size(); i++) {
			output.append(list.get(i));

			if (i < list.size() - 1) {
				output.append(", ");
			}
		}

		output.append(" ]");
		System.out.println(output);
	}
}
