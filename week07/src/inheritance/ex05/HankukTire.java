package inheritance.ex05;

public class HankukTire extends Tire {

	public HankukTire(String location, int maxRotation) {
		super(location, maxRotation); // 부모 생성자 불러오기
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankukTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankukTire 펑크 ***");
			return false;
		}
	}
}
