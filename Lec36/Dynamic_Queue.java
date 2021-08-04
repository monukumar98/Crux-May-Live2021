package Lec36;

import Lec35.Queue;

public class Dynamic_Queue extends Queue {
	@Override
	public void Enqueue(int item) throws Exception {
		if (this.isfull()) {
			int[] temp = new int[2 * this.data.length];
			for (int i = 0; i < this.size; i++) {

				int idx = (this.front + i) % this.data.length;
				temp[i] = this.data[idx];

			}
			this.data=temp;
			this.front=0;

		}
		super.Enqueue(item);
		

	}

}
