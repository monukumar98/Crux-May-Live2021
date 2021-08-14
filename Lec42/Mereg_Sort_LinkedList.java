package Lec42;

import Lec39.LinkedList;

public class Mereg_Sort_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(12);
		list.addLast(7);
		list.addLast(8);
		list.addLast(19);
		list.addLast(31);
		list.display();
		list=list.MeregSort();
		list.display();

	}

}
