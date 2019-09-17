package oop;

public class Duck {
	private boolean canfly = false;

	public Duck(boolean input_canfly) {
		canfly = input_canfly;
	}

	public void quack() {
		System.out.println("Quack!!");
	}

	public boolean getCanfly() {
		return canfly;
	}

	public void quack(String sound) {
		System.out.println(sound);
	}

}
