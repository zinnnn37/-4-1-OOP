package nestedinterface.ex01;

public class Button {

	OnClickListener listener; // 인스턴스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener; // 매개변수의 다형성 > 매개변수로 받은 객체에 따라 달라지기 때문
	}
	
	void touch() {
		listener.onClick(); // 구현 객체의 onClick() 메소드 호출
	}
	
	static interface OnClickListener {
		void onClick(); // 중첩 인터페이스
	}
}
