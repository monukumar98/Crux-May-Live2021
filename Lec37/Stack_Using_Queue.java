package Lec37;

import Lec36.Dynamic_Queue;

public class Stack_Using_Queue {

	private Dynamic_Queue primary;
	private Dynamic_Queue Helper;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		this.primary = new Dynamic_Queue();
		this.Helper = new Dynamic_Queue();
	}

	public int size() {
		return this.primary.size();
	}

	public boolean isEmpty() {

		return this.primary.isEmpty();

	}

//o(n)
	public void push(int item) throws Exception {
		// 1st
		while (!this.primary.isEmpty()) {
			this.Helper.Enqueue(this.primary.Dequeue());

		}

		// 2nd
		this.primary.Enqueue(item);

		// 3rd
		while (!this.Helper.isEmpty()) {
			this.primary.Enqueue(this.Helper.Dequeue());

		}

	}

	public int pop() throws Exception {

		return this.primary.Dequeue();
	}

	public int peek() throws Exception {
		return this.primary.getFront();
	}

}
