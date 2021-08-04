package Lec36;

public class Student {

	private String name;
	private int roll;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;

	}
	@Override
	public String toString() {
		return "Name is "+this.name+" and roll no is "+this.roll;
		
	}
}
