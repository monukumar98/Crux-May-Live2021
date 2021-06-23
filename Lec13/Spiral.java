package Lec13;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 11, 12, 13, 14, 31 }, { 15, 16, 17, 18, 41 }, { 19, 20, 21, 22, 51 },
				{ 23, 24, 25, 26, 61 } };
		print(arr);

	}

	public static void print(int[][] arr) {
		int min_col = 0;
		int min_row = 0;
		int max_row = arr.length - 1;
		int max_col = arr[0].length - 1;
		int total_elemnt = arr.length * arr[0].length;
		int count = 0;
		while (count < total_elemnt) {
			for (int col = min_col; col <= max_col; col++) {
				System.out.print(arr[min_row][col] + " ");
				count++;
			}
			min_row++;
			for (int row = min_row; row <= max_row; row++) {
				System.out.print(arr[row][max_col] + " ");
				count++;
			}
			max_col--;
			for (int col = max_col; col >= min_col; col--) {

				System.out.print(arr[max_row][col] + " ");
				count++;
			}
			max_row--;
			for (int row = max_row; row >= min_row; row--) {
				System.out.print(arr[row][min_col] + " ");
				count++;
			}
			min_col++;
		}
	}

}
