package Lec19;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };

	}

	public static int Start_Index(int[] gas, int[] cost) {

		int net_Cost = 0;
		int curr_gas=0;
		int si=0;
		for (int i = 0; i < cost.length; i++) {
			net_Cost += (gas[i] - cost[i]);
			curr_gas += (gas[i] - cost[i]);
			if(curr_gas<0) {
				si=i+1;
				curr_gas=0;
			}
			

		}
		if (net_Cost < 0) {
			return -1;
		}
		return si;

	}

}
