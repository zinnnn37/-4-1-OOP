package var.ex05;

import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 파일 입출력
		/*
		 * System.out // 시스템 표준 출력 장치로 출력 e.g. System.out.println("");
		 * System.in // 시스템 표준 입력 장치에서 읽음 e.g. System.in.read();
		 */
		
		// OUT
		/*
		 * println(내용); // 내용 출력 + 줄바꿈
		 * print(내용); // 내용 출력
		 * printf("형식 문자열", 값1, 값2, ...); // 문자열 형식대로 내용 출력
		 */
		
		System.out.printf("이름: %s\n", "김민진");
		System.out.printf("나이: %d\n", 23);
		
		/*
		 * %6d // 6자리 정수 ___123
		 * %-6d // 6자리 정수인데 오른쪽에 공백 주기 123___
		 * %06d // 6자리 정수인데 빈 칸 0으로 채우기 000123
		 * > 실수, 문자열도 마찬가지
		 */
		
		System.out.println();
		
		// IN
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); // 65
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); // 13
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode); // 10
		// >> 13, 10이 나오는 이유: Enter까지 포함되기 때문
		// Enter는 CR=13과 LF=10으로 구성(window 환경에서는 항상 Enter와 같이 처리됨)
		
		System.out.println();
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if (keyCode == 113) { // 'q'
				break;
			}
		}
		
		System.out.println();
		
		// System.in.read()의 단점
		/*
		 * 2개 이상의 키가 조합된 한글을 읽을 수 없음
		 * 하나의 문자만 읽을 수 있음
		 * >> Scanner 클래스를 이용하면 문자열 전체를 읽을 수 있음
		 */
		
		// import java.util.Scanner;
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) { // 위에 q break 때문에 출력 안된 엔터가 먼저 출력됨?
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println("quit");
		System.out.println();
	
		// 기본 타입의 값 비교와 문자열 비교
		/*
		 * 기본 타입의 값 비교는 == 연산자 이용
		 */
		
		int x = 5;
		boolean b = (x == 5); // true
		
		/*
		 * 문자열 비교는 equals() 메소드 사용
		 */
		
		b = inputData.equals("비교할 문자열");
		
		String str = "java";
		boolean res1 = str.equals("java"); // true
		boolean res2 = str.equals("Java"); // false
		
		System.out.println("res1: " + res1);
		System.out.println("res2: " + res2);
	}
	
}
