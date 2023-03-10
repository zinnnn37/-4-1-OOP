package instance.ex01;

public class Calculator {
	
	static double pi = 3.14159; // 정적 필드라 객체마다 메모리를 점유하지 않음. 모든 객체가 얘를 참조함
	// 모든 필드가 같은 값을 가져야 하는 경우 static으로 생성하기

	static int plus(int x, int y) {
		return x + y; // 메소드가 내부에서 인스턴스 필드 혹은 인스턴스 메소드를 사용하면 객체화하지 않을 시 사용 불가니까 static으로 사용 불가
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
