package Lec46;

public class Lca3 {
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node parent;
	}

	class Solution {
		 public Node lowestCommonAncestor(Node p, Node q) {
			 
			 if(IsCover(p,q)) {
				 return p;
		        
		    }
			 if(IsCover(q,p)) {
				 return q;
		        
		    }
			 // diff  SubTree
			 return  lowestCommonAncestor(p.parent, q.parent);
			 
			 
			 
		 }
		public boolean IsCover(Node p, Node q){
			if(p==null) {
				return false;
			}
			
			
			if(p==q) {
				return true;
			}
			return IsCover(p.left, q) || IsCover(p.right, q);
			
		}

	}
}

