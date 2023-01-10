package thread.ex12;

public class SleepMethod {
	// sleep
	/*
	 * 스레드 일시정지
	 * static 메소드로 객체 생성 없이 Thread.sleep(ms);로 접근 가능
	 * 일시정지 상태에서 주어진 시간이 되기 전에 interrupt()메소드가 호출되면 InterruptedException이 발생하기 때문에 예외처리가 필요함
	 */

	// 스레드의 안전한 종료
	/*
	 * 실행 중인 스레드를 즉시 종료해야 하는 경우
	 * 스레드는 run()이 끝나면 자동적으로 종료 > 정상 종료되도록 유도하는 것이 중요
	 * 
	 * stop 플래그 이용하는 방법
	 */

	public static void main(String[] args) {
		PrintThread1 pt1 = new PrintThread1();
		pt1.start();

		try { Thread.sleep(1000); } catch (InterruptedException e) {} // 1초동안 run()

		pt1.setStop(true); // 1초 후 stop = true로 설정하여 스레드 종료
	}
}
