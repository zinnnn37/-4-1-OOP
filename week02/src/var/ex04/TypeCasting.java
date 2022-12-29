package var.ex04;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 타입변환
		/*
		 * 데이터 타입을 다른 데이터 타입으로 변환하는 것
		 * 변수 값을 다른 타입의 변수에 저장할 때 발생할 수 있음
		 */
		byte a = 10;
		int b = a;
		
		// 자동 타입 변환(promotion)
		/*
		 * 큰 허용 범위 타입 = 작은 허용 범위 타입
		 * >> 아무 문제 없기 때문에 에러 발생 x
		 * byte < short < int < long < float < doubles
		 */
		
		char c = 'A';
		int i = c; // 65가 저장됨
		
		b = 65;
		//c = b; // 컴파일 에러: byte는 부호가 있는데 char은 부호가 없기 때문
		
		// 강제 타입 변환(casting)
		/*
		 * 작은 허용 범위 타입 = 큰 허용 범위 타입
		 */
		
		i = 65;
		c = (char) i;
		
		System.out.println(c); // A
		
		double d = 3.14;
		i = (int) d;
		
		System.out.println(i); // 3
		
		System.out.println();
		
		// 정수 연산에서의 자동 타입 변환
		/*
		 * byte/char/short/int  산술연산자  byte/char/short/int
		 * 시 결과값은 모두 int!
		 * >> byte res = byte + byte; // 시 컴파일 에러
		 * >> int res = byte + byte; // 결과는 늘 int기 때문에 에러 x
		 * >> 그러나 byte 변수들을 int로 형변환을 한 후 계산을 진행하기 때문에 시간이 오래 걸림
		 * >> 따라서 기본적으로 int타입으로 선언하는 것이 효율적
		 * 
		 * 하나라도 long인 변수와 계산을 진행하는 경우 결과값은 long
		 */
		
		// 실수 연산에서의 자동 타입 변환
		/*
		 * 피연산자 중 하나가 double인 경우 다른 피연산자도 double로 자동 형변환
		 * 만약 int의 결과를 원한다면 double인 피연산자를 int로 캐스팅해서 계산
		 * float res = 1.5 + 2.3; // error
		 * float res = 1.5f + 2.3f; // compile succeed
		 */
		
		int x = 1;
		int y = 2;
		double res = x / y;
		
		System.out.println(res); // 0.0 > int끼리 계산 > 1 / 2 = 0 > 형변환 > 0.0
		// 실수를 원하는 경우 실수 연산으로 변환해야함
		/*
		 * res = (double) x / y;
		 * res = x / (double) y;
		 * res = (double) x / (double) y;s
		 */
		
		System.out.println();
		
		// + 연산
		/*
		 * 앞에서부터 순차적으로 진행
		 * 두 개의 피연산자 중 하나라도 string이라면 나머지 피연산자도 자동으로 문자열로 형변환
		 */
		
		int val = 3 + 7; // 10
		String str = "3" + 7; // "37"
		str = 3 + "7"; // "37"
		
		val = 1 + 2 + 3; // 6
		str = 1 + 2 + "3"; // 33 > 1 + 2 먼저 수행 > 3, 이후 3 + "3" 수행 > "33"
		str = 1 + "2" + 3; // 123 > 1 + "2" > "12", "12" + 3 = "123"
		}

}
