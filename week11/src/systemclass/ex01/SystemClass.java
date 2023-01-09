package systemclass.ex01;

public class SystemClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System Class
		/*
		 * 모든 필드와 메소드는 정적 필드 및 정적 메소드로 구성됨
		 * 프로그램 종료, 키보드로부터 입력, 모니터로 출력, 현재시간 읽기 등이 가능
		 */
		
		// exit()
		/*
		 * JVM 강제 종료
		 * exit() 메소드가 지정하는 int 매개값을 종료 ㅅ아태값이라고 함
		 */
		
		// 현재 시간 읽기(currentTimeMillis(), nanoTime())
		/*
		 * 각기 밀리세컨드(1/1000초) 및 나노 세컨드(10/10^9) 단위의 long값 리턴
		 * 
		 * long time = System.currentTimeMillis();
		 * long time = System.nanoTime();
		 */
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("sum: " + sum);
		System.out.println((time2 - time1) + " nano secs took");
	}

}
