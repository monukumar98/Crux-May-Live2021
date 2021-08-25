package Lec47;

public class Preorder_and_Inorder {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return Create_Tree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);

		}

		public TreeNode Create_Tree(int[] pre, int[] in, int plo, int phi, int ilo, int ihi) {

			if (plo > phi || ilo > ihi) {
				return null;
			}

			TreeNode node = new TreeNode();
			node.val = pre[plo];
			int i = search(in, pre[plo], ilo, ihi);
			int nel = i - ilo;
			node.left = Create_Tree(pre, in, plo + 1, plo + nel, ilo, i - 1);
			node.right = Create_Tree(pre, in, plo + nel + 1, phi, i + 1, ihi);
			return node;

		}

		public int search(int in[], int item, int ilo, int ihi) {

			for (int i = ilo; i <= ihi; i++) {
				if (in[i] == item) {
					return i;
				}

			}
			return -1;

		}

	}

}
