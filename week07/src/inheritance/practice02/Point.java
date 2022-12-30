package inheritance.practice02;

public class Point {
	
	private int x;
	private int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
/*	
	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	} // setter 사용하라는 이야기는 없긴 했지..
*/
	void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
