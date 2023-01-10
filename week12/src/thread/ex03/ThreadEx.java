package thread.ex03;

import java.awt.Toolkit;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// multi-thread ringing
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		thread.start(); // 스레드 실행
		for (int i = 0; i < 5; i++) { // 작업 스레드 동작 후 for문 같이 실행
			System.out.println("Ring");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}
