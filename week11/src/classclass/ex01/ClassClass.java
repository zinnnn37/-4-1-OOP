package classclass.ex01;

public class ClassClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바는 클래스와 인터페이스의 메타 데이터를 Class 클래스로 관리
		/*
		 * 메타 데이터란 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보를 말함
		 */
		
		// Class 객체 얻기 (getClass(), forName())
		/*
		Class clazz = 클래스이름.class;
		Class clazz = Class.forName("package...classname");
		
		Class clazz = 참조변수.getClass();
		*/
		
		// e.g. Car Class
		//Class clazz = Car.class;
		
//		try {
//			Class clazz = Class.forName("classclass.ex01.Car");
//			System.out.println(clazz.getName());
//			System.out.println(clazz.getSimpleName());
//			System.out.println(clazz.getPackage().getName()); // 패키지 경로 구하기
//			System.exit(1);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // 패키지 경로 제공 개빡치네진짜...
		
		Car car = new Car();
		Class clazz = car.getClass();
		
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName()); // 패키지 경로 구하기
		
		
		System.out.println();
		
		// 경로 얻기
		Class clazz1 = Car.class;
		
		String path = clazz1.getResource("tlqkf").getPath(); // 객체로부터의 절대경로 근데 왜 Car.java는 안나오는데요 tlqkf 개어물쩡넘어가네
	
		System.out.println(path);
	}

}
