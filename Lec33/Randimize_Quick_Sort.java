package Lec33;

import java.util.Random;

public class Randimize_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 4, 6, 5, 1, 4 };
		QuickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void QuickSort(int[] arr, int si, int ei) {
		if (si > ei) {
			return;
		}
		int pi = pratition(arr, si, ei);
		QuickSort(arr, si, pi - 1);
		QuickSort(arr, pi + 1, ei);

	}

	public static int pratition(int[] arr, int si, int ei) {
		Random rn = new Random();
		int idx = rn.nextInt(ei - si) + si;
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;

		int pivot = arr[ei];
		int pi = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pi];
				arr[pi] = temp;
				pi++;
			}

		}
		int temp = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = temp;
		return pi;

	}

}
