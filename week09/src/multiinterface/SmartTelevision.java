package multiinterface;

public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	
	@Override
	public void turnOn() { // public 빼니까 error. 당연함 이건 인트페이스가 아니라 클래스라 기본값 default임..
		System.out.println("TV를 켭니다");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	public void search(String str) {
		System.out.println(str + "을 검색합니다...");
	}
}
