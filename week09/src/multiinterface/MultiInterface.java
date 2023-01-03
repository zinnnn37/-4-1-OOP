package multiinterface;

public class MultiInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 추상클래스 vs 인터페이스
		/*
		 * 추상 클래스는 일반 메소드를 가질 수 있음
		 * 다중상속 불가
		 * 객체생성 가능
		 * 
		 * 인터페이스는 메소드 전부가 추상메소드
		 * 필드도 상수필드밖에 선언 불가
		 * 다중 인터페이스 구현 클래스 생성 가능
		 * 객체생성 불가
		 * >> 추상 클래스보다 한 단계 더 추상화된 것이라 볼 수 있음
		 * 
		 * 추상클래스는 약간 불변의..? 속성? 같은 느낌이고
		 * 인터페이스는 변할 수 있는 속성?
		 */
		
		// 다중인터페이스 구현 클래스
		/*
		 * public class 구현클래스이름 implements 인터페이스1, 인터페이스2 {
		 * 		// 인터페이스 1에 선언된 추상 메소드 재정의
		 *		// 인터페이스 2에 선언된 추상 메소드 재정의
		 * }
		 * >> 구현클래스로 객체 생성하면 1, 2 둘 다 사용 가능
		 * >> 1로 구현클래스 객체 만들면 1의 메소드만 사용 가능
		 * >> 2로 구현클래스 객체 만들면 2의 메소드만 사용 가능
		 * >> 상속은 다중상속 불가 !!
		 */
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.setVolume(8);
		Searchable searchable = tv;
		searchable.search("https://www.naver.com/");
	}

}
