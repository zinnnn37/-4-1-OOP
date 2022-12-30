package inheritance.ex04;

public class TypeConvert {
	
	// 타입 변환과 다형성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성 (Polymorphism)
		/*
		 * 사용방법은 동일하나 다양한 객체를 활용해 여러 실행결과가 나오도록 하는 성질
		 * 메소드 재정의 + 타입 변환 -> 다형성
		 */
		
		// 자동 타입 변환(promotion) 중요~~~~~~~~~~~~~~~~~~~~~~~~~~
		/*
		 * 부모타입 변수 = 자식타입;
		 * 
		 * Cat cat = new Cat();
		 * Animal animal = cat;
		 * 
		 * or
		 * 
		 * Animal animal = new Cat();도 가능
		 * 
		 * 바로 위 부모가 아니더라도 상속 계층에서 상위타입인 경우 자동타입변환 가능
		 * 
		 * A <- B <- D
		 * A <- C <- E
		 * A가 최상위 부모
		 * 
		 * B b = new B();
		 * C c = new C();
		 * D d = new D();
		 * E e = new E();
		 * 
		 * A a1 = b;
		 * A a2 = c;
		 * A a3 = d;
		 * A a4 = e;
		 * 
		 * B b1 = d;
		 * C c1 = el
		 * // 까지 가능
		 * 
		 * // 불가능
		 * B b2 = e;
		 * C c2 = d;
		 */
		
		// 부모타입으로 자동타입변환 이후에는 부모 클래스에 선언된 필드 및 메소드만 접근 가능(역시..)
		// 예외적으로 메소드가 자식 클래스에서 재정의 될 경우 자식 클래스의 메소드가 대신 호출 ?! *****
		
		Child child = new Child();
		Parent parent = child; // promotion
		
		parent.method1();
		parent.method2(); // Child's method2() 호출 > Override 되었기 때문
		//parent.method3(); // 호출 불가
	}

}
