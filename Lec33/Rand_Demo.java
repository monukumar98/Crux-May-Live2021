package Lec33;

import java.util.Random;

public class Rand_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		int low = -100;
		int high = 100;
		Gen_Random_Number(low, high);

	}
	public static void Gen_Random_Number(int si, int ei) {
		Random rn = new Random();
		for (int i = 1; i <=10; i++) {
			int num = rn.nextInt(ei-si)+si;
			System.out.println(num);
			
		}
		
		
	}

}
