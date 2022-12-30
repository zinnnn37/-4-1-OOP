package inheritance.practice01;

public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point();
		p.setPoint(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.setColor("blue");
		cp.setPoint(3, 4);
		cp.showColorPoint();
	}

}
