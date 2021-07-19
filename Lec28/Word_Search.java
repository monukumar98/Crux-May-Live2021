package Lec28;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				boolean ans = WordSerach(grid, i, j, word, 0);
				if (ans) {
					System.out.println(ans);
					return;
				}

			}

		}
		System.out.println(false);
	}

	public static boolean WordSerach(char[][] grid, int r, int c, String word, int idx) {
		if (idx == word.length()) {
			return true;
		}

		if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != word.charAt(idx)) {
			return false;

		}

		int row[] = { 1, 0, 0, -1, -1, 1, 1, -1 };
		int col[] = { 0, 1, -1, 0, 1, 1, -1, -1 };
		boolean ans = false;
		grid[r][c] = '*';
		for (int i = 0; i < col.length; i++) {

			ans = WordSerach(grid, r + row[i], c + col[i], word, idx + 1);
			if (ans) {
				return ans;
			}
		}
		grid[r][c] = word.charAt(idx);

		return ans;

	}

}
