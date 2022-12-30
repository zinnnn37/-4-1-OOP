package javainstanceof.ex01;

public class InstanceofExample {

	public static void method1(Parent parent) {
		if (parent instanceof Child) { // parent가 Child거나 Child를 상속받는 클래스면 true
			Child child = (Child) parent;
			System.out.println("method1 - Casting to Child suceed");
		} else {
			System.out.println("method1 - Casting to Child faild");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Casting to Child suceed");
	}
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		//method2(parentB); // 예외 발생 > B는 Child에서 Parent로 promotion된 것이 아니라 원래부터 Parent였기 때문
		// Child로 casting 불가
	}
}
