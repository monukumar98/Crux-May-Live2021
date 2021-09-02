package Lec51;

import Lec49.Cars;

public class Client_GNHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen_Heap<Cars> ghp = new Gen_Heap<>();
		ghp.add(new Cars(1000, 20, "Black"));
		ghp.add(new Cars(200, 10, "White"));
		ghp.add(new Cars(345, 3, "Yellow"));
		ghp.add(new Cars(8907, 6, "Red"));
		ghp.add(new Cars(34, 89, "Grey"));
		ghp.display();
		System.out.println(ghp.delet());
		ghp.display();
		

	}

}
