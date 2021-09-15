package Lec58;

import Lec57.Graph;

public class Graph_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);
		g.addedge(1, 4, 6);
		g.addedge(1, 2, 10);
		g.addedge(2, 3, 7);
		//g.addedge(3, 4, 5);
		g.addedge(4, 5, 1);
		g.addedge(5, 6, 4);
		g.addedge(7, 5, 2);
		//g.addedge(6, 7, 3);
		g.addvertx(9);
		//g.BFT();
		//System.out.println();
		///g.DFT();
		//System.out.println();
		System.out.println(g.isCycle());
		System.out.println(g.IsConnacted());
		System.out.println(g.GetAll_Connacted());
		System.out.println(g.isTree());
	}

}
