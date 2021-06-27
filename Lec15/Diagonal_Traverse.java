package Lec15;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		DiagonalTraverse(arr);

	}

	public static void DiagonalTraverse(int[][] arr) {

		int row = arr.length;
		int col = arr[0].length;
		ArrayList<Integer> list = new ArrayList<>();

		for (int d = 0; d <row + col - 1; d++) {
			int r = 0;
			int c = 0;
			if (d < col) {
				r = 0;
				c = d;
			} else {
				r = d - (arr[0].length -1 );
				c = arr[0].length - 1;
			}
			ArrayList<Integer> temp = new ArrayList<>();
			while (r < row && c >= 0) {

				temp.add(arr[r][c]);
				r++;
				c--;
			}
			if (d % 2 == 0) {
				// Collections.reverse(temp);
				for (int i = temp.size() - 1; i >= 0; i--) {
					list.add(temp.get(i));
				}
			} else {
				for (int i = 0; i < temp.size(); i++) {
					list.add(temp.get(i));
				}
			}

		}
		System.out.println(list);

	}

}
