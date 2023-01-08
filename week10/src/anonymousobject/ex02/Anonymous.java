package anonymousobject.ex02;

public class Anonymous {

	RemoteControl field = new RemoteControl() { // 필드 선언 & 초기값 대입
		@Override
		public void turnOn() {
			System.out.println("Turn on TV");
		}
		@Override
		public void turnOff() {
			System.out.println("Turn off TV");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Turn on Audio");
			}
			@Override
			public void turnOff() {
				System.out.println("Turn off Audio");
			}
		};	// 로컬 변수 선언
		
		localVar.turnOn(); // 로컬 변수 사용
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) { // 메소드 매개변수로 받음
		rc.turnOn();
		rc.turnOff();
	}
}
