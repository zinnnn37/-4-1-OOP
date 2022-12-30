package inheritance.practice02;

public class ColorPoint extends Point{

	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	/*
	void setColor(String color) {
		this.color = color;
	}*/
	
	void showColorPoint() {
		System.out.print(color);
		showPoint(); // 상속 받았으니까 super.showPoint 안해도 쓸 수 있음
	}
}
