package Lec17;

public class Minimum_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(MinimumWindon(s, t));

	}

	public static String MinimumWindon(String s, String t) {
		int freq_t[] = new int[256];
		int freq_s[] = new int[256];
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freq_t[ch]++;

		}

		int count = 0;
		int start = 0;
		int min_len = Integer.MAX_VALUE;// 2^31-1
		int start_Index = -1;

		for (int end = 0; end < s.length(); end++) {
			char ch = s.charAt(end);
			freq_s[ch]++;
			if (freq_s[ch] <= freq_t[ch]) {
				count++;
			}
			if (count == t.length()) {
				while (freq_s[s.charAt(start)] > freq_t[s.charAt(start)] || freq_t[s.charAt(start)] == 0) {

					if (freq_s[s.charAt(start)] > freq_t[s.charAt(start)]) {
						freq_s[s.charAt(start)]--;
					}
					start++;
				}

				if (min_len > end - start + 1) {
					min_len = end - start + 1;
					start_Index = start;
				}

			}

		}
		if (start_Index == -1) {
			return "";
		}
		return s.substring(start_Index, start_Index + min_len);

	}

}
