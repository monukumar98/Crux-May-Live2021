package Lec59;

import Lec57.Graph;

public class Kruskal_Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addedge(1, 2, 1);
		g.addedge(1, 4, 7);
		g.addedge(2, 3, 3);
		g.addedge(5, 7, 6);
		g.addedge(4, 5, 8);
		g.addedge(3, 4, 5);
		g.addedge(5, 6, 2);
		g.addedge(6, 7, 4);
		//g.Kruskal();
		g.Prims();

	}

}
