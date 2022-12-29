package javaclass.practice01;

public class Circle {
	
	int	r;
	String name;
	
	Circle(int r, String name) {
		
		this.r = r;
		this.name = name;
	}
	
	double calculateArea(int r) {
		return 3.14 * r * r;
	}
}
// 기본 생성자 사용 예는 javaclass.practice02에