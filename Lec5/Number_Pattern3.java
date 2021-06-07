package Lec5;

public class Number_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;
			int val = 1;
			while (cst <= nst) {

				System.out.print(val + " ");
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}

				cst++;
			}
			row++;
			nsp--;
			nst += 2;
			System.out.println();
		}

	}

}