package objecthashcode.ex02;

public class ObjectHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.hashCode() == obj2.hashCode()) {
			System.out.println("equals");
		} else {
			System.out.println("differnet");
		}
		
		if (obj1.hashCode() == obj3.hashCode()) {
			System.out.println("equals");
		} else {
			System.out.println("differnet");
		}
	}

}
