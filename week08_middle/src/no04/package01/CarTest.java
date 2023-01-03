package no04.package01;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new NewCar("검정", 250, 5, "gas");
		vehicle.basic();
		
		System.out.println();
		
		NewCar car = (NewCar) vehicle;
		car.spec();
	}

}
