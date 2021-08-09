package Lec39;

public class Satck_Demo {

	protected int[] data;
	private int top;

	public Satck_Demo() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
		this.top = -1;

	}

	public Satck_Demo(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
		this.top = -1;

	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isfull() {
		return top == this.data.length - 1;
	}

	public void push(int item) throws Exception {

		if (this.isfull()) {
			throw new Exception("Stack is full");
		}

		this.top++;
		this.data[this.top] = item;

	}

	public int pop() throws Exception {

		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int item = this.data[this.top];
		this.data[this.top] = 0;
		top--;
		return item;
	}

	public int peek() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int item = this.data[this.top];

		return item;
	}

	public int size() {
		return top + 1;
	}

	public void DisPlay() {

		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + "--> ");

		}
		System.out.println(".");
	}
	public static void main(String[] args) {
	Satck_Demo s = new Satck_Demo();
	}
}
