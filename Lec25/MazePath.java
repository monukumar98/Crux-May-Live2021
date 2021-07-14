package Lec25;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		System.out.println("\n" + print_maze(0, 0, m, n, ""));// 4*4 --- > 3,3

	}

	private static int print_maze(int cr, int cc, int er, int ec, String ans) {
		// TODO Auto-generated method stub
		if (cr == er - 1 && cc == ec - 1) {
			System.out.print(ans + " ");
			return 1;

		}

// -ve base 
		if (cr >= er || cc >= ec) {
			return 0;

		}
		int hr = print_maze(cr, cc + 1, er, ec, ans + "H");// H
		int vt = print_maze(cr + 1, cc, er, ec, ans + "V");// V
		return hr + vt;

	}

}
