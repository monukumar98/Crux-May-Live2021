package Lec8;
import java.util.*;

import Lec3.Sum_of_N_Number;
public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		System.out.println(Chewbacca(n));
		

	}
	public static long Chewbacca(long n) {
		long ans=0;
		long mul=1;
		
		while(n>9) {
			long t = n%10;
			if(t>9-t) {
				ans = ans + (9-t)*mul;
			}
			else {//0 1 2 3 4 
				ans= ans + t*mul;
			
			}
			n=n/10;
			mul=mul*10;
			
		}
		if(n!=9) {
			if(n>9-n) {
				n=9-n;
			}
		}
		ans = ans + n*mul;
		return ans;
	}
	
	

}
