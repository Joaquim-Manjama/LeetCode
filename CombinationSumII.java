package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	// Given a collection of candidate numbers (candidates) and a target number
	// (target), find all unique combinations in candidates where the candidate
	// numbers sum to target.
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> outputList = new ArrayList<>();

		Arrays.sort(candidates);

		backtrack(0, 0, target, candidates, new ArrayList<>(), outputList, new ArrayList<>());

		return new ArrayList<>(outputList);

	}

	private static void backtrack(int index, int sum, int target, int[] set, List<Integer> list,
			List<List<Integer>> output, List<Integer> avoid) {
		int size = list.size();

		if (index == set.length || sum == target) {

			if (sum == target)
				output.add(new ArrayList<>(list));
			return;
		}

		int number = set[index];

		if (avoid.contains(number)) {
			backtrack(index + 1, sum, target, set, new ArrayList<>(list), output, new ArrayList<>(avoid));
			return;
		}

		if (sum + number <= target) {

			list.add(number);
			size++;
			backtrack(index + 1, sum + number, target, set, new ArrayList<>(list), output, new ArrayList<>());
			list.remove(size - 1);
		}

		if (sum + number == target)
			return;

		if (sum <= target) {
			avoid.add(number);
			backtrack(index + 1, sum, target, set, new ArrayList<>(list), output, new ArrayList<>(avoid));
		}
	}
}
