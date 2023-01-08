package nestedclass.ex04;

public class Outter {
	
	String field = "outter";
	
	void method() {
		System.out.println("outer-method");
	}

	class Inner {
		String field = "inner";
		
		void method() {
			System.out.println("inner-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
