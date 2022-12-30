package inheritance.ex07;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Child(); // 자동 형변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		//parent.field2; // 접근 불가
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "data2"; // 접근 가능
		child.method3();
	}

}
