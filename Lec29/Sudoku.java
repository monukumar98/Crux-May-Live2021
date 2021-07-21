package Lec29;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		SudokuSolver(grid, 0, 0);

	}

	public static boolean SudokuSolver(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if (col == 9) {
			row++;
			col = 0;

		}
		if (row == 9) {
			Display(grid);
			return true;
		}

		if (grid[row][col] != 0) {
			return SudokuSolver(grid, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (is_it_safe(grid, row, col, val)) {
					grid[row][col] = val;
					boolean ans = SudokuSolver(grid, row, col + 1);
					if (ans) {
						return true;
					}
					grid[row][col] = 0;

				}

			}
			return false;
		}

	}

	private static boolean is_it_safe(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub

		// row
		int c = 0;
		int r = row;
		while (c < grid[0].length) {
			if (grid[r][c] == val) {
				return false;
			}
			c++;
		}
		// col
		c = col;
		r = 0;
		while (r < grid.length) {
			if (grid[r][c] == val) {
				return false;
			}
			r++;
		}
		// 3*3
		r = row - row % 3;
		c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}

			}

		}

		return true;
	}

	private static void Display(int[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				System.out.print(board[i][j] + " ");

			}
			System.out.println();
		}

	}

}
