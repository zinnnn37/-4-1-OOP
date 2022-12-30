package accessmodifier.ex01;

public class A {
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("str");
	
	public A(boolean b) {}
	A(int i) {}
	private A(String str) {}
	// protected는 상속에서,,
}
