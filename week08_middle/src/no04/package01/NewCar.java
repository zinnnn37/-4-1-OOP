package no04.package01;

public class NewCar extends Vehicle {
	
	int passenger;
	String fuel;
	
	public NewCar(String color, int maxSpeed, int passenger, String fuel) {
		super(color, maxSpeed);
		this.passenger = passenger;
		this.fuel = fuel;
	}
	
	@Override
	void basic() {
		System.out.println("자동차 색상 : " + this.color);
		System.out.println("자동차 최대 속도 : " + this.maxSpeed + "km");
	}
	
	void spec() {
		System.out.println("자동차 탑승인원 : " + passenger + "명");
		System.out.println("자동차 연료 : " + fuel);
	}
}
