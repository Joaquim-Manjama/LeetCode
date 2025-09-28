package LeetCode;

public class PlusOne {

	// Increment the large integer by one and return the resulting array of digits
	public static int[] plusOne(int[] digits) {
		int pointer = digits.length - 1;
		boolean carry = false;

		do {

			digits[pointer] = digits[pointer] + 1;

			if (digits[pointer] == 10) {
				carry = true;
				digits[pointer] = 0;
				if (pointer > 0)
					pointer--;
				else {
					int[] arr = new int[digits.length + 1];
					arr[0] = 1;
					for (int i = 1; i < arr.length; i++) {
						arr[i] = digits[i - 1];
					}
					return arr;

				}
			} else
				carry = false;

		} while (carry);

		return digits;
	}
}
