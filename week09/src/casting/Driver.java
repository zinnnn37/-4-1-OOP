package casting;

public class Driver {

	public void drive(Vehicle vehicle) { 
		if (vehicle instanceof Bus) { // Bus 객체일 경우 강제타입변환 후 요금 확인
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
