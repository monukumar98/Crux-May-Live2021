package Lec49;

public interface StackI {
	int val = 90;

	public void push();

	public int pop();

	default void fun() {
		System.out.println("fun");
	}

}
