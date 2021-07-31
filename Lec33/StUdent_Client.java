package Lec33;

public class StUdent_Client {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name = "Hardik";
		s.age = 26;
		System.out.println(s.name);
		System.out.println(s.age);

		Student s1 = new Student();
		System.out.println(s1.name);
		System.out.println(s1.age);

		s1.name = "Kunal";
		s1.age = 30;
		System.out.println(s.name + " " + s.age);// hardik 26
		System.out.println(s1.name + " " + s1.age);// kunal 30
		// Test1(s, s1);
		// Test2(s, s1);
//		int myAge = 22;
//		String myName = "Kaju";
//		Test3(s1, s1.age, s1.name, myAge, myName);
//		System.out.println(s.name + " " + s.age);// kunal 30
//		System.out.println(s1.name + " " + s1.age);// hardik 26
		s.IntroYourSelf();
		s1.IntroYourSelf();
		s.sayHey("Gurmeet");// hardik

	}

	public static void Test3(Student s, int age, String name, int myAge, String myName) {
		s.age = 0;
		s.name = "_";
		age = 0;
		name = "_";
		myAge = 0;
		myName = "_";
	}

	public static void Test2(Student s2, Student s3) {

		s2 = new Student();
		int tempa = s2.age;
		s2.age = s3.age;
		s3.age = tempa;

		s3 = new Student();
		String tempn = s2.name;
		s2.name = s3.name;
		s3.name = tempn;
	}

	public static void Test1(Student s, Student s1) {
		Student t = s;
		s = s1;
		s1 = t;
		System.out.println(s.name + " " + s.age);
		System.out.println(s1.name + " " + s1.age);
	}

}
