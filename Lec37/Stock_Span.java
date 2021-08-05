package Lec37;

import java.util.Arrays;
import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 100, 80, 60, 50, 70, 75, 85 };
		Span(arr);

	}

	public static void Span(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < ans.length; i++) {
			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				ans[i] = i + 1;
			} else
				ans[i] = i - stack.peek();
			stack.push(i);

		}
		System.out.println(Arrays.toString(ans));

	}

}
