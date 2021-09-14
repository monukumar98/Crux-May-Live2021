package Lec48;

public class Is_Bst {
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

	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}

		boolean ls = isValidBST(root.left);
		boolean rs = isValidBST(root.right);
		int left_max = max(root.left);
		int right_min = min(root.right);
		if (ls && rs && left_max < root.val && root.val < right_min) {
			return true;
		}
		return false;

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

	public int max(TreeNode node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		if (node.right == null) {
			return node.val;
		}
		return max(node.right);

	}

	public class BST_Pair {
		boolean isbst = true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
	}

	public BST_Pair isValidBST_Optimize(TreeNode root) {

		if (root == null) {
			return new BST_Pair();
		}

		BST_Pair lbstp = isValidBST_Optimize(root.left);
		BST_Pair rbstp = isValidBST_Optimize(root.right);

		BST_Pair sbstp = new BST_Pair();
		if (lbstp.isbst && rbstp.isbst && lbstp.max < root.val && root.val < rbstp.min) {
			sbstp.isbst = true;
			sbstp.min = Math.min(lbstp.min, root.val);
			sbstp.max = Math.max(rbstp.max, root.val);

			return sbstp;
		}

		sbstp.isbst = false;
		sbstp.min = Math.min(lbstp.min, root.val);
		sbstp.max = Math.max(rbstp.max, root.val);
		return sbstp;

	}

}
