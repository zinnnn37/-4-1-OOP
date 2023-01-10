package thread.practice04;

import java.awt.Toolkit;

public class AnonymousRunnable {
	
	public static void main(String[] args) {
		
		Thread timer = new Thread( new Runnable() {
			int i = 0;
			@Override
			public void run() {
				while (true) {
					System.out.println(i++ + " sec");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		});

		timer.start();

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		while (true) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
