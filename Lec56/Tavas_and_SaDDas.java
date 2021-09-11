package Lec56;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "7747";
		System.out.println(Luckynumbers(str));

	}

	public static int Luckynumbers(String str) {
		int pos=0;
		int d = str.length();// total digit is d
		// d-1 me total Luck Number 
		int ans  = (1<<d)-2;
		
		for (int i = str.length()-1; i>=0; i--) {
			if(str.charAt(i)=='7') {
				ans+=(1<<pos);
			}
			pos++;
		}
		return ans+1;

	}

}
