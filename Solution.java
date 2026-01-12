package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("unused")
public class Solution {

	public static void main(String[] args) {
		
	}


	// PRINT A TREE
	private static void display(TreeNode node) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);
		TreeNode currentNode;

		while (!queue.isEmpty()) {
			int levelSize = queue.size();

			while (levelSize > 0) {
				currentNode = queue.remove();

				if (currentNode != null) {
					System.out.print(currentNode.val);
					queue.add(currentNode.left);
					queue.add(currentNode.right);
				}
				levelSize--;
			}

			System.out.println("");
		}
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

	// PRINT AN ARRAY OF INTEGERS
	private static void display(int[] array) {
		StringBuilder output = new StringBuilder("[ ");

		for (int i = 0; i < array.length; i++) {
			output.append(array[i]);

			if (i < array.length - 1) {
				output.append(", ");
			}
		}

		output.append(" ]");
		System.out.println(output);
	}
}
