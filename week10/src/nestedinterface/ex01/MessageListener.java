package nestedinterface.ex01;

public class MessageListener implements Button.OnClickListener{
	
	@Override
	public void onClick() {
		System.out.println("Texting...");
	}
}
