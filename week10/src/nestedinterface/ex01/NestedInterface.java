package nestedinterface.ex01;

public class NestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 중첩 인터페이스
		/*
		 * 클래스의 멤버로 선언된 인터페이스
		 * 해당 클래스와 긴밀한 관계를 맺는 구현 클래스를 만들기 위함
		 
		class A {
			[static] interface I {
				void method();
			}
		}
		
		 * 인스턴스 멤버 인터페이스와 정적 멤버 인터페이스 모두 정의 가능
		 * 인스턴스 멤버 인터페이스는 바깥 클래스의 객체가 있어야 사용 가능 >> 외부 클래스의 객체부터 생성하기
		 * 정적 멤버 인터페이스는 바깥 클래스의 객체 없이 바깥 클래스만으로 바로 접근 가능
		 * >> UI 프로그래밍에서 이벤트를 처리할 목적으로 많이 사용됨
		 */
		
		// button event 처리
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener()); // 매개변수의 다형성 > listener 필드가 CallListener가 됨
		btn.touch();
		
		btn.setOnClickListener(new MessageListener()); // listener 필드가 MessageListener가 됨
		btn.touch();
		
		System.out.println();
		
		// window class
		
		Window w = new Window();
		
		w.b1.touch(); // 버튼 클릭
		w.b2.touch(); // 버튼 클릭
	}

}
