package accessmodifier.ex01;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 접근 제한자(Access Modifier)
		/*
		 * 클래스와 인터페이스 및 이들이 가진 멤버의 접근 제한
		 * 
		 * 1. public
		 * : 외부 클래스가 자유롭게 사용 가능
		 * 2. protected
		 * : 같은 패키지 혹은 자식 클래스에서 사용 가능
		 * 3. default
		 * : 같은 패키지에 소속된 클래스만 사용 가능
		 * : 접근 제한자를 명시하지 않은 경우
		 * 4. private
		 * : 외부에서 사용 불가
		 */
		
		// 클래스 접근 제한
		/*
		 * 같은 패키지 내에서만 사용할 것인지 다른 패키지 내에서도 사용할 수 있도록 할 것인지 결정
		 */
		
		// default
		/*
		import package1.ex01;
		import package1.ex02; // C 접근 위함
		
		class A {} // B 접근 가능, C 접근 불가
		
		class B {} // A 접근 가능, C 접근 불가
		
		import package1.ex02;
		import package1.ex01; // A, B 접근 위함
		
		class C {} // A, B 접근 불가
		*/
		
		
		// public
		/*
		import package1.ex01;
		import package1.ex02;
		
		public class A {} // B 접근 가능
		
		class B {} // A 접근 가능
		
		import package1.ex02;
		import package1.ex01;
		
		class C {} // A 접근 가능, B 접근 불가
		
		- 다른 패키지에서도 아무 제한 없이 사용 가능
		- 인터넷으로 배포되는 라이브러리 클래스는 모두 public 접근 제한을 가지고 있음
		*/
		
		// 생성자의 접근 제한
		/*
		 * 생성자의 접근 제한에 따라 생성자 호출 가능 여부 결정
		 * 클래스가 default = 기본생성자도 default
		 * 클래스가 public = 기본 생성자도 public
		 * >> 클래스는 public, default로만 생성함
		 * >> private은 클래스 생성의 의미가 없고 protected는 ..? 상속? 관계에서 ? 사용하기때문에 잘 사용 안한다고 ?
		 * 
		 * private 생성자 >> singleton에서 사용,,
		 */
	}

}
