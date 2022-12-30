package inheritance.ex02.package1;

public class DmbCellPhone extends CellPhone {
	
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		// 여기서 부모 클래스 생성자 호출됨
		// 명시적으로 부모 생성자 호출도 가능
		// super( [params] );
		this.model = model; // CellPhone field
		this.color = color; // ``
		this.channel = channel;
	}
	
	void turnOnDmb() { System.out.println(channel + "번 DMB 방송 수신을 시작합니다."); }
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println(channel + "번으로 바꿉니다");
	}
	void turnOffDmb() { System.out.println("DMB 방송 수신을 종료합니다."); }
}
// 같은 패키지 안에 있어서 default 인스턴스 멤버임에도 자식 클래스가 접근 가능함