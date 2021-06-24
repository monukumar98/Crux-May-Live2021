package Lec14;
import java.util.*;
public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a=100;
		Integer i =100;
		System.out.println(a);
		System.out.println(i);
		a= i;// Integer se int  Unboxing 
		byte a1=(byte)a;
		int arr [] = null;
		System.out.println(arr);
		i=a;// int se Integer autoboxing 
		ArrayList<Integer> list= new ArrayList<>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		// Index --- > 0 to list.size();
		list.add(2,90);
		System.out.println(list);
		System.out.println(list.size());
		 // get  index 0 to list.size()-1 
		System.out.println(list.get(2));
		
		// Set  Index  0 to list.size()-1;
		list.set(1,17);
		System.out.println(list);
		
		//  Remove  0 to list.size()-1
		//System.out.println(list.remove(1));
		System.out.println(list);
		for (int ii = 0; ii < list.size(); ii++) {
			System.out.print(list.get(ii)+" ");
			
		}
		System.out.println();
		for(Integer val :list)
			System.out.print(val+" ");
		
		
		
		

	}

}
