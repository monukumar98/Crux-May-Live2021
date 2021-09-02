package Lec51;

import java.util.Comparator;
import java.util.PriorityQueue;

public class K_Sorted_List {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	class Solution {
	    public ListNode mergeKLists(ListNode[] lists) {
	    	ListNode ans = new ListNode(-100000);
	    	ListNode temp=ans;
	   
	    	PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

				@Override
				public int compare(ListNode o1, ListNode o2) {
					// TODO Auto-generated method stub
					return o1.val-o2.val;
				}
			});
	    	PriorityQueue<Integer> pq1= new PriorityQueue<>();
	    	for (int i = 0; i < lists.length; i++) {
				pq.add(lists[i]);
			}
	    	while(!pq.isEmpty()) {
	    		ListNode rv= pq.remove();
	    		ans.next=rv;
	    		ans=ans.next;
	    		if(rv.next!=null) {
	    			pq.add(rv.next);
	    		}
	    		
	    		
	    	}
	    	return temp.next;
	    	
	        
	    }
	}
}
