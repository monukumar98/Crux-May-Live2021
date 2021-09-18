package Lec60;

public class Dijkstra_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dijkstra_Algo dg = new Dijkstra_Algo(7);
		dg.addEdge(1, 2, 2);
		dg.addEdge(2, 3, 3);
		dg.addEdge(1, 4, 10);
		dg.addEdge(3, 4, 1);
		dg.addEdge(4, 5, 8);
		dg.addEdge(5, 6, 5);
		dg.addEdge(5, 7, 6);
		dg.addEdge(6, 7, 4);
		dg.Dijkstra_algo_(1);
	}

}
