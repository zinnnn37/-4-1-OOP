package thread.ex10;

public class ThreadSync {
	
	public static void main(String[] args) {
		// 동기화 메소드
		/*
		 * 스레드가 사용중인 객체를 다른 스레드가 변경할 수 없게 스레드 작업이 끝날 때까지 객체에 잠금을 거는 갓
		 * public synchronized void method() { // synchronized 키워드
		 * 		// 임계 영역
		 * }
		 * // 인스턴스 메소드, 정적 메소드 모두 적용 가능
		 * 
		 * 임계 영역: 단 하나의 스레드만 실행할 수 있는 코드 영역
		 * 동기화 메소드: 스레드가 객체 내부의 동기화 메소드를 실행하면 즉시 객체에 잠금이 걸림
		 * 
		 * 동기화 메소드 전체 내용이 임계 영역이므로 스레드가 동기화 메소드를 실행하는 즉시 객체에 잠금이 일어나고
		 * 스레드가 동기화 메소드를 실행 종료하면 잠금 풀림
		 * 
		 * 만약 동기화 메소드가 여러 개 있을 경우, 스레드가 이들 중 하나를 실행할 때
		 * 다른 스레드는 해당 스레드는 물론이고 다른 동기화 메소드도 실행 불가
		 * 하지만 이 때 다른 스레드에서 일반 메소드는 실행 가능함
		 */

		Calc calc = new Calc();

		User1 u1 = new User1();
		u1.setCalc(calc);
		u1.start(); // 100
		// setMemory 사용 시 메소드 잠금, 출력까지 끝나야 메소드 잠금 풀림

		User2 u2 = new User2();
		u2.setCalc(calc);
		u2.start(); // 50
		// user1 동작 끝난 후 메소드 실행 가능
		// 따라서 무조건 user1이 먼저 실행되고 종료됨
	}
}
