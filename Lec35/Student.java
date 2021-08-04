package Lec35;

public class Student {

	String name;
	int roll;
	

	public  Student(String name, int roll) {
		System.out.println("I am in Student");
		this.name = name;
		this.roll = roll;
		no_of_Student++;

	}
	static int no_of_Student;
	public static void fun() {
		
		no_of_Student++;
	}

	static {

		System.out.println("I am Monu static");
	}

}
