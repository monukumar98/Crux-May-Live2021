package Lec46;

public class Root_to_Leaf_Numbers {

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

		public int sumNumbers(TreeNode root) {
			return sumNumbers1(root, 0);

		}

		public int sumNumbers1(TreeNode root, int curr) {

			if (root == null) {
				return 0;
			}
			if (root.left == null && root.right == null) {
				return curr * 10 + root.val;
			}

			int ls = sumNumbers1(root.left, curr * 10 + root.val);

			int rs = sumNumbers1(root.right, curr * 10 + root.val);
			return ls + rs;

		}
	}

}
