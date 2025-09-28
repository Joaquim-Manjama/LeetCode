package LeetCode;

public class MergeSort {

	// Merge nums1 and nums2 into a single array sorted in non-decreasing order,
	// store the new array in nums1
	public static int[] mergeSort(int[] array) {
		int[] left = new int[array.length / 2];
		int[] right = new int[array.length - array.length / 2];

		if (array.length < 2) {
			return array;
		}

		for (int i = 0; i < left.length; i++) {
			left[i] = array[i];
		}

		for (int i = 0; i < right.length; i++) {
			right[i] = array[i + array.length / 2];
		}

		left = mergeSort(left);
		right = mergeSort(right);

		merge(array, left, right);

		return array;
	}

	public static int[] merge(int[] original, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				original[k] = left[i];
				i++;
			} else {
				original[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < left.length) {
			original[k] = left[i];
			k++;
			i++;
		}

		while (j < right.length) {
			original[k] = right[j];
			k++;
			j++;
		}

		return original;
	}
}
