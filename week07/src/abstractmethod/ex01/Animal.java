package abstractmethod.ex01;

public abstract class Animal {

	public String kind;
	
	public void breath() {
		System.out.println("Breathing ...");
	}
	
	public abstract void sound();
}
