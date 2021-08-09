package Lec39;

public class ClientLinkedList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		//list.display();
		list.addLast(30);
		list.addLast(40);
		//list.display();
		list.addatIndex(34, 1);
		//list.display();
		list.addatIndex(64, 0);
		list.display();
//		System.out.println(list.getatIndex(3));
//		System.out.println(list.getLast());
//		System.out.println(list.getFirst());
		//System.out.println(list.delteFirst());
		//System.out.println(list.delteLast());
		System.out.println(list.delteLastatindex(2));
		list.display();
		System.out.println(list.size());
	}

}
