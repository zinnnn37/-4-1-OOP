package singleton.ex01;

public class SingletonBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 싱글톤(singleton)
		/*
		 * 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩기법
		 */
		
		// 작성방법
		/*
		 * 클래스 외부에서 new 연산자를 통해 생성자를 호출하는 것이 불가하도록 private 접근제한자를 사용
		 * 자신의 타입인 정적 필드 선언 후 자신의 객체 생성해 초기화
		 * 외부에서 호출할 수 있는 getInstance() 선언
		 * 정적 필드에서 참조하는 자신의 객체 리턴
		 
		public class Class {
			// 정적 필드 선언
			private static Class singleton(자유롭게 작성) = new Class(); // 같은 클래스 내라서 private이지만 생성자 사용 가능
			
			// private 생성자
			private Class() {}
			
			// 정적 메소드
			static Class getInstance() {
				
				return singleton;
			}
			
		}
		
		*/
		
		//Singleton obj1 = new Singleton(); // error: not visible > 생성자 private이라 생성 불가
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) { // 주소값이 같으면
			System.out.println("same"); // 같은 주소값이라 same 출력
		} else {
			System.out.println("different");
		}
	}

}
