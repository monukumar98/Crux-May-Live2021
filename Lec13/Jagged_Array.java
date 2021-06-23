package Lec13;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 2];

		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int [] [] jagged = takeinput();
		Displace(jagged);

	}

	public static int[][] takeinput() {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int[][] jagged = new int[row][];
		for (int i = 0; i < jagged.length; i++) {
			int col = sc.nextInt();
			jagged[i] = new int[col];
			for (int j = 0; j < jagged[i].length; j++) {
				jagged[i][j] = sc.nextInt();
			}

		}
		return jagged;

	}
	public static void Displace(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
	

}
