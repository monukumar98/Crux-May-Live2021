package Lec50;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_Demo {
	public static void main(String[] args) {
	PriorityQueue<Integer> pq= new PriorityQueue<>();//min
	pq.add(30);
	pq.add(350);
	pq.add(10);
	pq.add(360);
	pq.add(-90);
	System.out.println(pq);
	PriorityQueue<Integer> pqmax= new PriorityQueue<>(Collections.reverseOrder());//max
	pqmax.add(30);
	pqmax.add(350);
	pqmax.add(10);
	pqmax.add(360);
	pqmax.add(-90);
	System.out.println(pqmax);
	}

}
