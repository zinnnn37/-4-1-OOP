package array.ex03;

public class ArgsVariables {

	// run compiguration > Arguments Tab > Program arguments에 전달할 매개변수 적으면 됨
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] args 매개변수
		/*
		 * 실행할 때 명령라인 매개값을 주지 않은 경우 길이 0인 String 배열을 생성 후 main() 메소드 호출
		 * 주었을 경우..
		 * JDK 11 이후 버전
		 * >> java -p . -m 모듈명/패키지.클래스 문자열0 문자열1 문자열2 ... 문자열n-1
		 * >> String[] args = { 문자열0, 문자열1, 문자열2, ... , 문자열n-1 }; 배열이 String[] args로 전달되어 main 메소드에서 사용 가능
		 */
		if (args.length != 2) {
			System.out.println("2개의 값을 입력하세요.");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int res = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + res);
	}

}
