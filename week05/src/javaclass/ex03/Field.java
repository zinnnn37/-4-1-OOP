package javaclass.ex03;

public class Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 필드
		/*
		 * 객체의 고유한 데이터
		 * 객체가 가져야 할 부품
		 * 객체의 현재 상태 데이터 등을 저장함
		 */
		
		// e.g. 자동차 객체
		/*
		 * [고유 데이터]
		 * - 제작 회사	String company;
		 * - 모델		String model;
		 * - 색			String color;
		 * - 최고 속도	int maxSpeed;
		 * 
		 * [상태 데이터]
		 * - 현재 속도	int speed;
		 * - 엔진 회전 수	int rpm;
		 * 
		 * [부품]
		 * - 차체		Body body; // 인터페이스나 클래스 등을 통해 필드로 사용
		 * - 엔진		Engine engine;
		 * - 타이어		Tire tire;
		 */
		
		// 특징
		/*
		 * 클래스의 중괄호 내에서라면 어디에서든지 선언 가능
		 * 생성자와 메소드 중괄호 블록 내부에서는 선언 불가
		 * 변수와 선언 형태가 유사하나 변수가 아님!!!!!! *******************◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈
		 * Type filed [ = initialization ]
		 * 초기화하지 않은 경우 기본 초기값이 설정됨(0, false, null) > char는 '\0' 이라서 출력하면 보이지는 않음
		 */
		
		// 필드 사용
		/*
		 * 필드 값을 읽고 변경하는 작업
		 * 
		 * 1. 클래스 내부 생성자 및 메소드에서 사용: 필드 이름으로 읽고 변경
		 * Car() { // 생성자
		 * 		speed = 0; // 값 변경
		 * }
		 * void method(...) { // 메소드
		 * 		speed = 10;
		 * }
		 * 
		 * 2. 클래스 외부에서 사용: 클래스로부터 객체를 생성한 뒤 필드 사용
		 * void method() {
		 * 		Car myCar = new Car();
		 * 		myCar.speed = 60;
		 * } 
		 */
	}

}
