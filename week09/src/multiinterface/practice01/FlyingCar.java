package multiinterface.practice01;

public class FlyingCar implements Drivable, Flyable {

	@Override
	public void drive() {
		System.out.println("I'm driving");
	}
	
	public void fly() {
		System.out.println("I'm flying");
	}
}
