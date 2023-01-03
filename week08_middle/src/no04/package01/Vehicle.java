package no04.package01;

public abstract class Vehicle {

	String color;
	int maxSpeed;
	
	public Vehicle(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	abstract void basic();
}
