package Lec22;

public class Toh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_toh(3, "T1", "T2", "T3");

	}

	public static void print_toh(int n, String Src, String help, String Dis) {
		
		if(n==0) {
			return;
		}
		print_toh(n-1, Src, Dis,help);
		System.out.println("Move "+n+"th disk  from "+Src+" to "+ Dis);
		print_toh(n-1, help, Src, Dis);
		
		
 
	}

}
