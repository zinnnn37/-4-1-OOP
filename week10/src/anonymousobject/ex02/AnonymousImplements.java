package anonymousobject.ex02;

public class AnonymousImplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 익명 구현 객체 생성
		/*
		 * 인터페이스 타입의 필드 혹은 변수 선언 후 구현 객체를 초기값으로 대입하는 경우
		 * 우선 구현 클래스를 선언
		 * new 연산자를 이용해서 구현 객체를 생성한 후 인터펭스 타입의 필드 또는 로컬 변수에 대입하는 것이 일반적
		 
		class TV implements RemoteControl { }
		
		class A {
			RemoteControl field = new TV();			// 필드에 구현 객체를 대입
			void method() {
				RemoteControl localVar = new TV();	// 로컬 변수에 구현 객체를 대입
			}
		}
		
		>> 구현 클래스를 명시적으로 선언하는 이유: 이미 선언된 구현 클래스로 간단히 객체를 생성하여 사용할 수 있기 때문이며 이것을 재사용성이 높다고 함
		*/
		
		// 구현 클래스가 재사용되지 않고 특정 위치에서만 사용되는 경우 > 익명 구현 객체 생성
		/*
		 * Interface [field | variable ] = new Interface {
		 * 		// 인터페이스에 선언된 추상 메소드의 실체 메소드 선언
		 * 		// 필드
		 * 		// 메소드
		 * }
		 * 
		 * new Interface { ... }: 인터페이스를 구현해서 중괄호와 같이 구현 클래스를 선언하라는 뜻
		 * new 연산자는 이렇게 선언된 구현 클래스를 객체로 생성함
		 * 
		 * 중괄호 내부에는 인터페이스에 선언된 모든 추상 메소드의 실체 메소드를 재정의해야함
		 * 그렇지 않으면 컴파일 에러
		 */
		
		// 필드 선언 시 초기값으로 익명 구현 객체 생성하여 대입하는 경우
		/*
		class A {
			RemoteControl field = new RemoteControl() {	// 클래스 A의 필드 선언
				@Override
				void turnOn() {}	// RemoteControl 인터페이스의 추상 메소드에 대한 실체 메소드
			}
		}
		*/
		
		// 메소드 내에서 로컬 변수 선언 시 초기값으로 익명 구현 객체 생성하여 대입
		/*
		void method() {
			RemoteControl localVar = new RemoteControl() {	// 메소드의 로컬 변수로 선언
				@Override	// 추상 메소드에 대한 실체 메소드
				void turnOn() {}
			}
		}
		*/
		
		// 메소드의 매개 변수가 인터페이스 타입일 때 메소드 호출하는 코드에서 익명 구현 객체를 생성하여 매개값으로 대입하는 경우
		/*
		class A {
			void method1(RemoteControl rc) {}
			
			void method2() {
				method1(	// method1() 호출
					new RemoteControl() {	// 매개변수로 익명 구현 객체 대입
						@Override
						void turnOn() {}
					}
				)
			}
		}
		*/
		
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		anony.field.turnOff();
		
		anony.method1();
		
		anony.method2(
			new RemoteControl() {	// 매개값으로 익명객체 넘겨주기
				@Override
				public void turnOn() {
					System.out.println("Turn On SmartTV");
				}
				@Override
				public void turnOff() {
					System.out.println("Turn Off SmartTV");
				}
			}
		);
		
		// nestedInterface.ex01에 익명객체 예시 하나 더 있음
	}

}
