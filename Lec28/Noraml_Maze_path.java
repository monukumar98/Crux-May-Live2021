package Lec28;

public class Noraml_Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] maze = new boolean[3][3];// false
		System.out.println(countpath(maze, 0, 0));

	}

	public static int countpath(boolean[][] maze, int r, int c) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			return 1;
		}

		if (r < 0 || r >= maze.length || c < 0 || c >= maze[0].length || maze[r][c]) {
			return 0;

		}

		int row[] = { 1, 0, 0, -1 };
		int col[] = { 0, 1, -1, 0 };
		int ans = 0;
		for (int i = 0; i < col.length; i++) {
			maze[r][c] = true;
			ans += countpath(maze, r + row[i], c + col[i]);
		}
		maze[r][c] = false;
		return ans;

	}

}
