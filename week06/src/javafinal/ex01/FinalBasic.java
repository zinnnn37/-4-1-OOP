package javafinal.ex01;

public class FinalBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final
		/*
		 * 초기값이 저장되면 최종값이 되어 프로그램 실행 도중 수정 불가
		 * const같은 거 아닌가 > 근데 final 주기 전까지는 초기화하지 않아도 된다는? 차이점? > Person 클래스 참고,,
		 */
		
		// 초기값 주는 법
		/*
		 * 1. 단순 값인 경우 필드 선언 시 초기화(주로 정적 필드(상수)인 경우)
		 * 2. 객체 생성 시 외부 데이터로 초기화 필요한 경우 생성자에서 초기화(주로 인스턴스 필드인 경우)

		 * >> final type field [= initialization ] // 일반적인 초기화
		 * >> final String rra; // 생성자에서 초기화
		 */
		
		Person person = new Person("001008-1234567", "김민진");
		
		System.out.println("nation: " + person.nation);
		System.out.println("rra: " + person.rra);
		System.out.println("name: " + person.name);
		
		//person.rra = "011008-1234567"; // error > the final field cannot be assigned
	}

}
