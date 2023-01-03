package interfaceinheritance.ex01;

public class InterfaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스 상속
		/* 
		 * 인터페이스는 다중상속 가능
		 * 
		 * public interface lowerInterface extends upperInterface1, upperInterface2 { codes; }
		 * 
		 * 하위인터페이스 변수 = new 구현클래스(...);
		 * 상위인터페이스1 변수 = new 구현클래스(...); // 상위1만 사용 가능
		 * 상위인터페이스2 변수 = new 구현클래스(...); // 상위2만 사용 가능
		 */
		
		ImplementationC impl = new ImplementationC();
		
		A ia = impl; // B, C 사용 불가
		ia.methodA();
		System.out.println();
		
		B ib = impl; // A, C 사용 불가
		ib.methodB();
		System.out.println();
		
		C ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
