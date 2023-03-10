package javafinal.ex02;

public class FinalAndConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상수(constant)
		/*
		 * 불변의 값을 보통 상수(static final)라고 함
		 */
		
		// 정적 final field
		/*
		 * 관례적으로 모두 대문자로 작성
		 * 불변의 값인 상수를 만들 경우
		 * e.g. static final double PI = 3.141592;
		 * e.g. static final double EARTH_RADIUS = 6400;
		 */
		
		System.out.println("지구 반지름: " + Earth.EARTH_RADIUS);
		System.out.println("지구 표면적: " + Earth.EARTH_AREA + "km^2");

	}

}
