package Lec2;

public class Grade_Carde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 47;
		if (marks <45) {
			System.out.println("Grade Fail");
		} 
		else if (marks < 65 && marks >= 55) {
			System.out.println("Grade C");
		} 
		else if (marks < 80 && marks >= 65) {
			System.out.println("Grade B");
		} 
		else if (marks < 55 && marks >= 45) {
			System.out.println("Grade D");

		}

		else {
			System.out.println("pass");
		}
		
		
		if(!(false)) {
			System.out.println("bye");
		}
	}

}
