package Lec36;

public class Queue_Using_Stack {

	private DynamicStack primary;
	private DynamicStack Helper;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		this.primary = new DynamicStack();
		this.Helper = new DynamicStack();

	}

	public boolean isEmpty() {
		return this.primary.isEmpty();

	}

	public int size() {
		return this.primary.size();

	}

	public void Enqueue(int item) throws Exception {
		this.primary.push(item);
	}

	public int Dqueue() throws Exception {
		while (this.primary.size() > 1) {
			this.Helper.push(this.primary.pop());
		}

		int item = this.primary.pop();

		while (!this.Helper.isEmpty()) {
			this.primary.push(this.Helper.pop());
		}
		return item;

	}

	public int getfront() throws Exception {
		while (this.primary.size() > 1) {
			this.Helper.push(this.primary.pop());
		}

		int item = this.primary.peek();

		while (!this.Helper.isEmpty()) {
			this.primary.push(this.Helper.pop());
		}
		return item;

	}

}
