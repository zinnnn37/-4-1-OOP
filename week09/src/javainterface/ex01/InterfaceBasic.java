package javainterface.ex01;

public class InterfaceBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// interface
		/*
		 * 서로 다른 장치들이 연결되어 상호 데이터를 주고받는 규격
		 * 인터페이스는 객체화 불가
		 * 인터페이스를 규격으로 한 구현 클래스 생성하여 그 클래스로 객체화
		 * 
		 * 개발 코드는 인터페이스를 통해서 객체와 서로 통신한다
		 * 인터페이스의 메소드 호출 시 객체의 메소드 호출
		 * 개발 코드를 수정하지 않으면서 객체 교환이 간ㅇ함(실행 내용과 리턴값 다양화 가능) >> 템플릿 같은 건가 ?!
		 */
		
		// 인터페이스 선언
		/*
		 * 호출 방법만 기술함 !!
		 * 클래스와 유사, 그러나 객체 생성 불가 > 생성자 없음
		 * 클래스와 물리적 파일 형태는 같으나 소수 작성 내용이 다름
		 * [public] interface Name {
		 * 		// 상수
		 * 		[public static final] type NAME = value; // default public static final 
		 * 		// 추상 메소드
		 * 		[public abstract] returnType method ( [params] ); // 재정의 필요, 기본적으로 public abstract로 생략 가능
		 * }
		 */
		
		// 추상 메소드 선언
		/*
		 * 인터페이스를 통해 호출된 메소드는 최종적으로 객체에서 실행됨 > 인터페이스를 통해 호출해도 재정의된 메소드 호출
		 * 인터페이스의 메소드는 실행 블록 필요 없는 추상 메소드로 선언
		 */
		
		// 구현 클래스(implement class)
		/*
		 * 인터페이스에서 정의된 추상메소드를 재정의해서 실행내용을 가지고 있는 클래스
		 * 클래스 선언부에 implements 키워드 추가하고 인터페이스 이름 명시
		 * >> 이것만 되는 것이 아니라 extends로 상속도 가능함 ~~
		 * 
		 * public class ClassName implements InterfaceName {
		 *  	// 메소드 재정의 및 필드, 생성자, 메소드 추가
		 *  }
		 */
		
		// 인터페이스와 구현 클래스 사용 방법
		/*
		 * 인터페이스 변수 = 구현객체;
		 * 인터페이스 변수;
		 * 변수 = 구현 객체;
		 * >> 구현 객체만 바꿔주면 됨,,
		 * >> 추상 클래스와 다른 점은 ?
		 * 
		 * RemoteControl rc = new Television();
		 * rc.turnOn(); // TV turn on
		 * rc.turnOff(); // TV turn off
		 * 
		 * rc = nwAudio();
		 * rc.turnOn(); // Audio turn on\
		 * ...
		 */
		
		RemoteControl rc = new Television();
		rc.turnOn();
		rc = new Audio(); // 참조하는 객체 변경
		rc.turnOn();
	}

}
