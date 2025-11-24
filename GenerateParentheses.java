package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	// Given n pairs of parentheses, write a function to generate all combinations
	// of well-formed parentheses.
	public static List<String> generateParenthesis(int n) {
		List<String> output = new ArrayList<>();
		StringBuilder stack = new StringBuilder();

		backtrack(0, 0, n, stack, output);

		return output;
	}

	private static void backtrack(int open, int close, int n,
	StringBuilder stack, List<String> output) {
		
		if (open == close && close == n) {
			output.add(stack.toString());
		}

		if (open < n) {
			stack.append("(");
			backtrack(open + 1, close, n, stack, output);
			stack.deleteCharAt(stack.length() - 1);
		}

		if (close < open) {
			stack.append(")");
			backtrack(open, close + 1, n, stack, output);
			stack.deleteCharAt(stack.length() - 1);
		}
	}
	
	@SuppressWarnings("unused")
	private static void display(List<String> arr) {
		StringBuilder output = new StringBuilder("[ ");
		
		for (int i = 0; i < arr.size(); i++) {
			output.append('"' + arr.get(i) + '"');
			
			if (i < arr.size() - 1) {
				output.append(", ");
				
				if ((i + 1) % 5 == 0) {
					output.append("\n  ");
				}
			}
		}
		
		output.append(" ]");
		System.out.println(output);
	}
}
