package Lec38;

import java.util.Stack;

public class Celebrity_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };

		System.out.println(Celebrity(arr));
	}

	public static int Celebrity(int[][] arr) {

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			stack.push(i);

		}
		while (stack.size() > 1) {
			int a = stack.pop();
			int b = stack.pop();
			if (arr[a][b] == 1) {
				stack.push(b);
			} else {
				stack.push(a);
			}

		}
		int candidate = stack.pop();
		for (int i = 0; i < arr.length; i++) {
			if (i != candidate && (arr[i][candidate] == 0 || arr[candidate][i] == 1)) {
				return -1;
			}

		}
		return candidate;

	}
	
	// Leetcode
	 public int findCelebrity(int n) {
	        Stack<Integer> stack = new Stack<>();
			for (int i = 0; i < n; i++) {
				stack.push(i);

			}
			while (stack.size() > 1) {
				int a = stack.pop();
				int b = stack.pop();
				if (knows(a,b)) {
					stack.push(b);
				} else {
					stack.push(a);
				}

			}
			int candidate = stack.pop();
			for (int i = 0; i < n; i++) {
				if (i != candidate && (knows(i,candidate) == false || knows(candidate,i) == true)) {
					return -1;
				}

			}
			return candidate;

	       
	    }

}
