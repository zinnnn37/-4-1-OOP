package javafinal.ex01;

public class Person {
	
	final String nation = "KOR"; // 이민.. 못감 ?
	final String rra;
	String name;
	
	public Person(String rra, String name) {
		
		this.rra = rra;		// 이렇게도 final 초기화 가능
		this.name = name;
	}

}
