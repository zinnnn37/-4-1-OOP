package objecttostring.ex01;

import java.util.Date;

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 문자 정보 toString()
		/*
		 * 객체의 문자 정보 리턴
		 * 객체의 문자 정보란 객체를 문자열로 표현한 값
		 * 클래스이름@16진수해시코드 로 구성된 문자 정보 리턴
		 */
		
		Object obj = new Object();
		System.out.println(obj.toString()); // e.g. java.lang.Object@4e50df2e
		System.out.println();
		
		// 이 값은 자바 어플리케이션에서는 값어치 x
		/*
		 * 재정의하여 간결하고 유익한 정보를 리턴토록 함
		 * e.g. java.util의 Date클래스는 toString을 재정의하여 현재 시스템의 날짜와 시간정보 리턴
		 * 		String 클래스는 저장하고 있는 문자열 리턴
		 */
		
		Object obj1 = new Object();
		Object obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		System.out.println();
		
		// SmartPhone class
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}

}
