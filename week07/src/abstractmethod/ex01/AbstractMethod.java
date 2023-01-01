package abstractmethod.ex01;

public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메소드 선언만 통일하고 실행 내용은 실체 클래스마다 달라야하는 경우
		/*
		 * abstract 키워드로 선언되고 중괄호가 없음
		 * 하위 클래스는 반드시 재정의해서 실행 내용을 채워야함
		 * >> 그러니까 이름은 다 똑같이 쓰니까 추상 클래스에서 내용 없이 선언만 하고
		 * >> 자식 클래스에서 중괄호 내부를 채운다
		 * 
		 * [ public | protect ] abstract returnType method( [params] );
		 * >> 자식이 접근 가능해야하니까 protected까지 가능
		 * 
		 * public abstract class Animal {
		 * 		public abstract void sound();
		 * }
		 * 
		 * Dog class에서
		 * void sound() { 멍멍 }
		 * 
		 * Cat class에서
		 * void sound() { 야옹 }
		 */
		
		//Animal animal = new Animal(); // Cannot instantiate the type Animal > 추상 클래스라 인스턴스화 불가
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound();
		dog.sound();
		System.out.println();
		
		// 변수 자동 타입 변환 > 자식은 부모 타입으로 형변환 가능
		Animal animal = null;
		animal = new Cat();
		animal.sound(); // Overriding(재정의) 했으니까 자식 클래스의 메소드 실행
		animal = new Dog();
		animal.sound();
		System.out.println();
		
		// 매개변수 자동 타입 변환
		animalSound(new Cat());
		animalSound(new Dog());
	}
	
	public static void animalSound(Animal animal) { // 자동형변환
		animal.sound(); // 자식 클래스에서 재정의한 함수 실행
	}

}
