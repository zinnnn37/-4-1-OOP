package gettersetter.practice01;

public class Account {
	
	private String name;
	private int balance;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		if (balance < 0) {
			System.out.println("Invalid balance!");
			return;
		}
		this.balance = balance;
	}

	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
}
