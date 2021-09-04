package Lec52;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Demo_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();//
		map.put("Rahul", 98);//O(1)
		map.put("Jatin", 78);
		map.put("Pooja", 89);
		map.put("Shivani", 77);
		map.put("Ravi", 77);
		map.put("Shivani", 87);
		map.put("Anku", 97);
		System.out.println(map.get("Jatin"));//O(1)
		//map.put(null, null);
		System.out.println(map);
//		System.out.println(map.containsKey("Jatin"));////O(1)
//		Set<String> key = map.keySet();
//		for(String s : key) {
//			System.out.println(s+" "+map.get(s)+" ");
//		}
//		ArrayList<String> list = new ArrayList<>( map.keySet());
//		System.out.println(list);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Rahul", 98);// long(N)
		map1.put("Jatin", 78);
		map1.put("Pooja", 89);
		map1.put("Shivani", 77);
		map1.put("Ravi", 77);
		map1.put("Shivani", 87);
		map1.put("Anku", 97);
	//	map1.put(null, null); Allowed nhi hai 
		System.out.println(map1);
		System.out.println(map1.containsKey("Anku"));// long(N)
		System.out.println(map1.get("Shivani"));//// long(N)
		
		
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		map2.put("Rahul", 98);// O(1)
		map2.put("Jatin", 78);
		map2.put("Pooja", 89);
		map2.put("Shivani", 77);
		map2.put("Ravi", 77);
		map2.put("Shivani", 87);
		map2.put("Anku", 97);
		map2.put(null, null);
		System.out.println(map2);


		
		
		

	}

}
