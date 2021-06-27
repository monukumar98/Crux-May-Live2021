package Lec15;

public class String_Demo_part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str2 = "hello";
		if (str == str2) { // address 
			System.out.println("bye");
		} else {
			System.out.println("Hey");
		}
		String str1 = new String("hello");
		if (str1 == str2) {
			System.out.println("bye");
		} else {
			System.out.println("Hey");
		}
		
		if (str.equals(str2)) {
			System.out.println("bye");
		} else {
			System.out.println("Hey");
		}
		
		if (str1.equals(str2)) {// Content ko 
			System.out.println("bye");
		} else {
			System.out.println("Hey");
		}
		
		
		
		

	}

}
