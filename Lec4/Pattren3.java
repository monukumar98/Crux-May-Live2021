package Lec4;

public class Pattren3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst = n;
		int row = 1;
		while (row <= n) {
			// Self Work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*" + " ");
				cst++;
			}
			row++;
			System.out.println();
			nst--;

		}
	}

}
