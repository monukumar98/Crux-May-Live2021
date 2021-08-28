package Lec49;

import java.util.Arrays;
import java.util.Comparator;

public class Student_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = new Student[5];
		arr[0]= new Student("Rahul", 75);
		arr[1]= new Student("Mohan", 75);
		arr[2]= new Student("Rani", 95);
		arr[3]= new Student("Shivani", 55);
		arr[4]= new Student("Pooja", 85);
		Arrays.sort(arr, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.marks-o2.marks;
			}
		});
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
