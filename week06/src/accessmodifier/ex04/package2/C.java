package accessmodifier.ex04.package2;

import accessmodifier.ex04.package1.A;

public class C {
	
	public C() {
		
		A a = new A();
		
		a.field1 = 1;
		//a.field2 = 1; // default: not visible
		//a.field3 = 1;
		
		a.method1();
		//a.method2();
		//a.method3();
	}

}
