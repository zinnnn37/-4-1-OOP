package thread.practice03;

public class TimerRunnable implements Runnable {

	int sec = 0;

	public void run() {
		while (true) {
			System.out.println(sec++ + " sec");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
