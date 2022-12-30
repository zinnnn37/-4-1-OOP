package methodoveriding.ex01;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모 클래스의 메소드가 자식 클래스에서 사용하기 부적합한 경우 자식클래스에서 수정하여 사용
		
		// 메소드 재정의 방법
		/*
		 * 부모와 동일한 시그니처를 가져야 함(리턴 타입, 메소드 이름, 메소드의 매개변수 등이 시그니처, 즉, 중괄호 내부만 수정 가능!!)
		 * 접근 제한을 더 강하게 재정의할 수 없음 (public -> default 불가 / default -> public 가능 (부 -> 자식))
		 * 새로운 예외를 throw할 수 없음
		 */
		
		// 메소드가 재정의될 경우 부모 객체 메소드가 숨겨지며, 자식 객체에서 메소드를 호출하면 재정의된 자식 메소드가 호출됨
		
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("Calculator: " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("Computer: " + com.areaCircle(r)); // Math.PI > 더 정밀한 값
		System.out.println();
		
		// 오버로딩 vs 오버라이딩
		/*
		 * 오버로딩은 그냥.. 메소드의 이름만 같고 리턴타입, 매개변수 갯수, 자료형을 다르게 하는 것
		 * 오버라이딩은 위에거 다 같고 중괄호 내용만 다른 것
		 */
		
		// 부모 메소드 호출
		/*
		 * super.부모메소드()
		 */
		double res = com.compare(r);
		System.out.println("res: " + res);
		// Computer 내부에서 super로 Calculator의 areaCircle 호출
	}

}
