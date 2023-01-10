package thread.ex10;

public class User1 extends Thread {
	
	private Calc calc;

	public void setCalc(Calc calc) {
		this.setName("User1");
		this.calc = calc;
	}

	public void run() {
		calc.setMemory(100);
	}
}
