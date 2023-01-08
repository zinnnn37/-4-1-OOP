package anonymousobject.ex03;

public class AnonymousObjectLocalVariable {

	public static void main(String[] args) {
		
		// 메소드의 매개변수나 로컬 변수를 익명 객체 내부에서 사용할 때의 제한
		/*
		 * 메소드가 종료되어도 익명 객체가 계속 실행 상태로 존재할 수 있음
		 * 메소드의 매개 및 로컬 변수를 익명 객체 내부에서 사용할 경우에는 지속 사용 불가
		 * >> 메소드가 종료되면 메소드의 매개변수와 로컬변수는 사라질 테니까
		 * 
		 * 컴파일 시 익명 객체에서 아용하는 매개변수나 로컬 변수의 값을 익명 객체 내부에 복사해두고 사용
		 * >> 매개 및 로컬 변수가 수정되어 값 변경되면 매개 및 로컬 변수를 final로 선언할 것을 요구
		 * >> 메소드가 종료되면 더 이상 값이 바뀔 리가 없으니까 혹시 모를 경우를 대비해 값이 바뀌지 않도록 final로
		 * 
		 * >>>> nestedclass.ex03에서도 나왔던 이야기
		 */
		
		Anonymous anony = new Anonymous();
		anony.method(0, 0);
	}
}
