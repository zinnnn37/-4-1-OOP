package thread.ex05;

public class LowerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread 하위 클래스로부터 생성
		/*
		 * Thread의 하위 클래스로 작업 스레드를 정의하면서 작업 내용을 포함
		 */
		
		// 작업 스레드 클래스 정의
		/*
		 * Thread 클래스를 상속한 후 run() 메소드를 재정의해서 스레드가 실행할 코드를 작성
		 */
		
		Thread thread1 = new WorkerThread(); // 자동형변환
		
		Thread thread2 = new Thread() { // 익명 자식 객체
			public void run() {
				// code
			}
		};
		
		// 이후 start()로 호출
		
		// thread.ex06에 beep로 예시
	}

}
