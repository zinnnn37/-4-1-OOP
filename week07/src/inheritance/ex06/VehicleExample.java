package inheritance.ex06;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		// 매개변수를 전달하는 과정에서 자동형변환(Bus -> Vehicle && Taxi -> Behicle)
	}

}
