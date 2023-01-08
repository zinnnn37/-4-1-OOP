package nestedclass.ex02;

public class A {
	
	B b1 = new B();
	C c1 = new C();
	
	void m1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//static B b2 = new B(); // 인스턴스 클래스는 정적 필드로 선언 불가
	static C c2 = new C();
	
	static void m2() {
		//B var1 = new B(); // 인스턴스 클래스는 정적 메소드 내에서 선언 불가
		C var2 = new C();
	}
	
	////////////////////////////////////////////////////

	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		
		void method() {
			//field1 = 10 // 정적 클래스는 외부 클래스의 인스턴스 멤버에 접근 불가능
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}