package enumerated.ex01;

import java.util.Calendar;

public class EnumBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 열거 타입
		/*
		 * 열거 상수(한정된 값을 저장하는 타입
		 */
		/*
		 * public enum Week {
		 * 		val1,
		 * 		val2,
		 * 		...
		 * }
		 * Week today;
		 * today = Week.val1
		 * 
		 * >> 소스파일 생성(new -> enum) 후 열거타입 선언, 열거상수 선언..
		 */
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); // 달력 불러오기
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일 불러오기
		
		switch (week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNSDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일: " + today);
	}

}
