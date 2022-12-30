package inheritance.ex02.package1;

public class CellPhone {

	String model;
	String color;
	
	void powerOn() { System.out.println("Turning on the power"); }
	void powerOff() { System.out.println("Turning off the power"); }
	void bell() { System.out.println("Bell is ringing"); }
	void sendVoice (String message) { System.out.println("me: " + message); }
	void receiveVoice (String message) { System.out.println("others: " + message); }
	void hangUp() { System.out.println("Hung up"); }
}
