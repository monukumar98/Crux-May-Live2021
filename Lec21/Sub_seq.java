package Lec21;

public class Sub_seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print_SubSeq("abc", "");

	}

	public static void Print_SubSeq(String Ques, String ans) {
		// TODO Auto-generated method stub
		if (Ques.length() == 0) {
			System.out.println(ans);
			 return;
		} 

			char ch = Ques.charAt(0);
			Print_SubSeq(Ques.substring(1), ans);// bc , ""   no 
			Print_SubSeq(Ques.substring(1), ans + ch);// bc, "a"   yes 
		
	}

}
