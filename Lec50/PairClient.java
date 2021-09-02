package Lec50;

import java.util.ArrayList;

import Lec49.Cars;

public class PairClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Cars> p = new Pair<>();
		p.x=new Cars(10000,35,"Green");
		Pair pp = new Pair();
		pp.x=100;
		pp.x="b";
		
		System.out.println(p.x);
		ArrayList list = new ArrayList();
		System.out.println(list);
		list.add(100);
		list.add("Gurmeet");
		list.add('9');
		list.add(new Cars());
		System.out.println(list);
		list.remove(1);
		
	
	
	
	
		

	}

}
