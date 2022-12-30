package gettersetter.ex01;

public class GetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Getter, Setter 메소드
		/*
		 * 외부에서 객체에 마음대로 접근하는 경우 객체의 무결성이 깨질 수 있음
		 * 이를 막기 위해 Getter, Setter 사용
		 */
		
		// Setter 메소드
		/*
		 * 외부의 값을 받아 필드의 값을 변경하는 것이 목적
		 * 매개값 검증을 통해 유효한 값만 필드로 저장할 수 있음
		 * 
		 * returnType setName( params ) { codes; }
		 */

		// Getter
		/*
		 * 외부로 필드값을 전달하는 것이 목적
		 * 필드값을 가공해서 외부로 전달할 수도 있음
		 */
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("speed(-50): " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("speed(60): " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("speed(stop): " + myCar.getSpeed());
	}

}
