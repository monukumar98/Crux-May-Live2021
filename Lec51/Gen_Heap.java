package Lec51;

import java.util.ArrayList;

public class Gen_Heap<T extends Comparable<T>> {

	private ArrayList<T> data = new ArrayList<>();

	public void add(T item) {
		this.data.add(item);

		upheapfy(this.data.size() - 1);

	}

	private void upheapfy(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (islarger(this.data.get(ci), this.data.get(pi))>0){//this.data.get(pi) > this.data.get(ci)
			swap(pi, ci);
			upheapfy(pi);

		}

	}

	public T delet() {
		T rv = this.data.get(0);
		this.swap(0, this.data.size() - 1);
		this.data.remove(this.data.size() - 1);
		downheapfy(0);

		return rv;
	}

	private void downheapfy(int pi) {
		// TODO Auto-generated method stub
		int mini = pi;

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		if (lci < this.data.size() && islarger(this.data.get(lci), this.data.get(mini))>0) {
			mini = lci;
		}
		if (rci < this.data.size() && islarger(this.data.get(rci), this.data.get(mini))>0) {
			mini = rci;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapfy(mini);

		}

	}

	public void swap(int pi, int ci) {
		T pith = this.data.get(pi);
		T cith = this.data.get(ci);
		this.data.set(pi, cith);
		this.data.set(ci, pith);

	}

	public T get() {
		return this.data.get(0);
	}
	public void display() {
		System.out.println(this.data);
	}
	public int size() {
		return this.size();
	}
	// 
	public int islarger(T o1, T o2) {
		return o1.compareTo(o2);
		
	}

}
