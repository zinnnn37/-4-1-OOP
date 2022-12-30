package javapackage.ex01; // 패키지 선언
// 클래스 작성 시 해당 클래스가 어떤 패키지에 속할 것인지를 선언
// 실제로 포함되어있는 패키지를 선언하지 않으면 동작 x
// 하위패키지는 별도로 import를 해야함
// import com.hankook.*;
// import com.hankook.project.*;

public class Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 패키지
		/*
		 * 패키지의 물리적 형태는 파일 시스템의 폴더
		 * 패키지는 클래스의 일부로 클래스를 유일하게 만들어주는 식별자 역할
		 * 클래스 이름이 동일하더라도 패키지가 다르면 다른 클래스로 인식
		 * 클래스의 전체 이름은 패키지.클래스
		 * >> 상위패키지.하위패키지.클래스
		 */
		
		// 작명 규칙
		/*
		 * 1. 숫자로 시작 불가
		 * 2. $, _ 제외한 특수문자 사용 불가
		 * java로 시작하는 패키지는 자바 표준 API에서만 사용하므로 사용 불가
		 * 모두 소문자로 작성하는 것이 관례
		 */

		// 패키지 없는 클래스
		/*
		 * JDK8 이전은 사용 가능
		 * JDK11 이후는 컴파일 에러
		 */
		
		// 다른 패키지에 동일한 이름의 클래스가 있는 경우 import와 상관 없이 클래스 전체 이름을 정확하게 기술해야함
		/*
		 * sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
		 * sec06.exam02.kumho.Tire tire4 = new sec06.ex02.kumho.Tire();
		 * >> Tire 클래스가 두 패키지에 모두 들어가있음
		 * >> 어떤 패키지의 Tire 클래스인지 명확하게 하기 위해 전체 경로 작성
		 */
	}

}
