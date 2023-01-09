package objectequals.ex01;

public class ObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object 클래스
				/*
				 * 모든 클래스는 Object 클래스의 자식이거나 자손 클래스
				 * Object	<- System (Object의 자식)
				 * 			<- String
				 * 			<- Number	<- Integer (Object의 자손)
				 * 			<- ...
				 */
				
				// 객체 비교(equals())
				/*
				 * 메소드의 매게 타입은 Object로 모든 객체가 매개변수로 대입될 수 있음
				 * > 모든 객체는 Object로 자동변환될 수 있기 때문
				 * public boolean equals(Object obj) { ... }
				 * 
				 * 1. ==와 동일 결과 리턴
				 * 두 객체가 동일한 객체라면 true 그렇지 않으면 false(주소값 확인)
				 * 
				 * 2. 논리적으로 동등하면 true를, 그렇지 않으면 false를 리턴
				 * >> 논리적으로 동일: 같은 객체이건 다른 객체이건 객체가 저장하는 데이터가 동일함을 의미
				 * e.g. String 클래스의 Object가 equals 메소드를 재정의하면서 주소값을 비교하는 것이 아니라 문자열을 비교하는 것으로 변경
				 *
				 * equals를 재정의할 때는 매개값(비교 객체)이 기준 객체와 동일 타입인지 먼저 확인 필요(instanceof)
				 * 동일한 타입이라면 기준 객체 타입으로 강제 타입변환하여 필드값이 동일한지 검사
				 * >> Member Class 참조
				 */
				
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
			
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다");
		}
	}

}
