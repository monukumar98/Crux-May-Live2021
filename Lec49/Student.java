package Lec49;

public class Student {
	String Name;
	int marks;
	public Student(String name, int marks) {
		// TODO Auto-generated constructor stub
		this.marks=marks;
		this.Name=name;
	}
	@Override
	public String toString() {
		return this.Name+" "+this.marks;
	}

}
