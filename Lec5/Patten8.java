package Lec5;

public class Patten8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp1 = 0;
		int nsp2 = n - 2;
		int row = 1;
		while (row <= n) {
			// 1st Space
			int csp1 = 1;
			while (csp1 <= nsp1) {
				System.out.print("  ");
				csp1++;
			}
			// 1st Star
			System.out.print("* ");
			// 2nd space
			int csp2 = 1;
			while (csp2 <= nsp2) {
				System.out.print("  ");
				csp2++;
			}
			// star
			if (row != n / 2 + 1) {
				System.out.print("* ");
			}
			// mirror
			if (row <= n / 2) {
				nsp1++;
				nsp2 -= 2;
			} else {
				nsp1--;
				nsp2 += 2;
			}
			row++;
			System.out.println();

		}

	}

}
