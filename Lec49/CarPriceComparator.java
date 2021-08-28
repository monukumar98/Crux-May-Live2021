package Lec49;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o2.price-o1.price;
	}

	
}
