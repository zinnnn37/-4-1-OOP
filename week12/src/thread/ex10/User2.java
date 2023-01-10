package thread.ex10;

public class User2 extends Thread {
	
	private Calc calc;

	public void setCalc(Calc calc) {
		this.setName("User2");
		this.calc = calc;
	}

	public void run() {
		calc.setMemory(50);
	}
}
