package no01.package01;

class TriAngle {
	
	double base;
	double height;
	
	TriAngle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	double getBase() {
		return base;
	}
	
	double getHeight() {
		return height;
	}
	
	double calcArea() {
		return base * height * 0.5;
	}
	
	boolean isSameArea(TriAngle tri) {
		if (this.calcArea() == tri.calcArea())
			return true;
		else
			return false;
	}
}