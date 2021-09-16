package Lec58;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
	
	    
		public class BipartitePair{
			int vt;
			int lv;
			public BipartitePair(int vt,int lv) {
				// TODO Auto-generated constructor stub
				this.vt=vt;
				this.lv=lv;
			}
		}
	    public boolean isBipartite(int[][] graph) {
//	    	 HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
//		        for (int i = 0; i <graph.length; i++) {
//		        	map.put(i, new HashMap<>());
//					
//				}
//		        for (int i = 0; i < graph.length; i++) {
//		        	for (int j = 0; j < graph[i].length; j++) {
//		        		int a = graph[i][j];
//						map.get(i).put(a, 1);
//					}
//					
//				}
		        
	    	//HashMap<Integer,BipartitePair> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();
        BipartitePair[] visited = new BipartitePair[graph.length];
      
		        
		        int n = graph.length-1;
		        
		        for (int i=0; i<=n; i++) {

					// jo Vtx Already marked usko Ignore kr rahe ho
					if (visited[i]!=null) {
						continue;
					}
					BipartitePair p = new  BipartitePair(i, 0);

					q.add(p);

					while (!q.isEmpty()) {
						// 1st remove
						BipartitePair rv = q.remove();

						// Ignore
						if (visited[rv.vt]!=null && visited[rv.vt].vt==rv.vt) {
							if(rv.lv!=visited[rv.vt].lv) {
								return false;
							}
							
						}

						// Visited Mark
						visited[rv.vt]=rv;

						// nbrs
						for (int nbrs : graph[rv.vt] ) {
							if (visited[rv.vt]!=null) {
								BipartitePair np = new BipartitePair(nbrs, rv.lv+1);
								q.add(np);
								
							}

						}

					}
				}
				return true;
				
		      

		}
	
	public static void main(String[] args) {
		Bipartite p = new Bipartite();
		System.out.println(p.isBipartite(new int [4][5]));
	}
}
