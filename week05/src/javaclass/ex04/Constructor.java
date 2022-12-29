package javaclass.ex04;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생서앚
		/*
		 * 클래스로부터 new 연산자로 객체를 생성할 때 호출되어 객체의 초기화를 담당
		 * 객체 초기화: 필드 초기화 혹은 메소드 호출하여 객체를 사용할 준비를 하는 것
		 * 
		 * 성공적으로 실행되었을 경우 힙 영역에 객체가 생성되고 객체 번지가 리턴되어 변수에 주소값이 저장됨
		 */
		
		// 기본생성자(default constructor)
		/*
		 * 클래스 내부에서 생성자 선언을 생략할 경우 바이트 코드에 자동으로 추가됨
		 * public Name() { } // 내용 비어있는 생성자가 자동으로 생성
		 */
		
		// 생성자 선언
		/*
		 * Name ( [매개변수 선언, ... ] ) {
		 * 		// 객체 초기화 코드
		 * }
		 * >> 생성자 생성(new Name())할 때 괄호 안에 매개변수를 같은 양 넣어줘야함
		 * 
		 * e.g. Car (String color, int cc) { }
		 * >> Car myCar = new Car("검정", 3000); // 이런 경우는 기본생성자 이용 시 error > 꼭 매개변수 두 개 받는 생성자 적어줘야함
		 */
		
		// 필드 초기화
		/*
		 * // 클래스 내부 필드
		 * String nation = "kor"; // 모두 한국인일테니
		 * String name;
		 * String ssn;
		 * 
		 * public Korean(String n, String s) {
		 * 		name = n;
		 *		ssn = s;
		 *		// 개개인이 다 다를테니까 생성자에서 초기화
		 * }
		 */
		
		Korean korean = new Korean("김민진", "001008-1234567");
		
		System.out.println("nation: " + korean.nation);
		System.out.println("name: " + korean.name);
		System.out.println("ssn: " + korean.ssn);
	}

}
