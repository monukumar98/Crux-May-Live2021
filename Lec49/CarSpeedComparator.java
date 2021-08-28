package Lec49;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {
		// TODO Auto-generated method stub
		return o1.speed-o2.speed;
	}

}
