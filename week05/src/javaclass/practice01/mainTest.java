package javaclass.practice01;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(5, "pizza");
		System.out.println("r: " + circle.r);
		System.out.println("name: " + circle.name);
		System.out.println("area: " + circle.calculateArea(circle.r));
	}

}
