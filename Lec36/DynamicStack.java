package Lec36;

import Lec34.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (this.isfull()) {

			int[] temp = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				temp[i] = this.data[i];
			}
			this.data = temp;
		}
		
		super.push(item);

	}

}
