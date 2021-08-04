package Lec35;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 final int i=90;
//		 i=89;
		// Case 1
		P obj = new P();
		System.out.println(obj.d);// 3
		System.out.println(obj.d1);// 30
		obj.fun();// P
		obj.fun1();// P

		// Case 2
		P obj1 = new C();

		System.out.println(obj1.d);// 3
		System.out.println(((C)obj1).d);// 4
		System.out.println(obj1.d1);// 30
		System.out.println(((C) obj1).d2);//40
		obj1.fun();//c
		obj1.fun1();//p
		((C)(obj1)).fun2();
		
		// Case 3
//	   C obj2 = new P();
//	   System.out.println(obj2.d);
//	   System.out.println(obj2.d1);
//	   System.out.println(obj2.d2);//c
//	   obj2.fun2();
		
		// Case 4 
		
		C obj4 = new C();
		System.out.println(obj4.d);//c
		System.out.println(((P)(obj4)).d);//p
		System.out.println(obj4.d2);
		obj4.fun();//c
		obj4.fun1();
		obj4.fun2();
		

		
		
		
		

	}

}
