package singleton.ex01;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}; // private으로 외부 접근 차단
	
	static Singleton getInstance() {
		return singleton;
	}

}
