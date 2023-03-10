package ref.ex01;

public class TypeBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본 타입(primitive type)
		/*
		 * 정수 실수 문자 논리 리터럴 저장
		 * 스택 영역에 위치
		 */
		
		// 참조 타입(reference type)
		/*
		 * 객체의 번지를 참조하는 타입
		 * 배열, 열거, 클래스, 인터페이스
		 * 객체의 주소값을 저장
		 * 힙 영역에 위치
 		 */
		
		// 메모리 사용 영역(Runtime Data Area)
		/*
		 * 1. 메소드 영역(Method Area)
		 * - 각각의 클래스마다
		 * : 정적 필드, 상수, 생성자, 메소드 코드 등을 분류하여 저장
		 */
		/*
		 * 2. 힙 영역
		 * - 객체와 배열이 생성되는 영역(코드 실행 과정에서 생성되는..
		 */
		/*
		 * 3. JVM 스택 영역
		 * - 메소드가 호출되면 프레임이 추가되고, 종료되면 프레임이 제거됨ㄴ
		 */
		
		// 참조 변수의 ==, != 연산
		/*
		 * ==: 주소값이 같으면 true, 다르면 false
		 * !=: 주소값이 다르면 true, 같으면 false
		 */
		// null
		/*
		 * 객체를 참조하지 않는 경우 null 값을 가짐
		 * null인 참조변수의 객체의 데이터나 메소드를 사용하는 경우 NullPointException 발생
		 */
		
		// String
		/*
		 * 같은 내용의 문자열을 가지는 경우 같은 주소값을 참조함(동일한 string 객체를 공유)**
		 * String name1 = "str";
		 * String name2 = "str";
		 * >> 둘은 같은 객체
		 */
		
		String str1 = "str";
		String str2 = "str";
		if (str1 == str2) {
			System.out.println("str1 & str2: " + "같음");
		} else {
			System.out.println("str1 & str2: " + "다름");
		}
		
		String str3 = new String("str");
		String str4 = new String("str");
		
		if (str3 == str4) {
			System.out.println("new str3 & str4: " + "주소값 같음");
		} else {
			System.out.println("new str3 & str4: " + "주소값 다름");
		}
		if (str3.equals(str4))
			System.out.println("new str3 & str4: " + "내용 같음");
		else
			System.out.println("new str3 & str4: " + "내용 다름");
		
		// new 연산자
		/*
		 * 객체 생성 연산자
		 * String name1 = new String("str");
		 * String name2 = new String("str");
		 * >> 이 둘은 다를 객체
		 * >> new를 사용할때마다 새로운 객체가 생성됨
		 * name1 == name2 // false
		 */
		
		// 문자열 비교
		/*
		 * 위의 경우 때문에 단순히 비교연산자 사용하면 제대로 비교 불가(주소값의 비교)
		 * >> equals로 문자열을 비교
		 * boolean res = name1.equals(name2) // true
		 */
	}

}
