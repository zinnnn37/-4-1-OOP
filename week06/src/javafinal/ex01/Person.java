package javafinal.ex01;

public class Person {
	
	final String nation = "KOR"; // 이민.. 못감 ?
	final String rra; // 얘는 const랑 다르게 초기화만 할 수 있음, const에 대응되는 것은 static final
	String name;
	
	public Person(String rra, String name) {
		
		this.rra = rra;		// 이렇게 나중에 값을 넣는 것 가능
		this.name = name;
	}

}
