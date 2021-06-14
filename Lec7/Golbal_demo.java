package Lec7;

public class Golbal_demo {
  static int val =100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		// Addition();
		int c = 8;
		int d = 9;
		
		System.out.println(val);//100
		hello(val);//101
		
		System.out.println(val);//100
		

	}
	public static int  hello(int a) {
		a++;
	
	//int val =Golbal_demo.val;
		val+=5;
		System.out.println("hell "+val);
		return a;
	}
}