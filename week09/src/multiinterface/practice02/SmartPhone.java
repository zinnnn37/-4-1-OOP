package multiinterface.practice02;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	
	@Override
	public void sendCall() {
		System.out.println("Calling...");
	}
	
	public void receiveCall() {
		System.out.println("Phone is ringing!");
	}
	
	public void sendSMS() {
		System.out.println("Typing...");
	}
	
	public void receiveSMS() {
		System.out.println("Read message!");
	}
	
	public void play() {
		System.out.println("Playing music...");
	}
	
	public void stop() {
		System.out.println("Music turned off!");
	}
	
	public void schedule() {
		System.out.println("Scheduling...");
	}
	
	// x + y는 상속받아서 재정의할 필요 x
}
