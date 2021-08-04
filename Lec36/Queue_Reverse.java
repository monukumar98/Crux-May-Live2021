package Lec36;

import Lec34.Stack;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated meQueue s = new S();
		Dynamic_Queue dq = new Dynamic_Queue();
		for (int i = 1; i <= 5; i++) {
			dq.Enqueue(10 * i);
		}

	}

	public static void Reverse(Dynamic_Queue q) throws Exception {
		if(q.isEmpty()) {
			return;
		}
		int item = q.Dequeue();
		Reverse(q);
		q.Enqueue(item);

	}

}
