package Lec15;

public class StringBulide_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("heloo");
		StringBuilder sb1 = new StringBuilder("hhhhhhhhhhh");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb1.append('i');
		sb1.append('p');
		System.out.println(sb1);
		String s = sb.toString(); //builder to String 
		System.out.println(sb.length());
		System.out.println(sb.charAt(3));
		sb1.append("hello");
       System.out.println(	sb.indexOf("h"));
	 // append();
		

	}
	public static void append() {
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < 100000; i++) {
			ans.append(i);
			
		}
		System.out.println(ans.toString());
		
	}

}
