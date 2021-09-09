package Lec55;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Vertical_Ordrer {
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
		public class VerticalPair {
			TreeNode node;
			int vt;
			int ht;

			public VerticalPair(TreeNode node, int vt, int ht) {
				// TODO Auto-generated constructor stub
				this.node = node;
				this.ht = ht;
				this.vt = vt;
			}
		}

		public List<List<Integer>> verticalTraversal(TreeNode root) {

			LinkedList<VerticalPair> q = new LinkedList<>();
			TreeMap<Integer, ArrayList<VerticalPair>> map = new TreeMap<>();
			q.add(new VerticalPair(root, 0, 0));
			while (!q.isEmpty()) {
				VerticalPair rp = q.removeFirst();
				// Strore
				if (!map.containsKey(rp.vt)) {
					map.put(rp.vt, new ArrayList<>());
				}
				map.get(rp.vt).add(rp);

				if (rp.node.left != null) {
					q.add(new VerticalPair(rp.node.left, rp.vt - 1, rp.ht + 1));
				}
				if (rp.node.right != null) {
					q.add(new VerticalPair(rp.node.right, rp.vt + 1, rp.ht + 1));
				}

			}
			List<List<Integer>> ans = new ArrayList<>();
			for (int key : map.keySet()) {
				List<VerticalPair> ll = map.get(key);
				Collections.sort(ll, new Comparator<VerticalPair>() {

					@Override
					public int compare(VerticalPair o1, VerticalPair o2) {
						// TODO Auto-generated method stub
						if (o1.ht == o2.ht) {
							return o1.node.val - o2.node.val;
						}
						return 0;
					}
				});
//                  int 
				List<Integer> temp = new ArrayList<>();
				for (VerticalPair vp : ll) {
					temp.add(vp.node.val);
				}
				ans.add(temp);

			}

			return ans;

		}

	}
}
