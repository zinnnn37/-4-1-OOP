package nestedinterface.ex01;

public class CallListener implements Button.OnClickListener { // 객체 안의 인터페이스이므로 Class.Interface 형태

	@Override
	public void onClick() {
		System.out.println("Calling...");
	}
}
