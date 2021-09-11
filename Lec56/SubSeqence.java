package Lec56;

public class SubSeqence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc";
		printSub(str);

	}

	public static  void printSub(String str) {
		int n = str.length();
		for (int i = 0; i < (1<<n); i++) {
			
			printPattern(str , i);
		}
		
		
		
	}
	public static void  printPattern(String str , int i) {
		int pos=0;
		while(i!=0) {
			if((i&1)==1) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i>>=1;
			
		}
		System.out.println();
		
		
		
	}

}
