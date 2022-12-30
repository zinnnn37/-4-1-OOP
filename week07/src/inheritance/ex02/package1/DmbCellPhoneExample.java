package inheritance.ex02.package1;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmb = new DmbCellPhone("JAVA", "Black", 10);
		// 부모 객체가 먼저 생성되고 그 다음 자식 객체가 생성됨
		// 자식 생성자의 맨 첫줄에서 부모 생성자가 호출됨
		
		System.out.println("model: " + dmb.model); // parent
		System.out.println("color: " + dmb.color); // parent
		System.out.println("channel: " + dmb.channel); // child
		System.out.println();
		
		// parent
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("Hello");
		dmb.receiveVoice("Hi, this is MJ");
		dmb.sendVoice("Oh~ Good to see you");
		dmb.hangUp();
		System.out.println();
		
		// child
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
	}

}
