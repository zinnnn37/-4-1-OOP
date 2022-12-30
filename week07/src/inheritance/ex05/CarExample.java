package inheritance.ex05;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		for (int i = 0; i <= 5 ; i++) {
			int problemLocation = car.run(); // 오버라이드 된 roll() 메소드
			switch (problemLocation) {
				case 1:
					System.out.println("FrontLeft Tire switched to HankookTire");
					car.frontLeftTire = new HankukTire("FrontLeft", 15);
					break;
				case 2:
					System.out.println("FrontRight Tire switched to KumhoTire");
					car.frontRightTire = new KumhoTire("FrontRight", 13);
					break;
				case 3:
					System.out.println("BackLeft Tire switched to HankukTire");
					car.backLeftTire = new HankukTire("BackLeft", 14);
					break;
				case 4:
					System.out.println("BackRight Tire switched to KumhoTire");
					car.backRightTire = new KumhoTire("BackRight", 17);
					break;
			}
			System.out.println("==============================================================");
		}
	}
	// 
}
