package Lec53;

public class Client_Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Ram", 20);
		map.put("Ram", 90);
		map.put("Rohan", 30);
		map.put("Anuj", 60);
		map.put("Anuj", 70);
		map.put("Kartik", 80);
		map.put("Ak", 99);
		map.put("gk", 99);
		System.out.println(map);
	System.out.println(map.get("ram"));
	System.out.println(map.remove("ram"));
	System.out.println(map);
	System.out.println(map.ContainsKey("rohan"));
		

	}

}
