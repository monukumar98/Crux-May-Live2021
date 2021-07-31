package Lec34;

public class Person {

	private String name = "Motu";
	private int age = 90;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Person() {
		this.name = "patlu";
		this.age = 18;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;
	}

	public void IntroYourSelf() {
		System.out.println("my name is " + this.name + " and age is " + this.age);
	}

}
