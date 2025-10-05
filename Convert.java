package LeetCode;

public class Convert {
	public static String convert(String s, int numRows) {
		String[] stringArr = new String[numRows];
		String output = "";
		int turn = 1;
		boolean increasing = true;

		for (int i = 0; i < numRows; i++) {
			stringArr[i] = "";
		}

		for (int i = 0; i < s.length(); i++) {

			stringArr[turn - 1] += s.charAt(i);

			if (numRows != 1) {
				if (increasing)
					turn++;
				else
					turn--;
			}

			if (turn == numRows)
				increasing = false;
			if (turn == 1)
				increasing = true;
		}

		for (int i = 0; i < numRows; i++) {
			output += stringArr[i];
		}

		return output;
	}
}
