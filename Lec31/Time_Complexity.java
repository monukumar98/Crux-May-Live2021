package Lec31;

public class Time_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(7 * 8);// o(1)
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");
//		System.out.println("hello");

		int n = 1000;
		for (int i = 0; i < n; i++) {
			System.out.println(n);
			// O(N)
		}
		for (int i = 0; i < n; i++) {
			System.out.println(n);
			// O(N)
		}
		// Linear Search --> O(n)
		// Binary Search -- >(Olog(N)
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// Log(N)
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(longN)
			n /= 2;
		}

		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		
		while (i <= n) {
			System.out.println("Hey");
             //    log(n) base 6   
			i *= 2;
			i *= 3;
		}
		
		while (n > 0) {
			System.out.println("Hey");
			// log(n) base 6  
			n /= 2;
			n /= 3;
		}
		
		while (i <= n) {
			System.out.println("Hey");
            //O(N/k)
			i += k;
		}
		
		
		while (i <= n) {
			System.out.println("Hey");
            // O(lonN) base k
			i *= k;
		}
		
		while (n > 0) {
			System.out.println("Hey");
           // o(n)
			n = n - 1;
		}
		while (n > 0) {
			System.out.println("Hey");
			 // o(n)
			n = n - 2;
			n = n - 3;
		}
		while (n > 0) {
			// o(n/k)
			n = n - k;
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
				//O(N^2)
			}
		}

		
		for (i = 1; i * i <= n; i++) {
			//O(sqrt(N)
			System.out.println("hey");
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 1000; k++) {
                   //O(1000*N^2)
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					//O(N^4)
				}
			}
		}
	}

}
