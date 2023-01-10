package thread.ex08;

public class RunningThread {
	public static void main(String[] args) {
		// 스레드 이이름름
		/*
		 * 디버깅 시 스레드가 어떤 작업을 하는지 조사할 목적으로 가끔 사용
		 * 메인 스레드는 main 이름을 가지며 우리가 직접 생성한 스레드는 자동적으로 Thread-n으로 설정됨
		 * 다른 이름을 설정하려면 Thread 클래스의 setName() 인스턴스 메소드로 이름 변경 가능
		 * thread.setName("name");
		 * 
		 * getName() 인스턴스 메소드로 스레드의 이름을 알 수 있음
		 * currenThread() 메소드로 현제 스레드의 참조를 얻을 수 있음
		 * Thread thread = Thread.currentThread(); // static
		 */

		 Thread mainTread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기
		 System.out.println("starting thread: " + mainTread.getName());

		 ThreadA threadA = new ThreadA();
		 System.out.println("Thread name: " + threadA.getName()); // ThreadA (Thread-0을 ThreadA로 변경)
		 threadA.start();

		 ThreadB threadB = new ThreadB();
		 System.out.println("Thread name: " + threadB.getName()); // Thread-1
		 threadB.start();
	}
}
