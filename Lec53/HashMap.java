package Lec53;

import java.util.ArrayList;

public class HashMap<K, V> {

	public class Node {
		K key;
		V value;
		Node next;

		public Node(K key, V value) {
			// TODO Auto-generated constructor stub
			this.key = key;
			this.value = value;
		}

	}

	private ArrayList<Node> buketarray;
	private int size = 0;

	public HashMap(int no_of_bucket) {
		buketarray = new ArrayList<>();
		for (int i = 0; i < no_of_bucket; i++) {
			buketarray.add(null);

		}

	}

	public HashMap() {
		this(4);
	}

	public void put(K key, V value) {
		int bn = hashfunction(key);
		Node temp = this.buketarray.get(bn);
		while (temp != null) {
			// upadte
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;

		}
		this.size++;
		Node node = new Node(key, value);
		node.next = this.buketarray.get(bn);
		//System.out.println("fsv");
		this.buketarray.set(bn, node);
		double lf = (1.0 * this.size) / this.buketarray.size();
		int thf = 2;
		if (lf > thf) {
			System.out.println("jvvsjv");
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();
		ArrayList<Node> oba = this.buketarray;
		for (int i = 0; i < 2 * oba.size(); i++) {
			nba.add(null);

		}
		this.buketarray = nba;
		this.size=0;
		for (Node temp : oba) {
			while (temp != null) {
				this.put(temp.key, temp.value);
			}
		}

	}

	public V get(K key) {
		int bn = hashfunction(key);
		Node temp = this.buketarray.get(bn);
		while (temp != null) {

			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;

		}
		return null;

	}

	public V remove(K key) {
		int bn = hashfunction(key);
		Node prev = null;
		Node temp = this.buketarray.get(bn);
		while (temp != null) {

			if (temp.key.equals(key)) {
				break;
			}
			prev = temp;
			temp = temp.next;

		}
		if (temp == null)
			return null;

		size--;
		if (prev == null) {
			this.buketarray.set(bn, temp.next);
		} else {
			prev.next = temp.next;
		}
		return temp.value;

	}

	public boolean ContainsKey(K key) {
		int bn = hashfunction(key);
		Node temp = this.buketarray.get(bn);
		while (temp != null) {

			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;

		}
		return false;

	}

	public String toString() {
		String str = "{";
		for (Node temp : this.buketarray) {
			while (temp != null) {
				str += temp.key + "=" + temp.value + ",";
				temp = temp.next;
			}

		}
		str += "}";
		return str;

	}

	public int hashfunction(K key) {
		 int bn = key.hashCode()%this.buketarray.size();
		
		int i =(bn+this.buketarray.size())%this.buketarray.size();
		return i;

	}

}
