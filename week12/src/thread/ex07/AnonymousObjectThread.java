package thread.ex07;

import java.awt.Toolkit;

public class AnonymousObjectThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread 익명 자식 객체를 이용해 작업 스레드를 만들 수 있음
		Thread thread = new Thread() { // 익명 자식 객체
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		};
		
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Ring");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
