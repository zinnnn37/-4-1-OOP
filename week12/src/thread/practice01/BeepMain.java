package thread.practice01;

import java.awt.Toolkit;

public class BeepMain {
	
	public static void main(String[] args) {
		Thread timer = new TimerThread();
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
