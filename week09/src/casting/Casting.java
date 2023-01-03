package casting;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 강제 타입 변환
		/*
		 * 구현 객체가 인터페이스 타입으로 자동 변환하면 인터페이스에 선언된 메소드만 사용 가능
		 * 만약 구현객체에서 따로 선언한 메소드를 사용하고싶다면 ? > 강제 타입 변환
		 * 
		 * 구현클래스 변수 = (구현클래스) 인터페이스변수;
		 * 
		 * Vehicle vehicle = new Bus();
		 * 
		 * vehicle.run();
		 * //vehicle.checkFare(); // Bus에 있는 메소드 > 실행 불가
		 * 
		 * Bus bus = (Bus) vehicle; // casting
		 * 
		 * bus.run();
		 * bus.checkFare(); // 가능
		 */
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); // X
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
		System.out.println();
		
		// 객체 타입 확인 instanceof
		/*
		 * 구현 객체가 변환되어 있는지 알 수 없는 상태에서 강제 타입 변환할 경우 error 발생
		 * instanceof 연산자로 확인 후 안전하게 강제 타입 변환
		 */
		
		Driver driver = new Driver();
		
		bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // casting 후 checkFare()부터 실행
		driver.drive(taxi); // run()만 실행
	}

}
