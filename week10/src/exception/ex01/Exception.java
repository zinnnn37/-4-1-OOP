package exception.ex01;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 예외
		/*
		 * 사용자의 잘못된 조작 혹은 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류
		 * 예외처리 프로그램을 통해 정상 실행 상태 유지 가능
		 * 예외 발생 가능성이 높은 코드 컴파일 할 때 예외 처리 유무 확인
		 */
		
		// 일반 예외(exception)
		/*
		 * 컴파일러가 체크
		 * 자바 소스 컴파일 과정에서 해당 예외 처리 코드가 있는지 검사 > 예외처리가 없다면 컴파일 오류
		 */
		
		// 실행 예외(runtime exception)
		/*
		 * 컴파일러가 체크하지 않음
		 * 실행 시 예측할 수 없이 갑자기 발생 > 컴파일 과정에서 예외처리 코드를 따로 검사하지 않음
		 */
		
		// 자바의 예외
		/* 
		 * 예외를 클래스로 관리함
		 * java.lang.Exception
		 * > ClassNotFoundException, InterruptedException.... (일반 예외
		 * > RuntimeException (실행 예외
		 * RuntimeExcption 하위에
		 * > NullPointerException, ClassCastExcption, NumberFormatException 등이 있음
		 */
		
		// 자바 API 참조
		/*
		 * 자바의 API 상세 정보에서 예외 정보를 찾아볼 수 있음
		 */
		
		// 실행 예외
		/*
		 * 개발자의 경험에 의해 예외처리 코드를 작성해야 함
		 * 예외처리 코드가 없는 경우 프로그램 종료
		 * 
		 * NullPointerException
		 * : 가장 비넌하게 발생하는 실행 예외
		 * java.lang.NullPointerException
		 * : 객체 참조가 없는 상태의 참조 변수로 객체 접근 연산자 도트(.)를 사용할 경우 발생
		 * 
		 * String data = null;
		 * data.toString(); >> NullPointerException
		 * 
		 * 
		 * ArrayIndexOutOfBoundsException
		 * : 배열에서 인덱스 범위를 초과할 경우
		 * java.lang.ArrayIndexOutOfBoundsExcption
		 */
		
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("Need two params");
		}
		
		/*
		 * Run > Run Configuration > Arguments Tab > Program arguments
		 */
		
		/*
		 * NumberFormatExcption
		 * : 문자열을 숫자로 변환하는 경우
		 * Integer.parseInt(String s): 문자열을 정수로 변환해서 리턴
		 * Doubld.parseDouble(String s): 실수로
		 * >> 숫자로 변환될 수 없는 문자 포함되는 경우 발생
		 * 
		 * 
		 * ClassCastException
		 * : 상위 및 하위 클래스 그리고 구현 클래스와 인터페이스 간 타입 변환 가능
		 * : 그러나 위의 관계가 아닌 경우 ClassCastException 발생
		 * 
		 * p: Animal, C: Dog, cat
		 * Animal animal = new Dog();
		 * Dog dog = (Dog) animal; // O
		 * Cat cat = (Cat) animal; // X >> animal은 Dog가 자동형변환 된 것이므로 animal은 casting할 때 Dog로만 가능하다
		 * >> 인터페이스도 마찬가지
		 * 
		 * >> instanceof로 미리 확인
		 * if (animal instanceof Dog) {
		 * 		Dog dog = (Dog) animal;
		 * } else if (animal instanceof Cat) {
		 * 		Cat cat = (Cat) animal;
		 * }
		 */
	}

}
