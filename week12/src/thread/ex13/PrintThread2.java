package thread.ex13;

public class PrintThread2 extends Thread {
	
	public void run() {
		try {
			while (true) {
				System.out.println("Running...");
				Thread.sleep(1); // InterruptedException 발생
			}
		} catch (InterruptedException e) {}

		System.out.println("Cleaning...");
		System.out.println("Stop process.");
	}
}
