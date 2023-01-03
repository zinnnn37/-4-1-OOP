package multiinterface.practice02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone sp = new SmartPhone();
		
		// 인터페이스들은 각각의 인터페이스 객체를 만들어서 ? 실행 ?
		MobilePhoneInterface mp = sp;
		mp.sendCall();
		mp.receiveSMS();
		
		MP3Interface mp3 = sp;
		mp3.play();
		
		// 상속 받은것 + 자체 메소드는 그냥 실행
		System.out.println("3 + 5 = " + sp.calculate(3, 5));
		sp.schedule();
	}

}
