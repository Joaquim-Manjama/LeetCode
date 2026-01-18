package LeetCode;

import java.util.LinkedList;

import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@SuppressWarnings("unused")
public class Solution {

	public static void main(String[] args) {
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		
		List<List<Integer>> output = combinationSum2(candidates, target);
		
		for (List<Integer> list: output) {
			display(list);
		}
	}

	// Given a collection of candidate numbers (candidates) and a target number
	// (target), find all unique combinations in candidates where the candidate
	// numbers sum to target.
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> outputList = new ArrayList<>();

		return outputList;

	}

	// DISPLAY A ENTRY QUEUE
	public static void display(Queue<Entry<Integer, List<Integer>>> queue) {
		int i = 1;
		for (Entry<Integer, List<Integer>> entry : queue) {

			display(i + ": {" + entry.getKey() + ": " + entry.getValue() + " }");
			i++;
		}
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
	public static void display(String message) {
		System.out.println(message);
	}

	// PRINT AN INT
	public static void display(int number) {
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
	public static void display(List<Integer> list) {
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
