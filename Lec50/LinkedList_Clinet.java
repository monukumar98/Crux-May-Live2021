package Lec50;

import Lec49.Cars;

public class LinkedList_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_Gen<Cars>  ll = new LinkedList_Gen<>();
		ll.addLast(new Cars(10, 20, "Green"));
		ll.addLast(new Cars(10, 40, "Red"));
		ll.addFirst(new Cars(60, 10, "Pink"));
		ll.display();

	}

}
