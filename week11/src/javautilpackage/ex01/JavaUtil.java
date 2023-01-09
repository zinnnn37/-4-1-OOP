package javautilpackage.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DateClass
		/*
		 * 날짜와 시간 정보를 저장
		 * 특정 시점의 날짜를 표현하는 클래스
		 * 특정 시점의 연도, 월, 일, 시간정보 저장
		 */
		
		// Calendar 클래스
		/*
		 * 운영체제의 날짜와 시간을 얻을 때 사용
		 * 달력을 표현한 클래스
		 * 해당 운영체제의 Calendar 객체를 얻으면 연도, 월, 일, 요일, 오전/오후, 시간 등의 정보를 얻을 수 있음
		 */
		
		// Date Class
		/*
		 * Date now = new Date();
		 * String strNow = now.toString(); // Wed Jan 04 23:08:35 KST 2023
		 * 원하는 날짜 형식의 문자열을 얻기 위해 java.text 패키지의 SimpleDataFormat 클래스와 함께 사용
		 * yyyy, MM, dd
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		 * 
		 * format() 메소드를 호출해 원하는 형식의 날짜 정보를 얻을 수 있음
		 * String strNow = sdf.format(now);
		 */
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");	// yy해도 됨
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		System.out.println();
		
		// Calendar Class
		/*
		 * 추상클래스 > new 연산자로 인스턴스 생성 불가
		 * getInstance() 메소드를 지원: 현재 운영체제 시간대 기준으로 한 Calendar 하위 객체 얻을 수 있음
		 * Calendar now = Calendar.getInstance();
		 * int year = now.get(Calendar.YEAR); //연도 리턴
		 * Calendar.MONTH
		 * Calendar.DAY_OF_MONTH
		 * Calendar.DAY_OF_WEEK
		 * Calendar.MONDAY // 상수
		 * Calendar.TUESDAY
		 * Calendar.AM
		 * Calendar.HOUR
		 * 등등등
		 */
	}

}
