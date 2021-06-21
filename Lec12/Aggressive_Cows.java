package Lec12;

import java.util.Arrays;
import java.util.Scanner;


public class Aggressive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int[] stalls = new int[nos];
		for (int i = 0; i < stalls.length; i++) {
			stalls[i] = sc.nextInt();
		}

		Arrays.sort(stalls);
		System.out.println(AggressiveCows(stalls, noc));

	}

	public static int AggressiveCows(int[] Stall, int noc) {
		int lo = 0;
		int hi = Stall[Stall.length - 1] - Stall[0];
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(Stall, noc, mid)) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}
		return ans;

	}

	public static boolean isitpossible(int[] stall, int noc, int mid) {
		// TODO Auto-generated method stub
		int cow=1;// kitne cow palce 
		int placeholder= stall[0];// where 
		int i=1;
		while(i<stall.length) {
			if(stall[i]-placeholder>=mid) {
				cow++;
				placeholder=stall[i];
			}
			i++;
			 if(cow>=noc) {
				 return true;
			 }
			
		}

		return false;
	}

}
