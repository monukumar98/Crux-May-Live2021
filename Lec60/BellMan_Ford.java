package Lec60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BellMan_Ford {

	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public BellMan_Ford(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void addEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);

	}

	public ArrayList<Edge> getAllEdge() {
		ArrayList<Edge> ans = new ArrayList<>();

		for (int key : map.keySet()) {

			for (int nbrs : map.get(key).keySet()) {
				Edge eg = new Edge(key, nbrs, map.get(key).get(nbrs));
				ans.add(eg);
			}

		}

		return ans;

	}

	public class Edge {

		int vt1;
		int vt2;
		int cost;

		public Edge(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.vt1 = v1;
			this.vt2 = v2;
			this.cost = cost;
		}

		public String toString() {
			return this.vt1 + "-->" + vt2 + " @ " + this.cost;
		}

	}

	public void Bellmanford(int src) {
		int v = map.size();
		int[] dis = new int[v + 1];

		ArrayList<Edge> edgelist = getAllEdge();
		Arrays.fill(dis, 1000000);

		dis[src] = 0;
		for (int i = 1; i <=v; i++) {
			for(Edge eg : edgelist) {
				int v1 = eg.vt1;// v1-->v2 with Cost c
				int v2=eg.vt2;
				int c =eg.cost;
				if(dis[v2]>dis[v1]+c) {
					if(i<v) {
					dis[v2]=dis[v1]+c;
					}
					else {
						System.out.println("-ve cycle ");
						return;
					}
				}
			}
			
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.println(i+" "+dis[i]);
			
		}

	}

}
