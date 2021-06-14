package Lec7;
public class Mayank_Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		while(row < n ) {
			int val = 1;
			int r = 0;
			while(r<=row) {
				System.out.print(val+" ");
				val = (val * (row-r))/( r + 1);
				r++;
			}
			row++;
			System.out.println();
		}

	}

}