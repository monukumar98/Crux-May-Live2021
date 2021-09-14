package Lec57;

import java.util.HashSet;

public class Client_Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addedge(1, 4, 6);
		g.addedge(1, 2, 10);
		g.addedge(2, 3, 7);
		g.addedge(3, 4, 5);
		//g.addedge(4, 5, 1);
		g.addedge(5, 6, 4);
		g.addedge(7, 5, 2);
		g.addedge(6, 7, 3);
		//g.display();
		//g.removeEdge(4, 5);
		//System.out.println(g.ContainsEdge(4,5));
//		g.addvertx(9);
//		g.addedge(9, 1, 8);
//		g.display();
		System.out.println(g.haspath(1, 6, new HashSet<Integer>()));
	//	g.Printallpath(1, 6, new HashSet<Integer>(),"");
		System.out.println(g.BFS(1, 6));
		System.out.println(g.DFS(1, 6));

	}

}
