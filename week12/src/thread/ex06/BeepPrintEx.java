package thread.ex06;

public class BeepPrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new BeepThread();
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Ring");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
