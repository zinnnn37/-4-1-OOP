package wrapperclass.ex01;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Wrapper(포장) 객체
		/*
		 * 기본 타입의 값을 내부에 두고 포장
		 * 포장하고 있는 기본 타입 값은 외부에서 변경 불가 !
		 * byte, char, short, int, long, float, double, boolean 기본 타입 값을 갖는 객체
		 * Byte, Character, Short, Integer, Long, Float, Double, Boolean
		 */
		
		// Boxing, Unboxing
		/*
		 * Boxing: 기본 타입의 값을 포장객체로
		 * Unboxing: 포장객체에서 기본 타입의 값을 얻어내는 과정
		 * 
		 * Boxing:
		 * Byte obj = new Byte(10); // 1
		 * valueOf() 정적 메소드를 사용해 생성자 없이 선언 가능 //2
		 * Integer obj = Integer.valueOf(1000); // 이렇게 사용하는 것이 권장됨
		 * 
		 * Unboxing:
		 * byte num = obj.byteValue();
		 * charValue();...
		 */
		
		// 자동 박싱과 언박싱
		/*
		 * 포장 클래스 타입에 기본 값이 대입될 경우 자동 박싱
		 * Integer obj = 100;
		 * 
		 * 기본 타입에 포장 객체가 대입되는 경우 및 연산에서 자동 언박싱
		 * Integer obj = new Integer(200);
		 * int val1 = obj; // Unboxing
		 * int val2 = obj + 100; // Unboxing
		 */
		
		// 문자열을 기본 타입으로 변환
		/*
		 * 포장 클래스로 문자열을 기본 타입으로 변환: parse+기본타입이름 정적 메소드
		 * int num = Integer.parseInt("1000");
		 */
		
		// 포장 값 비교
		/*
		 * == 혹은 != 연산자 사용하지 않는 것이 좋음
		 * > 포장 객체의 참조를 비교하기 때문에 주소값을 비교함. 같은 값이어도 주소가 다르면 false
		 * 
		 * 박싱된 값이 boolean(true false), char(\u0000~\u007f), byte&short&int(-128~127)이 아닌 경우
		 * 언박싱한 값을 얻어 비교해야함
		 * 저 범위 안에 있어도.. 언박싱 하는 것이 권장됨(obj.typeValue() 이용)
		 * or
		 * equals 메소드 이용
		 */
		
		Integer obj1 = 300;
		Integer obj2 = 100;
		System.out.println(obj1.equals(obj2));
	}

}
