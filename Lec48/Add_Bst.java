package Lec48;

import Lec48.Binary_Search_tree.Node;

public class Add_Bst {

	public class Node {
		int val;
		Node left;
		Node right;

	}
	private Node root;

	public Add_Bst(int [] arr) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < arr.length; i++) {
			this.root=Create_tree(root, arr[i]);
		}
		
		
	
	}
	
	private  Node Create_tree(Node node , int item){
		
		if(node==null) {
			Node nn = new Node();
			nn.val=item;
			return nn;
		}
		if(node.val>item) {
			node.left=Create_tree(node.left, item);
		}
		else {
			node.right=Create_tree(node.right, item);
		}
		return node;
		
	}
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub

		if (node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");

	}



	public static void main(String[] args) {
		int [] arr = {5,9,7,2,3,1};
		Add_Bst ab = new Add_Bst(arr);
		ab.PostOrder();
		
	}

}
