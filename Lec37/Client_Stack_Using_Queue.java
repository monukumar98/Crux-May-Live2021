package Lec37;

public class Client_Stack_Using_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_Using_Queue sq = new Stack_Using_Queue();
		sq.push(10);
		sq.push(20);
		sq.push(30);
		sq.push(40);
		sq.push(50);
		System.out.println(sq.pop());
		System.out.println(sq.peek());

	}

}
