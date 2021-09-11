package Lec56;

import Lec55.Count_Set_Bit;

public class Avg_End_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5};
		int n =1000;
		System.out.println(EndGame(arr, n));
		

	}
	public static int EndGame(int []arr, int n) {
		
		int l = arr.length;
		int ans=0;
		for (int i = 1; i <(1<<l); i++) {
			if((Count_Set_Bit.countSetBit_Optimize(i)&1)==1) {
				ans = ans + n/totall_number(arr, i);
			}
			else {
				ans = ans - n/totall_number(arr, i);
			}
			
			
		}
		return ans;
		
	}
	
	public static int   totall_number(int [] arr , int i) {
		int pos = 0;
		int sum=1;
		while(i!=0) {
			if((i&1)==1) {
			sum*=arr[pos];
			}
			pos++;
			i>>=1;
			
		}
		return sum;
		
		
		
	}

}
