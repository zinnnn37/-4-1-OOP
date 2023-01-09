package exception.ex04;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 예외 떠넘기기
		// throws 키워드
		/*
		 * 메소드 선언부 끝에 작성되어 메소드에서 처리하지 않은 예외를 호출한 곳으로 넘김
		 * throws 키워드 뒤에는 떠넘길 예외 클래스를 쉼표로 구분하여 나열
		 * 
		 * returnType method( [params] ) throws ExceptionClass1, ExceptionClass2, ... { ... }
		 * returnType method( [parmas] ) throws Exception { ... } // 모든 예외
		 * 
		 * throws 키워드가 붙어 있는 메소드는 반스디 try 블록 내에서 호출되어야 함! try { method(); }
		 * 그리고 catch 블록에서 떠넘겨 받은 예외를 처리해야함
		 */
		
		// 중첩으로 떠넘길 수도 있음
		/*
		 * method1() throws Exception {
		 * 		method2();
		 * }
		 * 그래도 바로 처리해주는 것이 좋음
		 */
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Class does not exist");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
