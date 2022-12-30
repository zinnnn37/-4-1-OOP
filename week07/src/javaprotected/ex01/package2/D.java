package javaprotected.ex01.package2;

import javaprotected.ex01.package1.*;

public class D extends A{

	public D() {
		super(); // 부모클래스 생성자
		this.field = "value";
		this.method();
	}
}
