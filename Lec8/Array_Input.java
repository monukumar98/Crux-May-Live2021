package Lec8;

import java.util.Scanner;

public class Array_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("bye");
		System.out.println("Cb");
		int n = sc.nextInt();
		int[] arr = new int[n];
		// input
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("bye");
		System.out.println("Cb");
		display(arr);
		System.out.println("bye");

	}

//	public static  int [] takeinput() {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int [] arr = new int [n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//			
//		}
//		return arr;
//	}
	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
