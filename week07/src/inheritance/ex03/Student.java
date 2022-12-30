package inheritance.ex03;

public class Student extends People {

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 클래스 생성자 명시적으로 작성
		this.studentNo = studentNo;
	}
}
