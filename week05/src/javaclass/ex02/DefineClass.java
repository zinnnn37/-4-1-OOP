package javaclass.ex02;

public class DefineClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		/*
		 * ClassName val;
		 * val = new ClassName(); // 생성자(constructor), 힙 영역에 객체 생성
		 * 
		 * or
		 * 
		 * ClassName val = new ClassName();
		 */
		
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		// main문이 포함된 클래스
		/*
		 * 실행 클래스
		 * 하나만 있어야 함!
		 */
		
		// 나머지
		/*
		 * 라이브러리(API: Application Program Interface) 클래스
		 */
		
		//class member
		/*
		 * 필드(field): 객체의 데이터가 저장되는 곳(일반 변수와 동일한 형태)
		 * >> 메소드 안에서 선언된 것 == 변수
		 * >> 클래스 안에서 선언된 것 == 필드
		 * 
		 * 생성자(constructor): 객체 생성 시 초기화 역할 담당
		 * >> 메소드를 생성하고 실행하는 역할도 함
		 * 
		 * 메소드(method): 객체의 동작에 해당하는 실행 블록
		 * >> 함수~
		 */
	}

}
