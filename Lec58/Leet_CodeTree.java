package Lec58;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Leet_CodeTree {
	class Solution {
		
	    public boolean validTree(int n, int[][] edges) {
	    	
	        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
	        for (int i = 0; i <n; i++) {
	        	map.put(i, new HashMap<>());
				
			}
	        
	        for (int i = 0; i < edges.length; i++) {
				int a= edges[i][0];
				int b = edges[i][1];
				map.get(a).put(b, 1);
				map.get(b).put(a, 1);
				
			}
	        Queue<Integer> q = new LinkedList<Integer>();
			HashSet<Integer> visited = new HashSet<>();
			int count=0;
			for (int src : map.keySet()) {

				// jo Vtx Already marked usko Ignore kr rahe ho
				if (visited.contains(src)) {
					continue;
				}

				q.add(src);
                   count++;
				while (!q.isEmpty()) {
					// 1st remove
					int rv = q.remove();

					// Ignore
					if (visited.contains(rv)) {
						return false;
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
			return count==1;
	        
	    }
	    
	}
}
