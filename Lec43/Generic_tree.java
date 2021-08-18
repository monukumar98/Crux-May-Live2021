package Lec43;

import java.util.*;

public class Generic_tree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();

	}

	private Node root;

	public Generic_tree() {
		// TODO Auto-generated constructor stub

		this.root = Create_Tree(null, -1);

	}

	private Node Create_Tree(Node parent, int ith) {
		if (parent == null) {
			System.out.println("Eneter data for  Root Node");
		} else {

			System.out.println("Enter data for " + ith + " ith chid " + parent.data);// Enter data for"+ith +"chid kiska
		} // 1k
			// ka
		int item = sc.nextInt();
		Node nn = new Node();// 1st child
		nn.data = item;
		System.out.println(nn.data + " No of chid ?? ");
		int noc = sc.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = Create_Tree(nn, i);
			nn.children.add(child);

		}

		return nn;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		String str = "";
		str += node.data + "->";

		for (Node child : node.children) {
			str += child.data + ",";

		}
		str += ".";// 10->20,30,40,.
		System.out.println(str);

		for (Node child : node.children) {
			display(child);

		}
//		
//		for(int i=0; i<node.children.size(); i++) {
//			display(node.children.get(i));
//		}

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		int th = 0;

//		for(int i=0; i<node.children.size(); i++) {

//		}
		for (Node child : node.children) {
			th += size(child);
		}

		return th + 1;
	}

	public boolean find(int item) {

		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node.data == item) {
			return true;
		}

		for (Node child : node.children) {
			boolean ans = find(child, item);
			if (ans) {
				return true;
			}
		}
		return false;

	}

	public int max() {

		return max(this.root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		int max = node.data;
		// for(int val : list)
		for (Node child : node.children) {
			int cur_max = max(child);
			max = Math.max(cur_max, max);
		}
		return max;

	}

	public int ht() {

		return ht(this.root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub

		int th = -1;

		for (Node child : node.children) {
			int ch = ht(child);
			th = Math.max(th, ch);
		}
		return th + 1;

	}

	public void PreOrde() {
		PreOrde(this.root);
		System.out.println();
	}

	private void PreOrde(Node node) {
		// TODO Auto-generated method stub
		System.out.print(node.data + " ");
		for (Node child : node.children) {
			PreOrde(child);
		}

	}

	public void PostOrde() {
		PostOrde(this.root);
		System.out.println();
	}

	private void PostOrde(Node node) {
		// TODO Auto-generated method stub

		for (Node child : node.children) {
			PostOrde(child);
		}
		System.out.print(node.data + " ");

	}

	public void linearize() {
		linearize(this.root);
	}

	private void linearize(Node node) {
		// TODO Auto-generated method stub
		for (Node child : node.children) {
			linearize(child);
		}
		while (node.children.size() > 1) {
			Node Tail_node = GetTail_Node(node.children.get(0));
			Node FirststNode = node.children.remove(1);
			Tail_node.children.add(FirststNode);

		}

	}

	private Node GetTail_Node(Node node) {
		// TODO Auto-generated method stub
		if (node.children.size() == 0) {
			return node;
		}
		for (Node child : node.children) {
			return GetTail_Node(child);
		}
		return null;
	}

}
