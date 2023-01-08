package nestedclass.ex01;

public class NestedClassInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 중첩 클래스(nested class)
		/*
		 * 클래스 안 클래스
		 * >> 두 클래스 멤버를 쉽게 접근하게 하고 외부와의 불필요한 관계 클래스 감춤
		 * 코드 복잡성 줄임
		 */
		
		// 중첩 인터페이스(nested interface)
		/*
		 * 클래스 안 인터페이스
		 * 마찬가지
		 * 해당 클래스와 긴밀한 관계를 갖는 구현 클래스를 만들기 위함
		 */
		
		// 중첩 클래스 종류
		/*
		 * 1. 멤버 클래스: 클래스의 멤버로 선언되는 중첩 클래스 >> 필드로 사용되는
		 * 				- 인스턴스 멤버 클래스 > 바깥의 객체를 생성하야만 사용할 수 있는 클래스(static 키워드 없이 생성된 클래스)
		 * 									인스턴스 필드와 메소드만 선언 가능하고 정적 필드와 메소드는 선언 불가
		 * 				- 정적 멤버 클래스 > 바깥의 클래스로 바로 접근 가능(객체 생성 없이..) class A { static class B { ... } }
		 * 								 static으로 선언된 클래스, 모든 종류의 필드와 메소드 선언 가능
		 * 2. 로컬 클래스: 메소드 내부에서 선언되는 중첩 클래스
		 * 				메소드 종료 시 사라짐
		 * 				접근제한자 및 static 사용 불가 (내부에서 정적 메소드, 필드도 사용 불가)
		 * 				메소드가 실행될 때 메소드 내에서 객체를 생성하고 사용해야함!
		 * 				* 주로 아래와 같이 비동기처리를 위해 스레드 객체를 만들 때 사용
		 * 
		 * void method() {
		 * 		class DownloadThread extends Tread{ codes; }
		 * 		DownloadThread thread = new DownloadThread();
		 * 		thread.start();
		 * }
		 */
		
		// 인스턴스 멤버 클래스: 외부에서 내부 클래스 객체를 생성하려면 외부 클래스 객체를 생성 후 내부 객체 생성 필요
		/*
		 * A a = new A();
		 * A.B b = a.new B();
		 * b.field1 = 3;
		 * b.method1();
		 */
		
		// 정적 멤버 클래스: 외부 클래스 외부에서 정적 멤버 클래스의 객체를 생성할 경우 외부 클래스 생성이 필요치 않음
		/*
		 * A.C c = new A.C();
		 * c.field1 = 3;	// 인스턴스 필드 > 객체화 필요
		 * c.method1();		// 인스턴스 메소드 > 객체화 필요
		 * A.C.field		// 정적 필드 > 객체화 필요 없음
		 * A.C.method2();	// 정적 메소드 > 객체화 필요 없음
		 */
		
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C(); // 왜 두개 다르지 인스턴스 vs 정적?
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		// 65~67 주석처리 해도 A.C.field2, A.C.method2()에 접근 가능(static)
		
		a.method();
	}

}
