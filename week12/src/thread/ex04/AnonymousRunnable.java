package thread.ex04;

import java.awt.Toolkit;

public class AnonymousRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 익명 구현 객체 이용
		Thread thread = new Thread( new Runnable() { // 재사용하지 않는 경우 유용, Thread의 매개변수로 익명구현객체 전달
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		});
		
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Ring");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
