package nestedclass.ex03;

public class Outter {

	public void method1(final int arg) { // final
		final int localVariable = 1; // final
		//arg = 100; // final은 이미 정해진 것. 수정 불가
		//localVariable = 100;
		
		class Inner {
			public void method() {
				int res = arg + localVariable; // 읽기만 가능
			}
		}
	}
	
	// Java 8 이후
	public void method2(int arg) { // final
		int localVariable = 1; // final
		//arg = 100; // final은 이미 정해진 것 수정 시 에러?
		//localVariable = 100;
		
		class Inner {
			public void method() {
				int res = arg + localVariable; // 읽기만 가능
			}
		}
	}
}
