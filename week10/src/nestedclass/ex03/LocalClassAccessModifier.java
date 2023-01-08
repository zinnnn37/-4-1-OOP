package nestedclass.ex03;

public class LocalClassAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 로컬 클래스에서 사용 제한
		/*
		 * 메소드의 매개변수나 로컬 변수를 로컬 클래스에서 사용할 때의 제한
		 * 메소드가 종료되어도 계속 실행 상태로 존재하는 로컬 스레드 객체의 경우 문제가 생길 수 있음!
		 * 로컬 클래스는 메소드가 종료되면 함께 종료되니까
		 * 근데 메소드가 종료되어도 실행중이어야한다면?
		 * 
		 * > 매개 변수나 로컬 변수를 final 키워드로 선언해야함
		 * 자바 8부터는 final 선언하지 않아도 final의 특성이 부여되어 있음 > final 사용하지 않아도 컴파일 에러 x
		 */
	}

}
