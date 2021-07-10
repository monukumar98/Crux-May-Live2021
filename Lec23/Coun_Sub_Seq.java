package Lec23;

public class Coun_Sub_Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Count_SubSeq("abc", ""));

	}

	public static int Count_SubSeq(String Ques, String ans) {
		// TODO Auto-generated method stub
		if (Ques.length() == 0) {

			return 1;
		}
		// int ans1=0;
		char ch = Ques.charAt(0);
		int ans1 = Count_SubSeq(Ques.substring(1), ans);// bc , "" no
		int ans2 = Count_SubSeq(Ques.substring(1), ans + ch);// bc, "a" yes

		return ans1+ans2;
	}

}
