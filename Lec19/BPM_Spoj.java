package Lec19;

import java.util.Scanner;

public class BPM_Spoj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i=1;
		while(t>0) {
			int n = sc.nextInt();
			int rem = n%4;
			if(rem==3 || rem==0) {
				System.out.println("Case "+i+": " + 0);
			}
			else {
				System.out.println("Case "+i+": " +1);
			}
			t--;
			i++;
		}

		
	}

}
