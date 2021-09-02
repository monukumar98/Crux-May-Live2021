package Lec51;

import java.util.PriorityQueue;

import Lec49.Cars;

public class Client_Heap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Heap hp = new Heap();
		hp.add(3);
		hp.add(5);
		hp.add(7);
		hp.add(2);
		hp.add(1);
		hp.add(9);
		hp.add(13);
		hp.add(-2);
		hp.display();
		System.out.println(hp.get());
		System.out.println(hp.delet());
		hp.display();
		
		

	}

}
