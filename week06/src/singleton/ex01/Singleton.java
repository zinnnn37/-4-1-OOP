package singleton.ex01;

public class Singleton {
	
	private static Singleton singleton = new Singleton(); // private으로 객체 생성ㄴ
	
	private Singleton() {}; // private으로 생성자에 대한 외부 접근 차단
	
	static Singleton getInstance() { // getter, setter로 만들어둔 객체에 접근하는 것
		return singleton;
	}

}
