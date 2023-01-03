package javainterface.ex03;

public class InterfacePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자동 타입 변환
		/*
		 * 구현 객체와 자식 객체는 인터페이스 타입으로 자동 타입변환된다
		 * 인터페이스 변수 = 구현 객체;
		 * 
		 * 인터페이스 A
		 * 구현클래스 B, C
		 * 구현클래스의 자식클래스 D, E
		 * 
		 * B b = new B();
		 * C c = new C();
		 * D d = new D();
		 * E e = new E();
		 * 
		 * A a1 = b;
		 * A a2 = c;
		 * A a3 = d;
		 * A a4 = e;
		 * // 가능
		 */
		
		// 필드의 다형성
		/*
		 * 상속에서 타이어 클래스 >> 필드를 타이어 클래스의 객체로 만들어놓은 것
		 * 필드에 구현 객체를 바꿔주기만 하면 아무것도 수정 없이 다른 객체 사용 가능 >> 다형성
		 * leftTire = Hankuk(); 이다가
		 * leftTire = Kumho(); 하면
		 * 다른 코드 바뀐 것이 없이도 다른 클래스 객체 사용 가능
		 */
		
		// 매개변수의 다형성
		/*
		 * 매개변수로 인터페이스 타입을 받으면 대응되는 클래스를 인터페이스로 자동 형변환
		 * 
		 * public interface Vehicle {
		 * 		public void run();
		 * }
		 * 
		 * public class Driver {
		 * 		public void drive(Vehicle vehicle) {
		 * 			vehicle.run();
		 * 		}
		 * }
		 * 
		 * Driver = driver = new Driver();
		 * Bus bus = new Bus();
		 * driver.drive(bus);
		 * >> Driver.drive() 안에서 Vehicle vehicle = bus;로 자동형변환
		 */
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
