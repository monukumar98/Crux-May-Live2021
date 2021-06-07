package Lec5;

public class Pattern12 {

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
			while (cst <= nst) {
				if (cst % 2 == 0) {
					System.out.print("! ");
				} 
				else {
					System.out.print("* ");
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