package var.ex03;

public class VariableType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 기본 타입은 크게 3가지
		 * 정수: byte(1byte=8bit, -128~127), char(2 -> 0~65535), short(2, -32,768~32,767),
		 * 		int(4), long(8) > 여기서 문자열로 다시 나눌 수 있음
		 * 실수: float(4, 소숫점 7자리까지 제대로 처리), double(8, 15자리까지 제대로 처리)
		 * 논리: boolean
		 */
		
		/*
		 * 리터럴(literal): 소스코드에서 프로그래머에 의해 직접 입력된 값
		 * 정수
		 * 1. 2진수(0b로 시작): 0b1011: 11
		 * 2. 8진수(0으로 시작): 0206 = 134
		 * 3. 10진수
		 * 4. 16진수(0x로 시작): 0xB3: 179
		 */
		
		int var1 = 0b1011;
		int var2 = 0206;
		int var3 = 365;
		int var4 = 0xB3;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		//byte var5 = 128; // 컴파일 에러(Type mismatch: cannot convert from int to byte
		//-> byte의 범위를 벗어나는 값을 대입해서
		
		//long var6 = 1000000000000; // 컴파일 에러(The literal 1000000000000 of type int is out of range)
		//System.out.println(var6);
		//-> 10000000000은 int의 범위를 벗어나는 숫자 > 10000000000L로 하면 long 타입으로 처리 가능
		long var7 = 10000000000L;
		System.out.println("var7: " + var7);
		
		System.out.println();
		
		// char = 하나의 문자를 저장할 수 있음.
		/*
		 * 'A' == 65
		 * 'a' == 97
		 * '가' == 44032
		 * '각' == 44033
		 * 10진수 혹은 16진수 형태의 유니코드를 저장 가능하다
		 * c = 65; // 'A'
		 * c = 0x0041; // 65의 16진수
		 */
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041'; // 16진수로 저장됨
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		// AAA가가가
		
		System.out.println();
		
		// 문자열 > 큰따옴표로 감싼 문자열로 char에 저장 불가
		// String 타입 변수에 저장(주소값으로 저장됨 > 참조변수)
		String str1 = "abc";
		String str2 = "가나다";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println();
		
		// escape sequence
		/*
		 * 문자열 내부에 따옴표 출력: \" or \'
		 * 역슬래시 출력: \\
		 * \t, \n etc.
		 * 유니코드 문자(16진수): \u0041 이렇게 역슬래시 + us
		 */
		
		// 실수 타입
		/*
		 * float: 소숫점 7자리까지 출력
		 * double: 15자리까지
		 * 소수점이 있는 리터럴은 10진수 실수로 인식함
		 * 알파벳 e 혹은 E를 포함한 숫자 리터럴은 지수 및 가수로 표현된 소수점이 있는 10진수 실수로 인식
		 * default double
		 * float 쓰고 싶으면 뒤에 f 혹은 F를 붙임 > float f = 3.14f
		 * 소숫점 이하를 아무리 늘려도 각각 7자리, 15자리까지만 출력됨
		 */
		
		// 논리 타입
		/*
		 * true or false
		 * 왜.. 다 다른거임 C는 TRUE python은 True 얘는 true네...
		 */
		boolean stop = true;
		
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		System.out.println();
	}

}
