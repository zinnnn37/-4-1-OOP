package gettersetter.ex01;

public class Car {
	
	private int speed;
	private boolean stop;
	
	// 생성자

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0; // speed에 음수 저장되는 것을 방지
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return speed;
	}
	/*
	double getSpeed() {
		double km = speed * 1.6; // 필드 값인 마일을 km 단위로 환산 후 외부로 리턴
		return km;
	}
	*/
	
	public boolean isStop() { // boolean이 return일 때 보통 isName()으로 지음
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
