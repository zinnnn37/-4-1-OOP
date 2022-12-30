package abstractclass.ex01;

public abstract class Phone {

	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("Turning on ...");
	}
	
	public void turnOff() {
		System.out.println("Turning off ...");
	}
}
