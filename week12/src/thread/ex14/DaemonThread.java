package thread.ex14;

public class DaemonThread {
	
	public static void main(String[] args) {
		
		// Daemon Thread
		/*
		 * 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
		 * > 주 스레드가 종료되면 데몬 스레드는 강제적으로 종료
		 * 
		 * 데몬 스레드의 적용 예는 워드 프로세서의 자동 저장, 미디어 플레이어의 동영상 및 음악 재생, 쓰레기 수집기 등
		 * > 이 기능들은 주 스레드(워드 프로세서, 미디어 플레이어, JVM)가 종료되면 같이 종료됨
		 * 
		 * 스레드를 데몬으로 만들기 위해서는 주 스레드가 데몬이 될 스레드의 setDaemon(true)를 호출해주면 됨
		 * public static void main(String[] args) {
		 * 		AutoSaveThread thread = new AutoSaveThread();
		 * 		thread.setDaemon(true); // start() 앞에 있어야 함! 순서 바뀌면 예외(IllegalThreadStateException)
		 * 		thread.start();
		 * }
		 */

		AutoSaveThread autoSave = new AutoSaveThread();
		autoSave.setDaemon(true);
		autoSave.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}

		System.out.println("Main Thread terminated");
	}
}
