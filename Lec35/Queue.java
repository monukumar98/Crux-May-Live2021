package Lec35;

public class Queue {
	private int[] data;
	private int front;
	private int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
		this.front = 0;
		this.size = 0;

	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;

	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isfull() {
		return this.size == this.data.length;
	}

	public int size() {
		return size;
	}

	public void Enqueue(int item) throws Exception {
		if(this.isfull()) {
			throw new Exception("Queue is full");
		}
		int idx = (this.front + this.size) % this.data.length;
		this.data[idx] = item;
		this.size++;

	}

	public int Dequeue() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		int item = this.data[this.front];
		this.size--;
		this.front = (this.front + 1) % this.data.length;
		return item;

	}

	public int getFront() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return this.data[this.front];
	}

	public void Display() {
		for (int i = 0; i < this.size; i++) {

			int idx = (this.front + i) % this.data.length;
			System.out.print(this.data[idx] + " ");

		}
		System.out.println();
	}

}
