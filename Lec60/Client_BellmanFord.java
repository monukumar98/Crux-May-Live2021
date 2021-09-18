package Lec60;

public class Client_BellmanFord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BellMan_Ford bfd = new BellMan_Ford(5);
		bfd.addEdge(1, 2, 8);
		bfd.addEdge(2, 5, -2);
		bfd.addEdge(5, 2, 1);
		bfd.addEdge(4, 5, 4);
		bfd.addEdge(3, 4, -3);
		bfd.addEdge(1, 3, 4);
		bfd.addEdge(1, 4, 5);
		bfd.Bellmanford(1);
		

	}

}
