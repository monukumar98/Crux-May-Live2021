package Lec13;

public class Arrays_2_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(a);
		int [] []a = new int[3][4];
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[2][3]);
		a[0][2]=90;
		for (int i = 0; i < a[0].length; i++) {
			System.out.print(a[0][i]+" ");
		}
		System.out.println();
	   System.out.println(".................");
	   a[1][3]=60;
      for (int i = 0; i < a.length; i++) {// a.length --> row
		for (int j = 0; j < a[0].length; j++) {
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}
	}

}
