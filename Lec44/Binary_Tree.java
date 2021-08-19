package Lec44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {
	Scanner sc = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public Binary_Tree() {
		// TODO Auto-generated constructor stub

		this.root = Create_Node(null, false);

	}

	private Node Create_Node(Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter data for root Node ");

		} else {
			if (ilc) {
				System.out.println("Enter data for left child of " + parent.data);
			} else {
				System.out.println("Enter data for right child of " + parent.data);
			}
		}

		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("has left chlid ?? " + nn.data);
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = Create_Node(nn, true);
		}
		System.out.println("has right chlid ?? " + nn.data);
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = Create_Node(nn, false);
		}

		return nn;

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

	public int max() {
		return max(this.root);

	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int left_max = max(node.left);
		int right_max = max(node.right);

		return Math.max(left_max, Math.max(right_max, node.data));
	}

	public int ht() {
		return ht(this.root);

	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}

		int left_ht = ht(node.left);
		int right_ht = ht(node.right);
		return Math.max(left_ht, right_ht) + 1;
	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}

		int left_size = size(node.left);
		int right_size = size(node.right);
		return right_size + left_size + 1;
	}

	public boolean find(int item) {

		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}

		boolean left = find(node.left, item);

		boolean right = find(node.right, item);
		return left || right;

	}

	public void PerOrder() {
		PerOder(this.root);
		System.out.println();

	}

	private void PerOder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		PerOder(node.left);
		PerOder(node.right);

	}

	public void postOrder() {
		PostOder(this.root);
		System.out.println();
	}

	private void PostOder(Node node) {
		if (node == null) {
			return;
		}

		PostOder(node.left);
		PostOder(node.right);
		System.out.print(node.data + " ");

	}

	public void InOder() {
		InOder(this.root);
		System.out.println();
	}

	private void InOder(Node node) {
		if (node == null) {
			return;
		}

		InOder(node.left);
		System.out.print(node.data + " ");
		InOder(node.right);

	}

	public void LevelOrder() {

		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		while (!q.isEmpty()) {
			Node node = q.remove();
			System.out.print(node.data + " ");
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}

		}
		System.out.println();

	}

	public void LevelOrderLevelwise1() {

		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		while (!q.isEmpty()) {
			int size = q.size();
			while (size > 0) {
				Node node = q.remove();
				System.out.print(node.data + " ");
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
				size--;
			}
			System.out.println();

		}

	}

	public void LevelOrderLevelwise2() {

		Queue<Node> p = new LinkedList<>();
		Queue<Node> h = new LinkedList<>();
		p.add(this.root);
		while (!p.isEmpty()) {

			Node node = p.remove();
			System.out.print(node.data + " ");

			if (node.left != null) {
				h.add(node.left);
			}
			if (node.right != null) {
				h.add(node.right);
			}
			if (p.isEmpty()) {
				p = h;
				System.out.println();
				h = new LinkedList<>();
			}

		}
		System.out.println();

	}

	public void Zig_ZagOrder() {

		Queue<Node> q = new LinkedList<>();
		q.add(this.root);
		boolean flag = true;
		int level = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> list = new ArrayList<Integer>();

			while (size > 0) {

				Node node = q.remove();
				// System.out.print(node.data + " ");
				list.add(node.data);
				if (node.left != null) {
					q.add(node.left);
				}
				if (node.right != null) {
					q.add(node.right);
				}
				size--;
			}
			if (level % 2 == 0) {
				System.out.println(list);
			} else {
				Collections.reverse(list);
				System.out.println(list);
		}
			level++;
			System.out.println();
		}

	}

}
