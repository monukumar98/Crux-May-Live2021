package Lec47;

import java.util.LinkedList;
import java.util.Scanner;

public class Create_Level_Order {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Create_Level_Order() {
		// TODO Auto-generated constructor stub

		this.root = Create_Node();

	}

	private Node Create_Node() {
		// TODO Auto-generated method stub
		LinkedList<Node> queue = new LinkedList<>();

		int item = sc.nextInt();
		Node node = new Node();
		node.data = item;
		this.root = node;
		queue.add(node);
		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();

			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node nn = new Node();
				nn.data = c1;
				rn.left = nn;
				queue.addLast(nn);

			}
			if (c2 != -1) {
				Node nn = new Node();
				nn.data = c2;
				rn.right = nn;
				queue.addLast(nn);

			}

		}
		return root;

	}

	public void Display() {
		Display(this.root);
	}

	private void Display(Node node) {

		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		String str = "";
		if (node.left != null) {
			str += node.left.data;
		} else {
			str += ".";
		}
		str += "<-- " + node.data + " -->";
		if (node.right != null) {
			str += node.right.data;
		} else {
			str += ".";
		}
		System.out.println(str);

		Display(node.left);
		Display(node.right);

	}

	public class HeapMover {
		int visited = -1;
	}

	public void rigtview() {
		rightSideView(this.root, 0, new HeapMover());
	}

	public void rightSideView(Node node, int curr_level, HeapMover mover) {
		if (node == null) {
			return;
		}
		if (mover.visited < curr_level) {
			System.out.print(node.data + " ");
			mover.visited = curr_level;
		}
		rightSideView(node.right, curr_level + 1, mover);
		rightSideView(node.left, curr_level + 1, mover);

	}

	public static void main(String[] args) {
		Create_Level_Order cl = new Create_Level_Order();
		cl.Display();
		cl.rigtview();

	}
}
