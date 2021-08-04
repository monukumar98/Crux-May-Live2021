package Lec36;

public class Client_Queue_Using_Stack {
	public static void main(String[] args) throws Exception {
		Queue_Using_Stack sq = new Queue_Using_Stack();
		sq.Enqueue(10);
		sq.Enqueue(20);
		sq.Enqueue(30);
		sq.Enqueue(40);
		sq.Enqueue(50);
		System.out.println(sq.Dqueue());
		System.out.println(sq.getfront());
		System.out.println(sq.Dqueue());

	}

}
