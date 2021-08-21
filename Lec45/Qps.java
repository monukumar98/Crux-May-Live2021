package Lec45;

public class Qps {

	  private class DiaPair {
			int ht = -1;
			int dia = 0;
		}

		
	   // O n
	    public int diameterOfBinaryTree(TreeNode node) {

			if (node == null) {
				return 0;
			}
	        return diameterOfBinaryTree2(node).dia;


		}
	    
	  public DiaPair diameterOfBinaryTree2(TreeNode node) {
			if (node == null) {
				return new DiaPair();
			}

			DiaPair ldp = diameterOfBinaryTree2(node.left);
			DiaPair rdp = diameterOfBinaryTree2(node.right);
			DiaPair sdp = new DiaPair();
			int sd = ldp.ht + rdp.ht + 2;
			int ht = Math.max(ldp.ht, rdp.ht) + 1;
			sdp.dia = Math.max(ldp.dia, Math.max(rdp.dia, sd));
			sdp.ht = ht;
			return sdp;

		}
	      // N^2
	  public int diameterOfBinaryTree(TreeNode node) {

			if (node == null) {
				return 0;
			}

			int ld = diameterOfBinaryTree(node.left);
			int rd = diameterOfBinaryTree(node.right);
			int sd = ht(node.left) + ht(node.right) + 2;
			return Math.max(sd, Math.max(ld, rd));

		}
	    
	    private int ht(TreeNode node) {
			// TODO Auto-generated method stub
			if (node == null) {
				return -1;
			}

			int left_ht = ht(node.left);
			int right_ht = ht(node.right);
			return Math.max(left_ht, right_ht) + 1;
		}
	 
	 public boolean isBalanced(TreeNode node) {
	       
	        
	    }
	    
	    
    
}
