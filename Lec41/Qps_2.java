package Lec41;

import Lec39.LinkedList;

public class Qps_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(30);
		list.addLast(45);
		list.addLast(56);
		list.addLast(69);
		list.addLast(78);
		list.addLast(89);
		list.display();

		list.display();

		LinkedList list1 = new LinkedList();
		list1.addLast(1);
		list1.addLast(20);
		list1.addLast(35);
		list1.addLast(46);
		list1.addLast(54);
		list1.addLast(63);
		list1.addLast(79);
		list1.addLast(82);
		System.out.println(list.kthfromlast(3));
		list.Create_Cycle();
		// list.display();
		System.out.println(list.floyed_cycle());
		list.Cycle_Removal2();
		System.out.println(list.floyed_cycle());
		// list.display();
		// list1.display();
		//
		// list.MergeTwoSortedList(list, list1);
		// list.MergeTwoSortedList(list1);
		// list.display();

	}

//	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//	        
//	      ListNode A = headA;
//	    ListNode B= headB;
//	        while(A!=B){
//	           if(A==null){
//	                A= headB;
//	            }
//	            else{
//	                A=A.next;
//	            }
//	            if(B==null){
//	                B= headA;
//	            }
//	            else{
//	               B=B.next; 
//	            }
//	        }
//	        return A;
//	        
//	    }

}
