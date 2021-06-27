package Lec15;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str = "hello";
	//	String str1="hello";
		String	str1="Hello";
//		str="bye";
//		str1="hey";
		System.out.println(str);
		String str2 = new String("hello");
		String st5 = new String("hello");
		String str3 ="hellobye";
		System.out.println(str.length());
		System.out.println(str3.charAt(5));
		// SubString 
		String str4 = str3.substring(2, 3);
		System.out.println(str4);
		System.out.println(str3.substring(4));
		// Cancat
		 
		String s = "Welcome to ";
		String s1 = "CB";
//		s=s.concat(s1);
//		System.out.println(s);
		s= s+s1;
		System.out.println(s);
		
		
		System.out.println(str1.substring(0,0));
		
		// Index of 
		System.out.println(str.indexOf('l'));
		
		System.out.println(str.lastIndexOf('l'));// char ka Index 
		
		System.out.println(str3.startsWith("hel"));
		
		System.out.println(str3.endsWith("bye"));
		 append();
        

 
	}
	
	public static void append() {
		String ans = "";
		for (int i = 0; i < 100000; i++) {
			ans= ans + i;
			
		}
		System.out.println(ans);
		
	}

}
