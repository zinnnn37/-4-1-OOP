package javainterface.ex01;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() { // public 빼니까 error. 당연함 이건 인트페이스가 아니라 클래스라 기본값 default임..
		System.out.println("오디오를 켭니다");
	}
	
	public void turnOff() {
		System.out.println("오디오를 끕니다");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨: " + this.volume);
	}
}
