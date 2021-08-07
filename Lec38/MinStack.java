package Lec38;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> min_stack;
	private int min;

	public MinStack() {
		// TODO Auto-generated constructor stub
		min_stack = new Stack<>();
		min = 0;
	}

	public int size() {
		return min_stack.size();

	}

	public boolean isEmpty() {
		return min_stack.isEmpty();

	}

	public void push(int item) {
		if (this.min_stack.isEmpty()) {
			this.min_stack.push(item);
			this.min = item;

		}
		else if (item > this.min) {

			this.min_stack.push(item);
		} else {
			int x = 2 * item - this.min;
			this.min_stack.push(x);
			this.min = item;

		}
	}

	public int pop() {

		if (this.min_stack.peek() < this.min) {
			int x = this.min_stack.pop();
			int rt = this.min;
			this.min = 2 * this.min - x;
			return rt;

		} else {
			return this.min_stack.pop();
		}
	}

	public int peek() {
		return this.min_stack.pop();
	}

	public int min() {
		return this.min;
	}
}
