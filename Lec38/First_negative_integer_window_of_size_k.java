package Lec38;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class First_negative_integer_window_of_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Deque<Integer> ll = new LinkedList<Integer>();
		
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			First_negative_window(arr, k);

			t--;
			System.out.println();
		}

	}

	public static void First_negative_window(int[] arr, int k) {
		Queue<Integer> qq = new LinkedList<Integer>();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				qq.add(i);
			}

		}
		if (qq.isEmpty()) {
			System.out.print(0 + " ");
		} else
			System.out.print(arr[qq.peek()] + " ");
		for (int i = k; i < arr.length; i++) {
			// remove
			if (!qq.isEmpty() && qq.peek() < i - k + 1) {
				qq.remove();
			}
			// upadate new Element
			if (arr[i] < 0) {
				qq.add(i);
			}
			if (qq.isEmpty()) {
				System.out.print(0 + " ");
			} else
				System.out.print(arr[qq.peek()] + " ");

		}

	}

}
