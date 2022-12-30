package abstractclass.ex01;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 추상클래스
		/*
		 * 기존 클래스 = 실체 클래스라고 말하겠다.
		 * 실체 클래스들의 공통적인 특성(필드, 메소드)를 추출하여 선언한 것
		 * 추상 클래스와 실체 클래스는 부모, 자식 클래스로서의 상속 관계를 가짐
		 * 
		 * Animal.class(추상 클래스)
		 * Bird.class, Insects.class, Fish.class(실체 클래스)
		 * 실체 클래스가 추상 클래스를 상속받음
		 * >> 실체클래스가 공통으로 가진 것을 뽑아서 부모 클래스를 만드는 것
		 */
		
		// 추상 클래스의 용도
		/*
		 * 실체 클래스에 반드시 존재해야할 필드와 메소드의 선언(실체 클래스의 실제 규격 - 객체 생성용이 아님)
		 * 실체 클래스에는 공통된 내용은 빠르게 물려받고 다른 점만 선언하면 되므로 시간이 절약됨
		 * 작업 지시자의 역할도 함 ?
		 * 일반 클래스와 구분을 위해 abstract를 붙임
		 * 추상클래스는 객체화할 수 없음!
		 */
		/*
		public abstract class Class {
			// field
			// constructor 
			// 자식클래스 객체를 생성할 때 자식 생성자에서 부모 생성자부터 호출하므로 추상 클래스 객체를 생성할 수 없어도 생성자 필요
			// method
		}
		*/
		
		//Phone phone = new Phone("MJK"); // cannot instantiate the type Phone (abstract이기 때문)
		SmartPhone smartPhone = new SmartPhone("MJK");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
