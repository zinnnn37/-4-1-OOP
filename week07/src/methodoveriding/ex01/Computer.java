package methodoveriding.ex01;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer's areaCircle()");
		return Math.PI * r * r;
	}
	
	double compare(double r) {
		System.out.println("Cal's areaCircle() by super");
		System.out.println(super.areaCircle(r));
		return this.areaCircle(r);
	}
}
