package Lec3;
import java.util.*;
public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32145;
		int idx = 1;
		int ans = 0;
		while (n > 0) {
			int rem = n % 10;
			ans += (int) (idx * Math.pow(10, rem - 1));
			n/=10;
			idx++;
			
		}
		System.out.println(ans);

	}

}
