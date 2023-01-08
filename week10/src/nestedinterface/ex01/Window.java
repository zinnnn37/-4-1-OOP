package nestedinterface.ex01;

public class Window {

	Button b1 = new Button();
	Button b2 = new Button();
	
	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		// Button 내부의 중첩 인터페이스 OnClickListener를 상속받는 익명 객체 생성
		@Override
		public void onClick() {
			System.out.println("Calling");
		}
	};
	
	Window() { // 생성자
		b1.setOnClickListener(listener); // 매개값으로 필드 대입(위에서 생성한 필드 객체) // b1의 OnClickListener(Button 클래스의 필드) = Calling
		b2.setOnClickListener(
			new Button.OnClickListener() { // 매개값으로 익명 객체 대입 // b2의 OnClickListener = Texting
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Texting");
			}
		});
	}
}
