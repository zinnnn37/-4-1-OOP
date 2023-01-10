package thread.ex13;

public class InterruptMethod {
	// interrupt
	/*
	 * 스레드가 일시 정지 상태에 있을 때 InterruptedException을 발생시키는 역할
	 * 이를 이용해 run()을 정상종료할 수 있음
	 */

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();

		try { Thread.sleep(1000); } catch (InterruptedException e) {}

		thread.interrupt(); // 이 코드 때문에 PrintThread2에서 sleep(1)일 때 에러 발생하는 것

		/*
		 * 스레드가 실행 대기 혹은 실행 상태에 있을 때 interrupt()가 발생하게 되면 바로 예외가 발생하는 것이 아니라
		 * 스레드가 미래에 일시정지 상태가 되면 예외가 발생하는 것
		 * 스레드가 일시정지가 되지 않으면 interrupt() 호출은 아무 의미 없음
		 * >> 짧은 시간이라도 일시정지 하기 위해 sleep(1)을 호출하는 것
		 * 
		 * 일시정지를 하지 않고도 interrupt()의 호출 여부를 알 수 있는 방법
		 * : interrupted() 정적 메소드와 isInterrupted() 인스턴스 메소드는 interrupt()메소드 호출 된 경우 true 반환
		 */

		Thread thread3 = new PrintThread3();
		thread3.start();

		try { Thread.sleep(1000); } catch (InterruptedException e) {}

		thread3.interrupt(); // 호출 시 interrupted() == true
	}

}
