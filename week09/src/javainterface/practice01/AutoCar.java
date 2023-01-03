package javainterface.practice01;

public class AutoCar implements OperateCar {

	private int speed;
	private int degree;
	@Override
	public void start() {
		System.out.println("Start to run...");
	}
	
	public void stop() {
		System.out.println("Stop to run...");
	}
	
	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
		else
			this.speed = 0;
		System.out.println("Current speed: " + this.speed + "km/s");
	}
	
	public void turn(int degree) {
		this.degree += degree;
		if (degree >= 360)
			this.degree -= 360;
		else if (degree < 0)
			this.degree += 360;
		System.out.println("Current degree: " + this.degree + "°");
	}
}
