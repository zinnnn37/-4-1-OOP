package instance.ex02;

public class Car {

	int speed;
	
	void run() {
		System.out.println(speed + "(으)로 달립니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//speed = 60;	// error > main은 static이니까 객체 생성 없이 인스턴스 멤버 사용 불가
		//run();		// error > ``
		
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
		// 이렇게 에러 없이 사용 가능
	}

}
