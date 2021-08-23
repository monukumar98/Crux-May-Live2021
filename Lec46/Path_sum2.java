package Lec46;

import java.util.ArrayList;
import java.util.List;

import Lec46.Path_Sum.TreeNode;

public class Path_sum2 {
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
		public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
			List<List<Integer>> list = new ArrayList<>();
			List<Integer> curr = new ArrayList<>();
			hasPathSum(root, targetSum, list, curr);
			return list;

		}

		public void hasPathSum(TreeNode root, int targetSum,List<List<Integer>> list,	List<Integer> curr) {

			if (root == null) {
				return;
			}

			if (root.left == null && root.right == null && targetSum - root.val == 0) {
				 curr.add(root.val);
				 list.add(new ArrayList<Integer>(curr));
				 curr.remove(curr.size()-1);
				 
				
			}
			 curr.add(root.val);
			 hasPathSum(root.left, targetSum - root.val,list,curr);
			 hasPathSum(root.right, targetSum - root.val,list,curr);
			 curr.remove(curr.size()-1);

		}

	}

}
