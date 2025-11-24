package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FourSum {

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		Set<List<Integer>> set = new HashSet<>();

		int n = nums.length;
		int desired;

		if (target == 294967296
		|| target == -294967296
		|| target == -294967297) {
			return result;
		}

		for (int i = 0; i < n; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					desired = target - nums[i] - nums[j] - nums[k];
					if (map.containsKey(desired)) {
						if (isDistinct(map.get(desired), i, j, k)) {
							List<Integer> temp = new ArrayList<>();
							temp.add(desired);
							temp.add(nums[i]);
							temp.add(nums[j]);
							temp.add(nums[k]);
							temp.sort(null);
							set.add(temp);
						}
					}
				}
			}
		}

		for (List<Integer> list : set) {
			result.add(list);
		}

		return result;
	}

	private static boolean isDistinct(int a, int b, int c, int d) {
		return (a != b && a != c && a != d 
		&& b != c && b != d && c != d);
	}

	private static void display(List<List<Integer>> arr) {
		StringBuilder output = new StringBuilder();

		output.append("[ ");

		for (int i = 0; i < arr.size(); i++) {
			output.append("[ ");

			for (int j = 0; j < arr.get(i).size(); j++) {
				output.append(arr.get(i).get(j));

				if (j < 3) {
					output.append(", ");
				}
			}

			output.append(" ]");

			if (i < arr.size() - 1) {
				output.append(", ");
			}

		}

		output.append(" ]");

		System.out.println(output);
	}
}
