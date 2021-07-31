package Lec34;

import java.util.Scanner;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hey Main");
		System.out.println("Hello CB");
	//	Person p1 = new Person("patlu", 20);
		 Person p = new Person();
		 System.out.println(p.getName());
		 p.setName("Kaju");
		 p.setAge(-90);
		 System.out.println(p.getName());
		 System.out.println(p.getAge());
//		 int [] arr  = new int [5];
//		 System.out.println(arr[5]);

		 
//		p.name="kaju";
//		p.age=-18;
		//p.IntroYourSelf();

	}

}
