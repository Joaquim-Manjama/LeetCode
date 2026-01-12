package LeetCode;

public class ValidSodoku {

	// Determine if a 9 x 9 Sudoku board is valid.
	public static boolean isValidSudoku(char[][] board) {
		final int LENGTH = 9;

		int chunkSize = 3;

		StringBuilder numbers = new StringBuilder();

		// Validate every Row
		for (int row = 0; row < LENGTH; row++) {
			if (!isValidRow(board[row], LENGTH, numbers))
				return false;
		}

		// Validate every Column
		for (int column = 0; column < LENGTH; column++) {
			if (!isValidColumn(board, column, LENGTH, numbers))
				return false;
		}

		// Validate every 3x3 chunk
		for (int i = 0; i < chunkSize; i++) {

			for (int j = 0; j < chunkSize; j++) {

				if (!isValidBoard(board, i * chunkSize, j * chunkSize, numbers))
					return false;
				numbers = new StringBuilder();
			}
		}

		return true;
	}

	private static boolean isValidColumn(char[][] board, int column, final int LENGTH, StringBuilder numbers) {

		for (int i = 0; i < LENGTH; i++) {

			String num = board[i][column] + "";

			if (numbers.toString().contains(num))
				return false;

			if (!num.equals("."))
				numbers.append(num);
		}

		return true;
	}

	private static boolean isValidRow(char[] row, final int LENGTH, StringBuilder numbers) {

		for (int i = 0; i < LENGTH; i++) {

			String num = row[i] + "";

			if (numbers.toString().contains(num))
				return false;
			numbers = new StringBuilder();

			if (!num.equals("."))
				numbers.append(num);
		}

		return true;
	}

	private static boolean isValidBoard(char[][] board, int startRow, int startCol, StringBuilder numbers) {

		int endRow = startRow + 3;
		int endCol = startCol + 3;

		for (int row = startRow; row < endRow; row++) {

			for (int column = startCol; column < endCol; column++) {
				String num = board[row][column] + "";

				if (numbers.toString().contains(num))
					return false;
				numbers = new StringBuilder();

				if (!num.equals("."))
					numbers.append(num);
			}
		}

		return true;
	}
}
