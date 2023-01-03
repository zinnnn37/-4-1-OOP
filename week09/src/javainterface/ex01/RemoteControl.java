package javainterface.ex01;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// public static final 생략 가능
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	// 기본적으로 abstract
}
