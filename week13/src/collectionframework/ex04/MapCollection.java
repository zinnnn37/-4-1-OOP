package collectionframework.ex04;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapCollection {
	
	public static void main(String[] args) {
		
		// Map Collection
		/*
		 * 키와 값으로 구성된 Map.Entry 객체를 저장하는 구조를 가짐 (key + value = Map.Eentry)
		 * Entry는 Map 인터페이스 내부에 선언된 중첩 인터페이스(키와 값은 모두 객체)
		 * 키는 중복 저장될 수 없으나 값은 중복 가능
		 * >> 기존 저장된 키와 동일한 키로 값을 저장하면 기존 값 없어지고 새로운 값으로 대체
		 */

		// methods
		/*
		 * Set<Map.Entry<K, V>> entrySet(); // Set<Map.Entry<String, Object>> entrySet(); // 키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
		 * Set<K> keySet(); // 모든 key를 Set 객체에 담아서 리턴
		 * Collection<V> values(); // 모든 값을 Collection에 담아서 리턴
		 */

		// map
		/*
		 * 메소드의 매개변수 타입과 리턴 타입에 K와 V라는 타입 파라미터가 있는데, 이는 저장되는 키와 객체의 타입을 Map 컬렉션을 생성할 때 결정하라는 뜻
		 Map<String, Integer>로 map 변수를 선언 시 컬렉션에 저장되는 키 객체는 String 타입으뢰, 값 객체는 Integer 타입으로 하겠다는 뜻
		 키 타입이 String, 값 타입이 Integer인 컬렉션을 생성하고 put() 메소드로 키와 값을 저장
		 키로 값을 얻거나 제거하기 위해 get(). remove() 사용
		 */

		// 저장된 전체 객체를 대상으로 하나씩 얻고 싶은 경우
		/*
		 * 1. keySet() 메소드로 모든 키를 Set 으로 얻은 후 반복자를 통해 키를 하나씩 얻어 그 키를 통해 get()으로 값 얻기
		 
		 Map<K, V> map = ...;
		 Set<K> keySet = map.keySet();
		 Iterator<K> keyIterator = keySet.iterator();
		 while (keyIterator.hasNext()) {
			 K key = keyIterator.next();
			 V value = map.get(key);
			}

		2. entrySet() 메소드로 Map.Entry를 Set 컬렉션으로 얻은 뒤 반복자 통해 Map.Entry() 하나씩 얻고 getKey()와 getValue() 메소드 이용해 키와 값 얻음
		
		Set<Map.Entry<K, V>> entrySet = map.entrySet();
		Iterator<Map.Entry<K, V>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<K, V> entry = entryIterator.next();
			K key = entry.getKey();
			V value = entry.getValue();
		}
		*/

		// HashMap
		/*
		 * Map 인터페이스를 구현한 대표적인 Map 컬렉션
		 * HashMap의 키로 사용할 객체는 hashCode() && equals() 메소드를 재정의하여 동등 객체가 될 조건을 정해주어야 한다
		 * > 객체가 달라도 동등 객체라면 같은 키로 간주하고 중복 저장하지 않도록 하기 위함
		 * > 동등 객체의 조건은 hashCode() 리턴값이 같고 equals() 메소드가 true를 리턴해야 함
		 * 
		 * HashMap을 생성하려면 키 타입과 값 타입을 타입 파라미터로 주고 기본 생성자를 호출한다
		 * Map<K, V> map = new HashMap<K, V>();
		 * 
		 * ** 키와 값의 타입은 기본타입을 사용할 수 없고 클래스 및 인터페이스 타입만 가능!
		 * >> byte, int, ... 쓰려면 Byte, Integer, ...써야 함
		 */

		
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "kmg"), 100);
		map.put(new Student(1, "kmg"), 100); // duplicated

		System.out.println("total Entry: " + map.size());

		// HashTable
		/*
		 * HashMap과 동일한 내부 구조
		 * 키로 사용할 객체를 hashCode()와 equals()메소드를 재정의하여 동등 객체가 될 조건을 정해야 함
		 * 동기화된 메소드로 구성되어 멀티 스레드가 동시에 HashTable 메소드를 실행할 수 없으며
		 * 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있음
		 * 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있기 때문에 thread safe함
		 */

		Map<String, String> hashTable = new Hashtable<>();

		hashTable.put("spring", "12");
		hashTable.put("summer", "123");
		hashTable.put("fall", "1234");
		hashTable.put("winter", "12345");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("Enter ID and password: ");
			System.out.println("ID: ");
			String id = scanner.nextLine();

			System.out.println("pw: ");
			String pw = scanner.nextLine();
			System.out.println();

			if (hashTable.containsKey(id)) {
				if (hashTable.get(id).equals(pw)) {
					System.out.println("Logged in.");
					break;
				} else {
					System.out.println("Check password");
				}
			} else {
				System.out.println("No such ID");
			}
		}
		scanner.close();

	}
}
