package Lec13;

import java.util.Scanner;

public class Take_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = takeintput();
		Displace(arr);

	}

	public static int[][] takeintput() {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		return arr;

	}

	public static void Displace(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
