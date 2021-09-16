package Lec59;

import java.util.HashMap;

public class Disjoint_Set_Union {

	public class Node {
		int data;
		Node Parent;
		int rank;

	}

	HashMap<Integer, Node> dsu = new HashMap<>();

//O(1)
	public void Create(int val) {

		Node node = new Node();
		node.data = val;
		node.Parent = node;
		node.rank = 0;
		dsu.put(val, node);

	}

	public int  find(int val) {
		Node node = dsu.get(val);
		return find(node).data;

	}
// log(N)
	private Node find(Node node) {
		// TODO Auto-generated method stub
		if (node.Parent == node) {
			return node;
		}
		Node nn =  find(node.Parent);
		node.Parent=nn;
		return nn;

	}

	public void unoin(int val1, int val2) {
		Node n1 = find(dsu.get(val1));
		Node n2 = find(dsu.get(val2));

		if (n1.rank == n2.rank) {
			n1.Parent = n2;
			n2.rank++;
		} else if (n1.rank > n2.rank) {
			n2.Parent = n1;
		} else {
			n1.Parent = n2;
		}

	}

}
