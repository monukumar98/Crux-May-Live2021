package Lec62;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxUncrossedLines(int[] s1, int[] s2) {
        int [] []dp = new int  [s1.length+1] [s2.length+1];
		
		for (int i = 1; i <=s1.length; i++) {
			for (int j = 1; j <=s2.length; j++) {
				if(s1[i-1]==s2[j-1]) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
				
			}
			
		}
		return dp[s1.length][s2.length];
       
     
   }
}
