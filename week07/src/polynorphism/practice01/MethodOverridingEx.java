package polynorphism.practice01;

public class MethodOverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		paint(new Shape());
		paint(new Line());
		paint(new Rectangle());
		paint(new Circle());
	}
	
	public static void paint(Shape shape) { // static이어야 위에서 그냥 사용 가능
		shape.draw();
	}

}
