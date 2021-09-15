package Lec57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}

	}

	public int noofvertex() {

		return this.map.size();
	}

	public int noofEdge() {
		int no_edge = 0;
		for (int key : this.map.keySet()) {// 1 ,2,3,4,5,6,7
			no_edge += map.get(key).size();

		}
		return no_edge / 2;

	}

	public void addvertx(int v1) {
		map.put(v1, new HashMap<>());

	}

	public void addedge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1-->v2,cost
		map.get(v2).put(v1, cost);// v2-->v1,cost

	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}

	}

	public void removevertex(int v1) {

		for (int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);

		}
		map.remove(v1);

	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + "-->" + map.get(key));

		}
	}

	public boolean haspath(int src, int dis, HashSet<Integer> visited) {

		if (src == dis) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ispath = haspath(nbrs, dis, visited);
				if (ispath) {
					return ispath;
				}
			}
		}
		return false;

	}

	public void Printallpath(int src, int dis, HashSet<Integer> visited, String str) {

		if (src == dis) {
			System.out.println(str + dis);
			return;
		}
		visited.add(src);

		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				Printallpath(nbrs, dis, visited, str + src);

			}
		}
		visited.remove(src);

	}

	public boolean BFS(int src, int dis) {
		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<>();

		q.add(src);

		while (!q.isEmpty()) {
			// 1st remove
			int rv = q.remove();

			if (rv == dis) {
				return true;
			}
			// Ignore
			if (visited.contains(rv)) {
				continue;
			}

			// Visited Mark
			visited.add(rv);

			// nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}

			}

		}
		return false;

	}

	public boolean DFS(int src, int dis) {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();

		s.push(src);

		while (!s.isEmpty()) {
			// 1st remove
			int rv = s.pop();

			if (rv == dis) {
				return true;
			}
			// Ignore
			if (visited.contains(rv)) {
				continue;
			}

			// Visited Mark
			visited.add(rv);

			// nbrs
			for (int nbrs : map.get(rv).keySet()) {
				if (!visited.contains(nbrs)) {
					s.push(nbrs);
				}

			}

		}
		return false;

	}

	public void BFT() {
		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {

			// jo Vtx Already marked usko Ignore kr rahe ho
			if (visited.contains(src)) {
				continue;
			}

			q.add(src);

			while (!q.isEmpty()) {
				// 1st remove
				int rv = q.remove();

				// Ignore
				if (visited.contains(rv)) {
					continue;
				}
				System.out.print(rv + " ");
				// Visited Mark
				visited.add(rv);

				// nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}

				}

			}
		}
	}

	public void DFT() {
		Stack<Integer> s = new Stack<Integer>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {

			if (visited.contains(src)) {
				continue;
			}
			s.push(src);

			while (!s.isEmpty()) {
				// 1st remove
				int rv = s.pop();

				// Ignore
				if (visited.contains(rv)) {
					continue;
				}
				System.out.print(rv + " ");
				// Visited Mark
				visited.add(rv);

				// nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						s.push(nbrs);
					}

				}
			}

		}
	}

	public boolean isCycle() {
		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {

			// jo Vtx Already marked usko Ignore kr rahe ho
			if (visited.contains(src)) {
				continue;
			}

			q.add(src);

			while (!q.isEmpty()) {
				// 1st remove
				int rv = q.remove();

				// Ignore
				if (visited.contains(rv)) {
					return true;
				}

				// Visited Mark
				visited.add(rv);

				// nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}

				}

			}
		}
		return false;
	}

	public boolean IsConnacted() {

		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<>();
		int count = 0;
		for (int src : map.keySet()) {

			// jo Vtx Already marked usko Ignore kr rahe ho
			if (visited.contains(src)) {
				continue;
			}
			count++;

			q.add(src);

			while (!q.isEmpty()) {
				// 1st remove
				int rv = q.remove();

				// Ignore
				if (visited.contains(rv)) {
					continue;
				}

				// Visited Mark
				visited.add(rv);

				// nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}

				}

			}
		}
		
		return count == 1;

	}

	public ArrayList<ArrayList<Integer>> GetAll_Connacted() {

		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		int count = 1;
		for (int src : map.keySet()) {

			// jo Vtx Already marked usko Ignore kr rahe ho
			if (visited.contains(src)) {
				continue;
			}
			count++;
			ArrayList<Integer> list = new ArrayList<>();
			q.add(src);

			while (!q.isEmpty()) {
				// 1st remove
				int rv = q.remove();

				// Ignore
				if (visited.contains(rv)) {
					continue;
				}

				// Visited Mark
				visited.add(rv);
				list.add(rv);

				// nbrs
				for (int nbrs : map.get(rv).keySet()) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}

				}

			}
			ans.add(list);
		}
		return ans;

	}

	public boolean isTree() {
		return (!isCycle()) && IsConnacted();
	}

}
