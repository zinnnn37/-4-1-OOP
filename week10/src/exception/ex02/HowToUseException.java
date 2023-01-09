package exception.ex02;

public class HowToUseException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바 컴파일러는 소스 파일 컴파일 시 일반 예외 발생 가능성이 있는 코드를 발견하면 컴파일 에러를 발생시켜 개발자에게 예외 처리 코드 작성을 요구
		// 실행 예외의 경우 컴파일러가 체크하지 않으므로 개발자가 경험을 바탕으로 작성해야함
		
		// try-catch-finally 블록
		/*
		try {
			// 예외 발생 가능 코드
		} catch (예외클래스 e) {
			// 예외 처리
		} [finally {
			// 예외가 생기든 말든 무조건 실행
		} ]
		*/
		
		//Class cla = Class.forName("String");
		
		try {
			Class cla = Class.forName("String");
		} catch (ClassNotFoundException e) {	// 예외 처리
			System.out.println("Class does not exist");
		}
		
		System.out.println();
		
		String d1 = null;
		String d2 = null;
		
		try {
			d1 = args[0];
			d2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Too few params");
		}
		
		try {
			int v1 = Integer.parseInt(d1);
			int v2 = Integer.parseInt(d2);
			int res = v1 + v2;
			System.out.println(v1 + " + " + v2 + " = " + res);
		} catch (NumberFormatException e) {
			System.out.println("Cannot convert String to Integer");
		} finally {
			System.out.println("Run program again");
		}
	}

}
