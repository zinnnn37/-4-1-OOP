package inheritance.practice01;

public class Point {
	
	private int x;
	private int y;
	// setter 사용하니까 private으로
	
	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
