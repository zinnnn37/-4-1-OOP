package var.ex01;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// type name; -> 선언
		// type name1, name2, name3; -> 여러 개 선언 가능
		/*
		 * 첫 글자는 문자이거나 $, _ 이어야 하며 숫자로 시작할 수 없음
		 * 대소문자 구분
		 * 첫 문자는 소문자로 시작하되, 다른 단어가 붙을 경우 첫 문자를 대문자로(camelCase)
		 * 길이 제한은 없음
		 * 예약어 사용 불가
		 */
		
		/*
		 * 예약어: 자바 언어에서 의미를 가지고 사용되는 단어
		 * 변수 이름으로 사용할 경우 컴파일 에러
		 */
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간 " + minute + "분"); // 출력 시 +는 이어서 출력시켜주는 것
		
		int totalMinute = (hour * 60) + minute;
		
		System.out.println("총 " + totalMinute + "분");
	}

}
