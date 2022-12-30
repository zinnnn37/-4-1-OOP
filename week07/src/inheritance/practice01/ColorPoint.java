package inheritance.practice01;

public class ColorPoint extends Point{

	private String color; // setter 사용하니까 private으로
	
	// 기본생성자 쓰니까 굳이 넣을 필요 없음
	
	void setColor(String color) {
		this.color = color;
	}
	
	void showColorPoint() {
		System.out.print(color);
		super.showPoint();
	}
}
