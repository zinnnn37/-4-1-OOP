package inheritance.ex01;

public class InheritanceBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이미 개발된 클래스를 재사용하여 새로운 클래스를 만들어 중복되는 코드를 줄임
		 * 부모 클래스의 한 번의 수정으로 모든 자식 클래스까지 수정되어 유지보수시간이 줄어듦
		 * 하나의 클래스에게만 상속받을 수 있음(자식은 부모를 하나만 가질 수 있음)
		 * 
		 * extend Class를 클래스 이름 뒤에 붙이면 상속 가능
		 * >> class [ 자식 ] extends [ 부모 ] {} >> B 클래스는 A 클래스를 상속받는다
		 * 
		 * 부모 클래스에서 private 접근 제한을 갖는 필드와 메소드는 상속되지 않음
		 * 부모와 자식 클래스가 다른 패키지에 존재하는 경우 default 접근 제한된 필드와 메소드 또한 상속되지 않음
		 */
	}

}
