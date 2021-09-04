package Lec52;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
		
		s.add("Rahul");
		s.add("Kaju");
		s.add("Ravi");
		s.add("Pooja");
		s.add("Ritesh");
		s.add("Ritesh");
		s.add(null);
		System.out.println(s);
		System.out.println(s.contains("pooja"));
		
		
		TreeSet<String> s1 = new TreeSet<>();
		s1.add("Rahul");//log(N)
		s1.add("Kaju");
		s1.add("Ravi");
		s1.add("Pooja");
		s1.add("Ritesh");
		s1.add("Ritesh");
		//s1.add(null);Allowed nhi hai 
		System.out.println(s1);
		LinkedHashSet<String> s2 = new LinkedHashSet<>();
		s2.add("Rahul");
		s2.add("Kaju");
		s2.add("Ravi");
		s2.add("Pooja");
		s2.add("Ritesh");
		s2.add("Ritesh");
		s2.add(null);
		System.out.println(s2);
	
		
		
		

	}

}
