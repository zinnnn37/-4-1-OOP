package thread.ex09;

public class ThreadSync {
	public static void main(String[] args) {
		// 동기화 메소드
		/*
		 * 스레드 : 프로세스가 메모리 공유
		 * 두 개 이상의 스레드가 메모리 공유
		 * 
		 * user1, user2 스레드
		 * user1에서 memory = 100;으로 정의하고 2초 정지하는 동시에 user2에서 memory = 50;으로 정의하고 2초 정지
		 * 2초 지난 후 user1에서 memory를 출력하면 50, user2에서도 마찬가지
		 * >> 이처럼 멀티스레드 프로그램에서 스레드들이 객체를 공유하여 작업하는 경우 의도했던 것과 다른 결과가 나올 수 있다
		 * >> 이를 해결하는 것이 동기화 메소드
		 */

		 Calc calc = new Calc();

		 User1 u1 = new User1();
		 u1.setCalc(calc);
		 u1.start(); // 50

		 User2 u2 = new User2();
		 u2.setCalc(calc);
		 u2.start(); // 50

		// 공유객체라 user1의 변수가 오염됨
		// 그리고 User1이 먼저 끝날 것이란 보장 없음
		// 해결방법: 동기화 스레드 ex10
	}
}
