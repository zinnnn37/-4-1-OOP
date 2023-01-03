package no01.package01;

public class TriAngleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriAngle test1 = new TriAngle(10.0, 5.0);
		TriAngle test2 = new TriAngle(8.0, 7.0);
		TriAngle test3 = new TriAngle(5.0, 10.0);
		
		System.out.println("base: " + test1.getBase() + ", height: " + test1.getHeight() + ", area: " + test1.calcArea());
		System.out.println("base: " + test2.getBase() + ", height: " + test2.getHeight() + ", area: " + test2.calcArea());
		System.out.println("base: " + test3.getBase() + ", height: " + test3.getHeight() + ", area: " + test3.calcArea());
	
		System.out.println("test1, test2 smae area?: " + test1.isSameArea(test2));
		System.out.println("test1, test3 smae area?: " + test1.isSameArea(test3));
		System.out.println("test2, test3 same area?: " + test2.isSameArea(test3));
	}

}
