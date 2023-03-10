package op.ex01;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 단항 > 이항 > 삼항
		 * 산술 > 비교 > 논리 > 대입
		 * 순으로 우선순위가 높음
		 * 
		 * 단항, 부호, 대입의 경우 오른쪽에서 왼쪽으로 연산 진행
		 * a = b = c = 5 >> c = 5 > b = c(5) > a = b(5)
		 */
		
		// 부호 연산 > 결과값이 int
		byte b = 100;
		//byte res = -b; // error
		int res = -b;
		
		// 이항연산자
		/*
		 * 형변환(promotion)
		 * byte + byte = int
		 * int + long = long
		 * int + double = double
		 * int + float = double? > float에 담기는 것으로 보아 float
		 */
		int i = 1;
		float f = 3.14f;
		float r = i + f;
		
		System.out.println(r);
		
		System.out.println();
		
		// char
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1; // c2는 정수타입이기 때문에 error
		char c3 = (char)(c2 + 1); 	// 강제 형변환 시 no error
									// 혹은 int로 받기 > 이 경우 숫자로 출력됨
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		
		System.out.println();
		
		// 문자열
		String str1 = "JDK " + 6.0;
		String str2 = str1 + " 특징";
		// 이 경우는 error 안 남! > String은 정수형이 아니니까
		System.out.println(str2);
		
		System.out.println();
		
		
	}

}
