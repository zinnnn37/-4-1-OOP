package javaclass.ex04;

public class Korean {
	
	String nation = "KOR";
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		// this: 클래스의 필드임을 명시.
		// this가 붙지 않은 경우 동일한 이름의 변수를 사용할 수 없음
		// 그런데 매개변수 이름은 필드 이름과 유사하거나 동일한 것을 사용 권장
		// >> 따라서 그냥 this 사용하고 같은 이름.. 쓰기
	}

}
