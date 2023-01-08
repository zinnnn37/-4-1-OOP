package nestedclass.ex04;

public class GetReferenceOfOutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 중첩 클래스에서 바깥 클래스 참조 얻기
		/*
		 * Outter.this.field;
		 * Outter.this.method();
		 * 
		 * 그냥 this.field > Inner의 field
		 */
		
		Outter outter = new Outter();
		Outter.Inner inner = outter.new Inner();
		inner.print();
	}

}
