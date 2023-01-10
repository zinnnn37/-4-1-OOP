package collectionframework.ex02;

public class ListCollection {
	
	public static void main(String[] args) {
		
		// List Collection (인터페이스)
		/*
		 * 배열과 비슷하게 객체를 인덱스로 관리
		 * 저장 용량이 자동으로 증가, 객체 저장 시 자동 인덱스가 부여
		 * 추가, 삭제, 검색 위한 다양한 메소드 제공
		 * 객체 자체를 저장하는 것이 아닌 객체 번지 참조
		 * > 동일한 객체를 중복 저장할 수 있는데 이 경우 동일한 번지가 참조! 1을 두 번 저장하면 그 두 인덱스 다 1을 가리키는 주소값을 저장
		 * > null도 저장 가능, 이 경우 해당 인덱스는 객체를 참조하지 않음\
		 * 
		 * 메소드의 매개 변수 타입과 리턴 타입에는 E라는 타입 파라미터가 있는데, 이는 저장되는 객체의 타입을 List 컬렉션을 생성할 때 결정하라는 뜻
		 * List<String>으로 list 변수를 선언, 이는 List 컬렉션에 저장되는 객체를 String 타입으로 하겠다는 뜻
		 * 따라서 E 타입 파라미터는 String 타입이 됨
		 * 
		 * 
		 * List<string> list = ...;
		 * list.add("str1");
		 * list.add(1, "str2");
		 * String str = list.get(1); // str2
		 * list.remove(0);
		 * list.remove("str2");
		 * 
		 * for (String str : list) { // for string in strings: # 와 같은 역할
		 * 		배열 탐색
		 * }
		 */

		// ArrayList
		/*
		 * List 인터페이스의 대표적 구현 클래스
		 * List<E> list = new ArrayList<E>(); // 선언, 초기 용량은 10
		 * // E에는 클래스, 인터페이스 등이 들어갈 수 있음
		 * List<String> list = new ArrayList<String>();
		 * List<String> list = new ArrayList<>(); // 앞에서 선언했으니 생략 가능
		 */

		// Vector
		/*
		 * ArrayList와 동일한 내부 구조
		 List<E> list = new Vector<E>();
		동기화된 메소드로 구성되어 멀티 스레드가 동시에 Vector 메소드들을 실행할 수 없고, 
		하나의 스레드가 메소드 실행을 완료해야만 다른 스레드가 메소드를 실행할 수 있음
		 >> 멀티 스레드 환경에서 안전하게 객체 추가 및 삭제할 수 있음
		 >>>> 스레드에 안전(thread safe)하다고 표현
		 */

		// LinkedList
		/*
		 * ArrayList와 사용 방법은 같으나 내부 구조가 다름
		 * 인접 참조를 링크하여 체인처럼 객체를 관리
		 * 특정 인덱스 객체 제거하거나 삽입하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않음
		 * 				순차적으로 추가 및 삭제		중간에 추가 및 삭제		검색
		 * ArrayList			빠름				느림			빠름
		 * LinkedList			느림				빠름			느림
		 * >> System.nanoTime(); 으로 확인 가능
		 */
	}
}
