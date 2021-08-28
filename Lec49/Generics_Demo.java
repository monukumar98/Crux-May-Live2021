package Lec49;

import java.util.ArrayList;
import java.util.Arrays;


public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		//System.out.println(list);
		Integer [] arr = {12,3,4,5,6,7};
		String [] arr1 = {"A","Pooja","Rohit","Shivani","Rahul"};
//		Display(arr);
//		Display(arr1);
		Cars [] car = new Cars[5]; 
	
		car[0] = new Cars(1000, 20, "Black");
		car[1] = new Cars(200, 10, "White");
		car[2] = new Cars(345, 3, "Yellow");
		car[3] = new Cars(8907, 6, "Red");
		car[4] = new Cars(34, 89, "Grey");
		Display(car);
		//Arrays.sort(car);
		System.out.println(">>>>>>>>>>>");
		Bubble_Sort(car ,new CarPriceComparator());
		
		Display(car);

	}
	public static <T>void Display(T [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+", ");
			
		}
		
		
	}
//	public static <T extends Comparable<T>>void Bubble_Sort(T [] arr) {
//
//		for (int pass = 1; pass <= arr.length - 1; pass++) {
//
//			for (int i = 0; i < arr.length - pass; i++) {
//				if(arr[i].compareTo(arr[i+1])>0) {
//					T t = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = t;
//
//				}
//			}
//
//		}
//	}
	
	public static void Bubble_Sort(Cars [] arr, CarPriceComparator camp) {

		for (int pass = 1; pass <= arr.length - 1; pass++) {

			for (int i = 0; i < arr.length - pass; i++) {
				if(camp.compare(arr[i], arr[i+1])>0) {
					Cars t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;

				}
			}

		}
	}
	
	
	}

	

