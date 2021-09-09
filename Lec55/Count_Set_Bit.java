package Lec55;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67;
		System.out.println(countSetBit(n));
		System.out.println(countSetBit_Optimize(n));

	}

	public static int countSetBit(int n) {

		int count = 0;
		while (n != 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n >>= 1;// n=n>>1;

		}
		return count;
	}
	public static int countSetBit_Optimize(int n) {

		int count = 0;
		while (n != 0) {
			count++;
			n=(n&(n-1));

		}
		return count;
	}

}
