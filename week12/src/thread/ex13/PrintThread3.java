package thread.ex13;

public class PrintThread3 extends Thread {
	
	public void run() {
		while (true) {
			System.out.println("Running...");
			if (Thread.interrupted()) {
				break;
			}
		}

		System.out.println("Cleaning...");
		System.out.println("Stoped");
	}
}
