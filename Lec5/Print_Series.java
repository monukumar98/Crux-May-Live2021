package Lec5;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2=sc.nextInt();
		int counter=0;
		int i=1;
		while(counter<n1) {
			int num = (3*i)+2;
			if(num%n2!=0){
				System.out.println(num);
				counter++;
			}
			i++;
		}

	}

}
