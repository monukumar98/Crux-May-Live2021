package Lec14;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		System.out.println(Search(arr, 34));

	}
	public static int Search(int [][] arr, int target) {
		int r =0;
		int c = arr[0].length-1;
		while(r<arr.length && c>=0) {
			if(arr[r][c]==target) {
				return 1;
			}
			if(arr[r][c]>target) {
				c--;
			}
			else {
				r++;
			}
		}
		return 0;
		
	}

}
