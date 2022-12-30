package abstractmethod.ex01;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "Dog";
	}
	
	@Override
	public void sound() {
		System.out.println("Woof! Woof!!");
	}
}
