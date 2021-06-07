package Lec5;

public class Passcal_Trinangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int row = 0;
		while (row < n) {
			int val = 1;
			int r = 0;
			while (r <= row) {
				System.out.print(val + " ");
				val = (val * (row - r)) / (r + 1);

				r++;
			}
			System.out.println();
			row++;
		}

	}

}
