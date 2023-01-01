package javainstanceof.ex01;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 타입 확인
		/*
		 * 어떤 객체가 어느 클래스의 인스턴스인지 확인
		 * >> 특정 클래스에 속하는지 아닌지, 상속관계인지 확인
		 * 메소드 내 강제 타입 변환이 필요한 경우 타입을 확인하지 않고 캐스팅을 하면 ClassCastException 발생할 수 있음
		 * instanceof 연산자를 통해 확인 후 안전하게 실행
		 * 
		 * boolean res = 객체 instanceof 클래스
		 * >> 객체가 클래스에 속하거나 클래스를 상속받는 클래스에 속하면 true
		 * >> 객체는 클래스 자체가 아니라 클래스로 생성한 객체를 의미함
		 * 
		 * Parent parent = new Parent();
		 * 
		 * public void method(Parent parent) {
		 *		 //Child child = (Child) Parent; // 캐스팅 불가
		 *		 if (parent instanceof Child) { // parent란 Parent 클래스 객체가 Child에 속하나요 ? > false
		 * 			Child child = (Child) parent;
		 * }
		 */
		
	}

}
