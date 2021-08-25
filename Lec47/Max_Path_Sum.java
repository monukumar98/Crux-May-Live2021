package Lec47;

public class Max_Path_Sum {

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
		public int maxPathSum(TreeNode root) {
			HeapMover mover = new HeapMover();
			maxPathSum1(root, new HeapMover());
			return mover.res;

		}

		public class HeapMover {
			int res = Integer.MIN_VALUE;
		}

		public int maxPathSum1(TreeNode root, HeapMover mover) {
			if (root == null) {
				return 0;
			}

			int l = maxPathSum1(root.left, mover);
			int r = maxPathSum1(root.right, mover);
			int sp = Math.max(Math.max(l, r) + root.val, root.val);
			int rp = Math.max(l + r + root.val, sp);
			mover.res = Math.max(rp, mover.res);
			return sp;

		}

	}

}
