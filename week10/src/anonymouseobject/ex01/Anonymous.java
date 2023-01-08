package anonymouseobject.ex01;

public class Anonymous {

	Person field = new Person() { // 필드 값으로 익명 객체 대입
		void work() {
			System.out.println("Go to work");
		}
		@Override
		void wake() {
			System.out.println("Wake up at 6:00am");
			work(); // 익명 객체 내부에서는 새롭게 생성된 필드 or 메소드에 접근 가능
		}
	};
	
	void method1() {
		Person localVal = new Person() { // 메소드의 로컬 변수값으로 익명 객체 대입
			void walk() {
				System.out.println("Take a walk");
			}
			@Override
			void wake() {
				System.out.println("Wake up at 7:00am");
				walk();
			}
		};
		
		localVal.wake(); // 로컬 변수 사용
	}
	
	void method2(Person person) { // 매개변수로 익명 객체 받음
		person.wake();
	}
}
