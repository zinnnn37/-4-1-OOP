package nestedclass.ex02;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 중첩 클래스의 접근제한
		/*
		 * 바깥 클래스에서 인스턴스 멤버 클래스 사용하는 경우 
		 * B field1 = new B();
		 * C field2 = new C();
		 * 
		 * void method1() {
		 * 		B var1 = new B();
		 * 		C var2 = new C();
		 * }
		 * 
		 * //static B field3 = new B(); 정적 필드, 메소드에는 인스턴스 클래스 사용 불가
		 * static C field4 = new C();
		 * 
		 * static void method2() {
		 * 		//B var1 = new B();
		 * 		C var2 = new C();
		 * }
		 * 
		 * class B{}
		 * static class C{}
		 * 
		 * 
		 * &&
		 * 
		 * static class 내부엥서는 바깥 클래스의 인스턴스 멤버에 접근 불가능
		 */
	}

}
