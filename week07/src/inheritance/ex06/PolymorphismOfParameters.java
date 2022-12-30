package inheritance.ex06;

public class PolymorphismOfParameters {

	// 매개변수의 다형성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 매개변수를 부모 타입으로 선언하는 효과
		/*
		 * 메소드 호출 시 매개값으로 부모 객체 및 모든 자식 객체를 제공할 수 있음
		 * 자식의 재정의된 메소드가 호출됨 >> 다형성
		 */
		/*
		class Driver {
			void drive(Vehicle vehicle) {
				vehicle.run()
			}
		}
		
		Driver.driver = new driver();
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus(); // vehicle의 자식 클래스
		driver.drive(bus); // 매개변수 전달 과정에서 자동 타입 변환 > Vehicle vehicle에 bus가 들어가니까..
		 */
		
		
	}

}
