package Lec39;

public class LinkedList {

	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.println(".");
	}

//O(1)
	public void addFirst(int item) {
		Node nn = new Node();// New Node Create kre ho
		nn.data = item;// New Node data update
		// nn.Next=null;
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}

	}

//O(1)
	public void addLast(int item) {

		if (this.size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();// New Node Create kre ho
			nn.data = item;// New Node data update
			this.tail.next = nn;
			this.tail = nn;
			this.size++;

		}

	}

//O(1)
	public int getFirst() throws Exception {

		if (this.head == null) {
			throw new Exception("LinkedList Khaali hai");
		}
		return this.head.data;
	}

////O(1)
	public int getLast() throws Exception {

		if (this.head == null) {
			throw new Exception("LinkedList Khaali hai");
		}
		return this.tail.data;
	}

//O(N)
	public void addatIndex(int item, int k) throws Exception {

		if (k < 0 || k > this.size) {
			throw new Exception("Goli Maar enge");
		}
		if (k == this.size) {
			this.addLast(item);
		} else if (k == 0) {
			this.addFirst(item);
		} else {
			Node nn = new Node();// New Node Create kre ho
			nn.data = item;// New Node data update
			Node prev = this.GetNode(k - 1);// 2k
			Node prevNext = prev.next;// 3k
			prev.next = nn;// 6k
			nn.next = prevNext;
			this.size++;

//			// Ishika 
//			Node nn = new Node();// New Node Create kre ho
//			nn.data = item;// New Node data update
//			Node prev = this.GetNode(k - 1);// 2k
//		    nn.Next = prev.Next;// 3k
//		    prev.Next = nn;// 6k
//			this.size++;

		}

	}

	// O based Indexing O(N)
	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("Goli Maar enge");
		}
		Node temp = this.head;// if k is 0 aap yahan se temp Return kroge
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public int getatIndex(int k) throws Exception {

		return this.GetNode(k).data;

	}

	public int delteFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList khaali hai");
		}
		Node temp = this.head;
		this.head = this.head.next;
		temp.next = null;
		this.size--;
		return temp.data;

	}

	public int delteLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LinkedList khaali hai");
		}
		if (this.size == 1) {
			return this.delteFirst();
		} else {
			Node Sec_last_Node = GetNode(this.size - 2);// 4k
			int rv = this.tail.data;// 5
			this.tail = Sec_last_Node;// tail points on 4k loc
			this.tail.next = null;// set tail ka next null

			this.size--;
			return rv;

		}
	}

	public int delteLastatindex(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("Goli Maar enge");
		}

		if (this.size == 0) {
			throw new Exception("LinkedList khaali hai");

		}

		if (k == 0) {
			return this.delteFirst();
		} else if (k == this.size - 1) {
			return this.delteLast();
		}

		else {
			Node ith_1 = GetNode(k - 1);// 2k
			Node ith = ith_1.next;// 3k
			ith_1.next = ith_1.next.Next;// 2k-->3k-->4k
			ith.next = null;// 3k-->null
			this.size--;
			return ith.data;
		}

	}

// Lec40
	public void DataReverseI() throws Exception {
		int i = 0;
		int j = this.size - 1;
		while (i < j) {
			Node ith = GetNode(i);
			Node jth = GetNode(j);
			int t = ith.data;
			ith.data = jth.data;
			jth.data = t;
			i++;
			j--;

		}

	}

	public void PointerReverseI() throws Exception {
		Node prev = null;
		Node curr = this.head;
		while (curr != null) {
			Node ahead = curr.next;// 2k
			curr.next = prev;
			prev = curr;
			curr = ahead;

		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

	}

	public void PointerReverseR() {
		this.PointerReverseR(this.head, null);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
	}

	private void PointerReverseR(Node Curr, Node prev) {
		if (Curr == null) {
			return;
		}

		PointerReverseR(Curr.next, Curr);
		Curr.next = prev;

	}

	public void DataReverseR() {
		HeapMover heapmover = new HeapMover();
		heapmover.mover = this.head;
		DataReverseR(this.head, heapmover, 0);

	}

	private class HeapMover {
		Node mover;
	}

	private void DataReverseR(Node curr, HeapMover prev, int count) {
		if (curr == null) {
			return;
		}

		DataReverseR(curr.next, prev, count + 1);
		if (count >= this.size / 2) {
			int t = prev.mover.data;
			prev.mover.data = curr.data;
			curr.data = t;
			prev.mover = prev.mover.next;
		}

	}

	public int mid() {

		return MidNode().data;
		
	}

	private Node MidNode() {
		// TODO Auto-generated method stub
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow;
	}
//	private Node MidNode_secondmid() {  // second mid
//		// TODO Auto-generated method stub
//		Node slow = this.head;
//		Node fast = this.head;
//		while (fast!= null && fast.next!= null) {
//			slow = slow.next;
//			fast = fast.next.next;
//
//		}
//		return slow;
//	}

	public int size() {
		return this.size;
	}

}
