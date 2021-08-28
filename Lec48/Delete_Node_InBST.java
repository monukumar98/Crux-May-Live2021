package Lec48;

import Lec48.Is_Bst.TreeNode;

public class Delete_Node_InBST {

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
		public TreeNode deleteNode(TreeNode root, int key) {
			return deleteKey(root, key);

		}

		public TreeNode deleteKey(TreeNode node, int key) {
			if (node == null) {
				return null;
			}
			if (node.val > key) {
				node.left = deleteKey(node.left, key);
			} else if (node.val < key) {
				node.right = deleteKey(node.right, key);
			} else {

				// 1 or 0 child
				if (node.left == null) {
					return node.right;
				} else if (node.right == null) {
					return node.left;
				}

				else {
					int val = min(node.right);
					node.val = val;
					node.right=deleteKey(node.right, val);
				}
			}
			return node;

		}

		public int min(TreeNode node) {
			if (node == null) {
				return Integer.MAX_VALUE;
			}

			if (node.left == null) {
				return node.val;
			}
			return min(node.left);

		}
	}
}
