package LeetCode;

public class AddBinary {

	// Given two binary strings a and b, return their sum as a binary string
	public static String addBinary(String a, String b) {
		String ans = "";
		boolean carry = false;

		while (a.length() > 0 && b.length() > 0) {
			if ((a.substring(a.length() - 1, a.length()).equals("1")
					&& b.substring(b.length() - 1, b.length()).equals("1"))
					|| (a.substring(a.length() - 1, a.length()).equals("0")
							&& b.substring(b.length() - 1, b.length()).equals("0"))) {

				if (carry)
					ans = "1" + ans;
				else
					ans = "0" + ans;

				if ((a.substring(a.length() - 1, a.length()).equals("1")
						&& b.substring(b.length() - 1, b.length()).equals("1")))
					carry = true;
				else
					carry = false;

			} else {
				if (carry)
					ans = "0" + ans;
				else
					ans = "1" + ans;
			}

			a = a.substring(0, a.length() - 1);
			b = b.substring(0, b.length() - 1);

		}

		if (a.length() == 0)
			if (carry)
				ans = addBinary(b, "1") + ans;
			else
				ans = b + ans;
		else if (carry)
			ans = addBinary(a, "1") + ans;
		else
			ans = a + ans;

		return ans;
	}
}
