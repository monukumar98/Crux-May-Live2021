package Lec37;

import java.util.Stack;

public class HistoGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(Area(arr, 0, arr.length - 1));
		System.out.println(Area_Optimize(arr));

	}

	public static int Area(int[] arr, int si, int ei) {
		if (si > ei) {
			return 0;
		}

		// 1st min si to ei
		int min = si;

		for (int i = si + 1; i <= ei; i++) {
			if (arr[min] > arr[i]) {
				min = i;
			}

		}

		int currarea = arr[min] * (ei - si + 1);
		int left_area = Area(arr, si, min - 1);
		int right_Area = Area(arr, min + 1, ei);
		return Math.max(currarea, Math.max(left_area, right_Area));

	}

	public static int Area_Optimize(int[] arr) {

		Stack<Integer> s = new Stack<Integer>();
		int max_area = 0;
		int i = 0;
		while (i < arr.length) {

			// push
			if (s.isEmpty() || arr[i] > arr[s.peek()]) {
				s.push(i);
				i++;

			}
			// area
			else {
				int r = i;
				int x = arr[s.pop()];
				int PArea = 0;
				if (s.isEmpty()) {
					PArea = x * r;

				} else {
					int l = s.peek();
					PArea = x * (r - l - 1);
				}
				max_area=Math.max(max_area, PArea);

			}
		}
		while(!s.empty()) {
			int r =i;
			int x = arr[s.pop()];
			int PArea = 0;
			if (s.isEmpty()) {
				PArea = x * r;

			} else {
				int l = s.peek();
				PArea = x * (r - l - 1);
			}
			max_area=Math.max(max_area, PArea);
			
		}
		return max_area;

	}

}
