package Lec45;

public class LCa {
	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	      if(root==null){
	          return null;
	      }
	        if(root==p || root==q){
	            return root;
	        }
	        
	        TreeNode left=lowestCommonAncestor(root.left,p,q);
	         TreeNode right=lowestCommonAncestor(root.right,p,q);
	        if(left!=null && right!=null){
	            return root;
	        }
	        else if(left!=null && right==null){
	            return left;
	            
	        }
	        else{
	            return right;
	        }
	        
	        
	        
	        
	        
	    }
}
