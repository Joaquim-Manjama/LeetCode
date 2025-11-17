package LeetCode;

public class FindMedianSortedArrays {

	// Given two sorted arrays nums1 and nums2 of size m and n respectively, return
	// the median of the two sorted arrays.
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int totalNumberOfDigits = nums1.length + nums2.length;
		int[] nums = new int[((totalNumberOfDigits) / 2) + 1];
		int index = 0;
		int index1 = 0;
		int index2 = 0;

		while (index < nums.length) {

			if (index1 < nums1.length && index2 < nums2.length) {

				if (nums1[index1] < nums2[index2]) {
					nums[index] = nums1[index1];
					index1++;

				} else {
					nums[index] = nums2[index2];
					index2++;
				}

			} else {

				if (index1 < nums1.length) {
					nums[index] = nums1[index1];
					index1++;

				} else {
					nums[index] = nums2[index2];
					index2++;
				}
			}

			index++;

		}

		if (totalNumberOfDigits % 2 == 0) {

			return (nums[nums.length - 2] + nums[nums.length - 1]) / 2d;

		} else {

			return (double) nums[nums.length - 1];
		}
	}
}
