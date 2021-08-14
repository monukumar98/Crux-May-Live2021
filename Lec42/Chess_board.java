package Lec42;

import java.util.Scanner;

public class Chess_board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println("\n"+chessboardproblem(n, n - 1, n - 1, 0, 0, ""));

	}

	public static int  chessboardproblem(int n, int er, int ec, int cr, int cc, String ans) {
		if (cc == ec && cr == er) {
			System.out.print(ans + "{" + cr + "-" + cc + "} ");
			return 1;
		}

		if (cc >= n || cr >= n) {
			return 0;
		}
		int count=0;
		// knight
		count+=chessboardproblem(n, er, ec, cr + 2, cc + 1, ans + "{" + cr + "-" + cc + "}K");
		count+=chessboardproblem(n, er, ec, cr + 1, cc + 2, ans + "{" + cr + "-" + cc + "}K");

		// rook
		if (cc == 0 || cr == 0 || cc == n - 1 || cr == n - 1) {
			// horizontally
			for (int i = 1; i <= er; i++) {
				count+=chessboardproblem(n, er, ec, cr, cc + i, ans + "{" + cr + "-" + cc + "}R");

			}
			// vertically
			for (int i = 1; i <= er; i++) {
				count+=chessboardproblem(n, er, ec, cr + i, cc, ans + "{" + cr + "-" + cc + "}R");

			}
		}
		// bishop
		if (cc == cr || cc + cr == er) {
			for (int i = 1; i <= er; i++) {
				count+=chessboardproblem(n, er, ec, cr + i, cc + i, ans + "{" + cr + "-" + cc + "}B");

			}
		}
		return count;

	}

}
