package Lec29;


public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		NQueen(board, 0, n);

	}

	private static void NQueen(boolean[][] board, int row, int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			Display(board);
			System.out.println();
			return;
		}

		for (int col = 0; col < board.length; col++) {
			if (isit_safe(board, row, col)) {
				board[row][col] = true;
				NQueen(board, row + 1, n - 1);
				board[row][col] = false;

			}
		}

	}

	private static boolean isit_safe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// Vertical
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		// left Diagonal
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// Right Diagonal
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board.length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

	private static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(!board[i][j]) {
				System.out.print(board[i][j] + " ");
				}
				else {
					System.out.print("Q"+ " ");
				}
			}
			System.out.println();
		}

	}

}
