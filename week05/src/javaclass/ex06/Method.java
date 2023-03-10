package javaclass.ex06;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method
		/*
		 * returnType Name ( [parameters] ) {
		 * 		code;
		 * }
		 * 
		 * 1. 숫자로 시작하면 안됨
		 * 2. $, _ 외의 특수문자 사용 불가
		 * 3. 소문자로 시작
		 * 4. camelCase
		 */
		
		// 메소드 선언
		/*
		 * 리턴 x
		 * method( [parameters] );
		 * 
		 * 리턴 o
		 * type res = method( [parameters] );
		 */
		
		// 매개변수의 개수를 모르는 경우
		/*
		 * 1. 매개변수를 배열 타입으로 선언
		 * int sum(int[] values) {};
		 * 
		 * int[] values = { 1, 2, 3 };
		 * int res = sum(values);
		 * 
		 * or
		 * 
		 * int res = sum(new int[] { 1, 2, 3, 4, 5 });
		 * 
		 * 2. 목록의 값만 넘겨주는 방식
		 * int sum(int ... values) { } // values라는 이름의 배열로 컴파일러가 생성해줌
		 * 
		 * int res = sum(1, 2, 3); > 1, 2, 3이 values라는 int 배열로 처리됨
		 * int res = sum(1, 2, 3, 4, 5);
		 */
		
		Computer com = new Computer();
		int[] values1 = { 1, 2, 3 };
		int res1 = com.sum1(values1);
		System.out.println("res1: " + res1);
		
		int res2 = com.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("res2: " + res2);
		
		int res3 = com.sum2(1, 2, 3);
		System.out.println("res3: " + res3);
		
		System.out.println();
		
		// return
		/*
		 * void > return;으로 메소드 강제 종료
		 */
		
		// 메소드 호출
		/*
		 * 객체 내부: 이름으로 호출
		 * 객체 외부: 객체화한 후 참조변수를 이용하여 메소드 호출
		 */
		
		// 메소드도 오버로딩 가능
		/*
		 * 변수 타입, 개수, 순서 중 하나라도 달라야 함
		 * 
		 * int plus(int x, int y) { };
		 * double plus(double x, double y) { };
		 * 가 있을 때
		 * plus(10, 20.3);
		 * 을 계산하면 자동적으로 double plus(double, double) 쪽을 실행시킴
		 * 
		 * println이 대표적으로 오버로딩된 메소드
		 */
	}

}
