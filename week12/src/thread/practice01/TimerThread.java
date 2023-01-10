package thread.practice01;

public class TimerThread extends Thread {

	int i = 0;
	
	public void run() {
		try {
			while (true) {
				System.out.println(i++ + "sec");
				Thread.sleep(1000); 
			}
		} catch (InterruptedException e) {
			return;
		}
	}
}
