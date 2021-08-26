package Lec48;

import Lec46.Root_to_Leaf_Numbers;
import Lec48.Is_Bst.TreeNode;

public class Maximum_Sum_BST_in_Bt {
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

	public class BST_Pair {
		boolean isbst = true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int ans = 0;

	}

	public BST_Pair MaxSum(TreeNode node) {
		if (node == null) {
			return new BST_Pair();
		}
		BST_Pair lp = MaxSum(node.left);
		BST_Pair rp = MaxSum(node.right);
		BST_Pair sp = new BST_Pair();
		int sum = lp.sum + rp.sum + node.val;

		if (lp.isbst && rp.isbst && lp.max < node.val && node.val < rp.min) {
			sp.isbst = true;
			sp.sum = sum;

			sp.min = Math.min(lp.min, node.val);
			sp.max = Math.max(rp.max, node.val);
			sp.ans = Math.max(lp.ans, Math.max(rp.ans, sp.sum));
			System.out.println(sp.ans);
			return sp;

		}

		sp.isbst = false;
		sp.sum = sum;

		sp.min = Math.min(lp.min, node.val);
		sp.max = Math.max(rp.max, node.val);
		sp.ans = Math.max(lp.ans, rp.ans);
		return sp;

	}

}
