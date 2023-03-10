package thread.ex11;

public class ThreadCtrl {
	public static void main(String[] args) {
		// 스레드 상태 제어
		/*
		 * 객체 생성하고 start() 호출 시 바로 실행되는 것이 아니라 실행 대기 상태가 됨
		 * 실행 상태 스레드는 run()메소드를 모두 실행하기 전 다시 실행 대기 상태로 돌아갈 수 있음
		 * // 실행대기 -> 실행-> 일시정지 -> 실행대기 -> 실행의 반복
		 * 실행 대기 상태에 있는 다른 스레드가 선택되어 실행 상태가 되기도 함
		 * 실행 상태에서 run() 메소드의 내용이 모두 실행되면 스레드 실행이 멈추고 종료 상태가 됨
		 * 
		 * 실행 상태(running)
		 * : 실행 대기 상태의 스레드 중에서 운영체제가 하나를 선택하여 CPU가 run()메소드를 실행하도록 함
		 * : 실행 상태의 스레드는 run()메소드를 모두 실행하기 전에 다시 실행 대기 상태로 돌아갈 수 있음
		 *   그리고 실행 대기 상태에 있는 다른 스레드가 선택되어 실행 상태가 됨
		 * 
		 * 종료 상태(terminated)
		 * : 실행 상태에서 run() 메소드가 종료되면 더 이상 실행할 코드가 없기 때문에 스레드 실행이 정지돔
		 * 스레드는 실행 대기 상태와 실행 상태로 번갈아 변하면서, 경우에 따라서 실행 상태에서 일시 정지 상태로 가기도 함
		 * : 일시 정지 상태는 스레드가 실행할 수 없는 상태(일시 정지 상태 -> 실행 대기 상태)
		 */

		 // 스레드 상태 제어
		 /*
		  * 실행 중인 스레드의 상태 변경
		  * 스레드 상태 변화에 필요한 메소드르 정확히 파악해야 함
		  * interrupt(): 일시 정지 상태의 스레드에서 InterruptedException을 발생시켜, 예외 처리 코드(catch)에서 실행 대기 상태로 가거나 종료 상태로 갈 수 있도록 함
		  * sleep(long millis): 주어진 시간동안 스레드를 일시 정지 상태로 만듦. 주어진 시간이 지나면 자동적으로 실행대기상태가 됨
		  * stop(): 스레드를 즉시 종료. 불안전한 종료를 유발하므로 사용 권장하지 않음*********
		  */
	}
}
