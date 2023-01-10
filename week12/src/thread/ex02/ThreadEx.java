package thread.ex02;

import java.awt.Toolkit;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 작없 스레드 생성과 실행
				/*
				 * 멀티 스레드로 실행하는 어플리케이션을 개발하려면 몇 개의 작업을 병렬로 실행할 지 우선 결정
				 * 그 뒤 작업별로 스레드 생성
				 * 작업 스레드 역새 객체로 생성되므로 클래스 필요
				 * 1. java.lang.Thread 클래스를 직접 객체화하여 사용 가능
				 * 2. Thread 클래스를 상속하여 하위 클래스를 만들어 사용하는 것도 가능
				 * 
				 * >> 메인작업(메인 스레드)
				 * >> 작업1 (작업 스레드1)
				 * >> 작업2 (작업 스레드2)
				 */
				
				// java.lang.Thread 클래스로 직접 생성
				/*
				 * Thread thread = new Thread(Runnable target);
				 * Runnable을 매개값으로 갖는 생성자 호출
				 * Runnable: 작업 스레드가 실행할 수 있는 코드를 가지고 있는 객체라고 해서 이름 붙여짐
				 * >> 인터페이스 타입이기 때문에 구현 객체를 만들어 대입해야함
				 * 
				 * class Task implements Runnable {
				 * 		public void run() {
				 * 			// thread가 실행할 코드
				 * 		}
				 * }
				 * 
				 * 작업 내용을 가지고 있는 객체이지 실제 스레드는 아님
				 
				 * 즉, Runnable 구현 객체를 생성한 후 이를 매개값으로 Thread 생성자를 호출하면 작업 스레드가 생성됨
				 
				Runnable task = new Task();
				Thread thread = new Thread(task);
				
				>> Runnable 익명객체로도 매개변수를 넘길 수 있음 !
				
				Thread thread = new Thread( new Runnable() {
						public void run() {
							// 스레드가 실행할 코드
						}
					}
				)
				
				*/
				
				// 실행
				/*
				 * 스레드는 생성 즉시 실행되는 것이 아니라 start() 메소드를 호출해야 함
				 * thread.start();
				 * 
				 * 호출되면 작없 스레드는 매개값으로 받은 Runnable의 run() 메소드를 실행하면서 자신의 작업을 처리함
				 * >> 메인과 start로 실행한 코드가 동시 실행되는 것
				 */
				
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500); // 0.5초간 정지
			} catch (Exception e) {}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Ring");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
		// thread.ex03에서 멀티스레드로 구현
	}

}
