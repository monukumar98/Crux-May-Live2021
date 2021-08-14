package Lec42;

import java.util.Arrays;
import java.util.Scanner;

public class Only_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ladder = ladders(n);
//		for (int i = 0; i < ladder.length; i++) {
//			System.out.print(ladder[i] + " ");
//
//		}
//		System.out.println();
		System.out.println("\n"+LadderProblem(n, 0, ladder, ""));

	}

	public static int  LadderProblem(int n, int cl, int[] ladder, String ans) {
		if (cl == n) {
			System.out.print(ans + "end , ");
			return 1;
		}

		if (cl > n) {
			return 0;
		}
		int count=0;
		if (ladder[cl] != 0) {
			count+=LadderProblem(n, ladder[cl], ladder, ans + cl + " ");

		} else {
			for (int dice = 1; dice <= 6; dice++) {
				count+=LadderProblem(n, cl + dice, ladder, ans + cl + " ");

			}
		}
		return count;

	}

	public static int[] PrimeSeive(int n) {
		int prime[] = new int[n + 1];
		// 0--> not prime
		// 1--> prime
		Arrays.fill(prime, 1);
		prime[0] = 0;
		prime[1] = 0;
		for (int i = 2; i < prime.length; i++) {
			if (prime[i] == 1) {
				for (int j = 2; j * i < prime.length; j++) {
					prime[i * j] = 0;

				}
			}

		}
		return prime;

	}

	public static int[] ladders(int n) {
		int prime[] = PrimeSeive(n);
		int[] ladder = new int[n + 1];
		int i = 0;
		int j = prime.length - 1;
		while (i < j) {
			while (prime[i] == 0) {
				i++;
			}
			while (prime[j] == 0) {
				j--;
			}

			if (i < j) {
				ladder[i] = j;
				i++;
				j--;
			}

		}
		return ladder;

	}

}
