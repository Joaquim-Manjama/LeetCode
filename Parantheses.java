package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class Parantheses {

	// Determine if the string contaning opening and closing brackets is valid (all
	// open brackets have a closing bracket in a valid way)
	public static boolean isValid(String s) {
		HashMap<String, String> brackets = new HashMap<>() {
			{
				put("(", ")");
				put("[", "]");
				put("{", "}");
			}
		};

		Stack<String> stack = new Stack<String>();

		for (String bracket : s.split("")) {

			if (brackets.containsKey(bracket))
				stack.push(brackets.get(bracket));
			else {
				if (stack.size() == 0) {
					return false;
				}
				if (!stack.pop().equals(bracket))
					return false;
			}
		}

		return (stack.isEmpty());
	}
}
