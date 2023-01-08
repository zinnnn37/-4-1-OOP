package anonymouseobject.ex01;

public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 익명 객체
		/*
		 * 이름이 없는 객체
		 * 익명 객체를 만드는 조건: 어떤 클래스를 상속하거나 인터페이스를 구현해야 함
		 * 
		 * 일반적인 경우
		 * 상속: class Class extends Parent {...}; Parent parent = new Class();
		 * 구현: class Class implements Interface {...}; Interface interface = new Class();
		 * 
		 * 익명 객체
		 * 상속: 부모클래스 변수 = new 부모클래스() {...};
		 * 구현: 인트페이스 변수 = new 인터페이스() {...};
		 * >> 객체를 한 번만 사용하는 경우 이용함(일회성)
		 */
		
		// 익명 자식 객체 생성
		/*
		 * 일반적인 경우 부모 타입의 필드나 변수를 선언하고 자식 객체를 초기값으로 대입하는 경우
		 * > 부모 클래스를 상속하여 자식 클래스를 선언
		 * > new 연산자를 이용하여 자식 객체 생성 후 부모 타입의 필드나 변수에 대입
		 * 
		 * 자식 클래스를 명시적으로 선언하는 이유: 이미 선언된 자식 클래스로 간단히 객체를 생성하여 사용할 수 있기 때문이며
		 * 								  이를 재사용성이 높다고 말한다
		 * 
		 * class Child extends Parent {}

			public class A {

			Parent field = new Child();
				void method() {
		 		Parent localVar = new Child();
				}
			}
		 * 
		 * 그러나 자식 클래스를 재사용하지 않고 특정 위치에서만 사용하려는 경우:
		 * 익명 자식 객체를 생성하여 사용한다
		 * Parent [filed | variable] = new Parent( [params] ) {
		 * 		// field
		 * 		// method
		 * }
		 * 
		 * Parent( [params] ) { ... } 는 부모클래스를 상속해서 중괄호와 같이 자식클래스를 선언하라는 뜻
		 * Parent( [params] ) 는 부모생성ㅅ자를 호출하는 코드로, 매개값은 부모 생성자의 매개변수에 맞게 입력
		 * 중괄호 내부에는 필드와 메소드를 선언하거나 부모 클래스의 메소드를 재정의하는 애용을 저장
		 * 일반클래스와의 차이점은 생성자를 선언할 수 없다는 것
		 */
		
		// 자식 클래스를 재사용하지 않고 특정 위치에서만 사용하려는 경우
		// 필드 선언할 때 초기값으로 익명 자식 객체를 생성하여 대입
		/*
		public class A {

			Parent field = new Parent() { // Class A의 필드 선언
				int childField;
				void childMethod() {}
				@Override
				void parentMethod() {} // Parent의 메소드 재정의
			};
		}
		*/
		
		// 메소드 내에서 로컬 변수 선언 시 초기값으로 익명 자식 객체 생성하여 대입
		/*
		class A {
			
			void method() {
				Parent localVar = new Parent() { // 로컬 변수 선언
					int childField;
					void childMethod() { }
					@Override
					void parentMethod() { } // Parent 메소드 재정의
				}
			}
		}
		*/
		
		// 메소드 매개 변수가 부모 타입일 경우 메소드를 호출하는 코드에서 익명 자식 객체를 생성하여 매개값으로 대입
		/*
		class A {
			
			void method1(Parent parent) {}	// 익명객체를 매개변수로 전달할 수도 있음
			
			void method2() {
				method1(					// method1 호출
					new Parent() {			// method1의 매개값으로 익명 자식 객체 대입
						int chileField;
						void childMethod() {}
						@Override
						void parentMethod() {}
					}
				)
			}
		}
		*/
		
		// 익명자식객체에 새롭게 정의된 필드 및 메소드는 익명 자식 객체 내부에서만 사용되고 외부에서는 접근 불가
		// > 익명 자식 객체는 부모 타입 변수에 대입되므로 부모 타입에 선언된 것만 사용할 수 있기 때문
		/*
		class A {
			Parent field = new Parent() {
				int childField;			// 새롭게 생성
				void childMethod() {}	// 새롭게 생성
				@Override
				void parentMethod() {	// 부모 필드에 있음 > 재정의
					childField = 3;		// 객체 내부이므로 여기서는 새롭게 생성된 필드와 메소드에 접근 가능
					childMehotd();
				}
			}
		};
		
		void method() {
			field.childField = 3;	// X
									// field는 명목상으로 부모 클래스의 객체이기 때문에
									// field 내에서 새롭게 생성된(부모에는 없는) 필드는 외부에서 접근 불가(내부는 가능, 위 참고)
			field.childMethod();	// X
			field.parentMethod();	// O
		}
		*/
		
		Anonymous anony = new Anonymous();
		
		anony.field.wake(); // 익명 객체 필드 사용 > anony 객체의 필드는 익명객체 > 필드(익명개개체)의 wake 함수 호출
		// 객체를 생성하면 필드가 만들어지니까 그 만들어진 필드(익명객체)를 사용하는 것ㄴ
		anony.method1();	// method1 안에서 익명 객체 생성하고 그 객체를 사용까지 해서 출력이 되는 것
		
		anony.method2(
			new Person() {	// 매개변수로 익명객체 전달 > method2에서 매개변수로 받은 객체의 wake()를 호출
				void study() {
					System.out.println("Studying");
				}
				@Override
				void wake() {
					System.out.println("Wake up at 8:00am");
					study();
				}
			}
		);
	}

}
