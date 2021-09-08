package Lec54;

import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams_Optimize(str));

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> ans = new ArrayList<>();
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			
			String s1="";
			for (int j = 0; j < c.length; j++) {
				s1+=c[j];
			}
			
			if (!map.containsKey(s1)) {
				map.put(s1, new ArrayList<>());
			}
			map.get(s1).add(strs[i]);

		}
		//System.out.println(map);
		for (String key : map.keySet()) {
			ans.add(map.get(key));
			
		}
		return ans;

	}

	public static List<List<String>> groupAnagrams_Optimize(String[] strs) {
		List<List<String>> ans = new ArrayList<>();
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			
			int freq []= new int [26];
			for (int j = 0; j < strs[i].length(); j++) {
				int idx= strs[i].charAt(j)-'a';
				freq[idx]++;
			}
			
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < freq.length; j++) {
				if(freq[j]>0) {
					sb.append(freq[j]+" ");
				}
				else {
					sb.append('*'+" ");
				}
			}
			String s1 = sb.toString();
			if (!map.containsKey(s1)) {
				map.put(s1, new ArrayList<>());
			}
			map.get(s1).add(strs[i]);

		}
		//System.out.println(map);
		for (String key : map.keySet()) {
			ans.add(map.get(key));
			
		}
		return ans;

	}

}
