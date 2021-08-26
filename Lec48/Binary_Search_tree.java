package Lec48;

public class Binary_Search_tree {

	public class Node {
		int val;
		Node left;
		Node right;

	}

	private Node root;

	public Binary_Search_tree(int in[]) {
		// TODO Auto-generated constructor stub
		this.root = Create_tree(in, 0, in.length - 1);

	}

	private Node Create_tree(int in[], int lo, int hi) {
		if (lo > hi) {
			return null;
		}

		int mid = (lo + hi) / 2;
		Node node = new Node();
		node.val = in[mid];
		node.left = Create_tree(in, lo, mid - 1);
		node.right = Create_tree(in, mid + 1, hi);
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

}
