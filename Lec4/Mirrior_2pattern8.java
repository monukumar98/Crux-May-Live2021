package Lec4;

public class Mirrior_2pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
		while (row <= 2 * n - 1) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			 if(row<n) {
				 nsp--;
				 nst++;
			 }
			 else {
				 nsp++;
				 nst--;
			 }
			 row++;
			 System.out.println();

		}

	}

}
