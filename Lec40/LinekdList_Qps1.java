package Lec40;

import Lec39.LinkedList;

public class LinekdList_Qps1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.display();
		//list.DataReverseI();
		list.DataReverseR();
		list.display();
		System.out.println(list.mid());
		
		

	}

}
