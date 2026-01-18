package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

public class CombinationSum {

	// Given an array of distinct integers candidates and a target integer target,
	// return a list of all unique combinations of candidates where the chosen
	// numbers sum to target
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		Arrays.sort(candidates);

		int left;
		int smallest = Integer.MAX_VALUE;

		List<Integer> currentList;

		Entry<Integer, List<Integer>> currentEntry;
		List<List<Integer>> outputList = new ArrayList<>();
		Queue<Entry<Integer, List<Integer>>> queue = new LinkedList<>();

		for (Integer num : candidates) {
			currentList = new ArrayList<>();
			currentList.add(num);

			if (num == target) {
				outputList.add(currentList);
				continue;
			}

			currentEntry = new SimpleEntry<>(target - num, currentList);
			queue.add(currentEntry);

			smallest = Math.min(num, smallest);
		}

		while (!queue.isEmpty()) {

			Solution.display(queue);

			currentEntry = queue.remove();
			left = currentEntry.getKey();
			currentList = currentEntry.getValue();

			if (left < smallest)
				continue;

			Solution.display("Current Element from queue: {" + left + ": " + currentList + " }");

			for (int number : candidates) {

				if (number < currentList.getLast())
					continue;

				if (number <= left) {
					List<Integer> newList = new ArrayList<>(currentList);
					newList.add(number);

					if (number == left) {
						outputList.add(newList);
						Solution.display("The sum of these add up to " + target + ": " + newList);
						break;
					}

					if ((left - number) >= smallest) {
						Entry<Integer, List<Integer>> newEntry = new SimpleEntry<>(left - number, newList);
						queue.add(newEntry);
						Solution.display("Add new queue element: { " + (left - number) + ": " + newList + " }");
					}
				}
			}
		}

		return outputList;
	}
}
