package Lec16;

public class Kartik_bhaiya_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababbaaabaa";
		int k=2;
		int flip_b=kartikbhaiyanadString(str, 'a', k);
		int flip_a=kartikbhaiyanadString(str, 'b', k);
		System.out.println(Math.max(flip_a, flip_b));
		
		

	}

	public static int kartikbhaiyanadString(String str, char c, int k) {
		int start = 0;
		int end = 0;
		int max_len = 0;
		int flip = 0;
		while (end < str.length()) {
			if (str.charAt(end) != c) {
				flip++;
			}

			// Window km kr
			while (flip > k) {

				if (str.charAt(start) != c) {
					flip--;
				}
				start++;
			}

			// ans update
			max_len = Math.max(max_len, end - start + 1);
			end++;

		}
		return max_len;

	}

}
