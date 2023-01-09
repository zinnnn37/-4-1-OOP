package stringclass.ex01;

import java.io.IOException;

public class StringClass {

	public static void main(String[] args) throws IOException { // System.in.read() 사용 위해 필요
		// TODO Auto-generated method stub

		// 직접 객체 생성
		/*
		String str1 = new String(byte[] bytes); // 배열 전체를 String 객체로 생성 > byte 배열의 숫자에 해당하는 asciicode로 문자열 만들기
		
		String str2 = new String(byte[] bytes, String charsetName); // 저장한 문자셋으로 디코딩
		
		String str3 = new String(byte[] bytes, int offset, int length); // 배열의 offset 인덱스 위치부터 length만큼 String 생성
		// str1이랑 비슷한데 시작 위치 + 문자열 길이만 지정
		
		String str4 = new STring = new String(byte[] bytes, int offset, int length, String charsetName);
		// 지정한 문자셋으로 디코딩
		 * 
		 * 문자셋: UTF-8 같은 거
		 * 
		 * EUC-KR은 한글 2바이트
		 * UTF-8은 3바이트라 getBytes로 바이트 배열로 바꿀 때 그 길이가 달라짐
		 */
		
		// 키보드로부터 읽은 바이트 배열을 문자열로 변환하는 방법
		/*
		 * System.in.read()메소드는 키보드에서 입력한 내용을 매개값으로 주어진 바이트 배열에 저장하고 읽은 바이트 수를 리턴
		 * e.g. Hello + Enter
		 * Hello + 캐리지리턴(\r) + \n의 코드값이 바이트 배열에 저장되고 총 7개의 바이트를 읽었기 때문에 7 리턴
		 */
		
		byte[] bytes = new byte[100];
		
		System.out.println("input: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo - 2); // \r, \n 뺀 값
		System.out.println(str);
		
		System.out.println();
		
		// 문자열 비교
		/*
		 * obj1.equals(obj2);로 문자열 자체 비교
		 * obj1 == obj2; // 는 각각의 주소값을 비교하는 것. 따라서 같은 문자열이어도 다른 주소에 저장되어있는 경우 false return
		 */
		
		// indexOf
		/*
		 * 부문자열 찾기
		 * 해당 부문자열의 시작 인덱스 반환
		 * 꼭 한 글자여야만 하는 것 아님
		 */
		
		// valueOf() 기본타입의 값을 문자열로 변환
		/*
		 * String str1 = String.valueOf(10);
		 * >> boolean, char, int, long, double, float 등 기본타입을 변환
		 */
	}

}
