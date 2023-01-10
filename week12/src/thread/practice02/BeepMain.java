package thread.practice02;

import java.awt.Toolkit;

public class BeepMain {
	
	public static void main(String[] args) {
		Thread timer = new Thread() {
			int i = 0;

			public void run() {
				while (true) {
					System.out.println(i++ + " sec");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						break;
					}
				}
			}
		};

		timer.start();

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		while (true) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
