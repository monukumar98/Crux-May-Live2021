package Lec60;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {

	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}

	}

	public void addEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public class DijkstraPair implements Comparable<DijkstraPair> {
		int vt;
		String psf;

		int cost;

		public DijkstraPair(int vt, String psf, int cost) {
			// TODO Auto-generated constructor stub
			this.vt = vt;
			this.psf = psf;
			this.cost = cost;
		}

		@Override
		public int compareTo(DijkstraPair o) {
			// TODO Auto-generated method stub
			return this.cost-o.cost;
		}
		
		@Override
		public String toString() {
			return this.vt+" vai "+this.psf+" @ "+this.cost;
		}
	}

	public void Dijkstra_algo_(int src) {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>();
		DijkstraPair dj = new DijkstraPair(src, "" + src, 0);
		pq.add(dj);
		while (!pq.isEmpty()) {
			// remove
			DijkstraPair rp = pq.remove();

			// Ignore
			if (visited.contains(rp.vt)) {
				continue;
			}

			// Visited Mark
			visited.add(rp.vt);

			System.out.println(rp);

			// Nbrs add
			for (int nbrs : map.get(rp.vt).keySet()) {
				if (!visited.contains(nbrs)) {
					DijkstraPair np = new DijkstraPair(nbrs, rp.psf + nbrs, rp.cost + map.get(rp.vt).get(nbrs));
					pq.add(np);
				}

			}

		}

	}

}
