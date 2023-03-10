package instance.ex01;

public class InstanceBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스 (instance)
		/*
		 * 인스턴스 멤버: 객체마다 가지고 있는 멤버
		 * : 인스턴스 필드: 힙 영역의 객체 마다 가지는 멤버, 객체마다 다른 데이터 저장
		 * : 인스턴스 메소드: 객체가 있어야 호출 가능한 메소드.
		 * 	 클래스코드(메소드 영역)에 위치하지만, 이해하기 쉽도록 객체 마다 가지고 있는 메소드라고 생각해도 됨
		 * 
		 * 정적 멤버: 객체와 상관없는 멤버, 클래스 코드(메소드 영역)에 위치
		 * : 정적 필드 및 상수: 객체 없이 클래스만으로도 사용 가능한 필드
		 * : 정적 메소드: 객체가 없이 클래스만으로도 호출 가능한 메소드
		 */
		
		// 인스턴스 멤버
		/*
		 * 객체를 생성한 후 사용할 수 있는 필드와 메소드
		 */
		
		// this
		/*
		 * 객체 내에서 인스턴스 멤버에 접근하기 위해 사용
		 * 생성자와 메소드의 매개 변수 이름이 필드와 동일할 경우, 필드임을 지정하기 위해 주로 사용됨
		 * 
		 * Car (String model) {
		 * 		this.model = model;
		 * }
		 */
		
		// 정적 멤버
		/*
		 * 클래스에 고정됨.
		 * 객체를 사용하지 않고도(생성하지 않고도가 더 정확할 듯) 사용할 수 있는 필드, 메소드 >> static을 앞에 붙여주면 됨
		 * publie class Class {
		 * 		static type filed [= initialization ];
		 * 
		 * 		static returnType method ( parameters ) { codes; }
		 * }
		 * 
		 * 메소드 영역에 위치함 !
		 * 
		 * Class.filed;
		 * Class.method( parameters );
		 * 로 접근함
		 */
		System.out.println("pi: " + Calculator.pi);
		System.out.println("1 + 2 = " + Calculator.plus(1, 2));
		System.out.println("5 - 3 = " + Calculator.minus(5, 3));
		// static이라 객체 생성하지 않고도 사용 가능
		
		// 주의점
		/*
		 * 정적 메소드가 내부에서 인스턴스 필드 혹은 인스턴스 메소드를 사용불가
		 * 인스턴스 멤버는 객체를 생성해야 사용 가능하니까 굳이 사용하려면 객체 생성 후 참조변수로 접근
		 * 정적 멤버는 this 키워드 사용 불가!!!!!!!
		 * 컴파일 에러 남!
		 * 
		 * public class Class {
		 * 		static int field1;
		 * 		int filed2;
		 * 
		 * 		static void method ( params ) {\
		 * 		
		 * 			Class obj = new Class();
		 * 
		 * 			field1 = 10;
		 * 			this.field1 = 10; //error
		 * 			
		 * 			obj.filed2 = 10; // not error > 위에서 객체 생성했으니까
		 * 		}
		 * }
		 */
	}

}
