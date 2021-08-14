package Lec42;

import java.util.LinkedList;

public class java_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(0, 20);// 20-->10
		list.addFirst(30);
		list.addLast(50);
		list.add(60);//last me add
		System.out.println(list);
		System.out.println(list.remove());//first
		System.out.println(list.size());
		
		

	}

}
