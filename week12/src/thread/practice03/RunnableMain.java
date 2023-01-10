package thread.practice03;

import java.awt.Toolkit;

public class RunnableMain {

	public static void main(String[] args) {

		TimerRunnable tr = new TimerRunnable();
		Thread timer = new Thread(tr);

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
