package oop;

public class Farm {
	public static void main(String[] args) {
		Duck duck = new Duck(true);
		boolean canTheDuckFly = duck.getCanfly();
		if (canTheDuckFly == true) {
			System.out.println("The duck can fly");
		}
		duck.quack();
		duck.quack("Ga Ga Ga");

	}
}