package javaclass.ex05;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 오버로딩
		/*
		 * 매개변수를 달리하는 생성자를 여러개 선언
		 * >> 외부에서 제공되는 다양한 데이터를 사용하여 객체화하기 위해 사용함
		 * Car(String name, String color, int speed) {}
		 * Car(String name) {}
		 * Car(String name, String color) {}
		 * 머 이렇게..
		 * 
		 * 만약 Car (int a, int b) {}
		 * 	   Car (int b, int a) {}
		 * >> 이것은 오버로딩이 아님. 자료형 같음 개수 같음 근데 이름만 다름 > 문제
		 * >> int, String을 String, int로 바꾸는 것은 가능
		 * 
		 * 1. 타입이 다르거나
		 * 2. 개수가 다르거나
		 * 3. 순서가 달라야 함
		 */
		
		// this()
		/*
		 * 한 생성자에서 다른 생성자 호출
		 * 필드 초기화 내용을 한 생성자에만 집중 작성하고 나머지 생성자는 초기화 내용을 가진 생성자로 호출
		 * >> 생성자 오버로딩 증가 시 중복 코드 발생 문제 해결
		 * 
		 * ** 생성자 첫 줄에서만 허용됨 **
		 * 
		 * Class ( [parameters] ) {
		 * 		this ( parameters );
		 * 		code;
		 * }
		 */
		
		Car car1 = new Car("avante");
		System.out.println("1. model: " + car1.model);
		System.out.println("1. color: " + car1.color);
		System.out.println("1. maxSpeed: " + car1.maxSpeed);
		System.out.println();
		
		Car car2 = new Car("avante", "black");
		System.out.println("2. model: " + car2.model);
		System.out.println("2. color: " + car2.color);
		System.out.println("2. maxSpeed: " + car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("avante", "white", 150);
		System.out.println("3. model: " + car3.model);
		System.out.println("3. color: " + car3.color);
		System.out.println("3. maxSpeed: " + car3.maxSpeed);
		System.out.println();
	}

}
