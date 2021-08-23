package Lec46;

public class Mirror {

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
		public TreeNode invertTree(TreeNode root) {
			if (root == null) {
				return null;
			}

			// left
			TreeNode left = invertTree(root.left);
			// right
			TreeNode right = invertTree(root.right);
			root.left = right;
			root.right = left;
			return root;

		}
	}

}
