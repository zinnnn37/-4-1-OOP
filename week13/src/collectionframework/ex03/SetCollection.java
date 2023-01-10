package collectionframework.ex03;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
	
	public static void main(String[] args) {
		
		//Set Collection
		/*
		 * List는 객체의 저장 순서를 유지하지만 Set은 저장 순서가 유지되지 않음 >> 인덱스가 의미 없음
		 * 객체 중복하여 저장 불가, 하나의 null만 저장 가능
		 * Set은 수학의 집합과 비슷
		 * >> 집합: 순서와 상관 없고 중복 허용되지 않음
		 * 
		 * HashSet, LinkedHashSet, TreeSet 등
		 * 
		 * boolean add(E e); // 중복 객체를 넣으면 false 반환
		 * Iterator<E> iterator(); // 저장된 객체를 한 번씩 가져오는 반복자 리턴
		 * >> 반복자는 Iterator 인터페이스를 구현한 객체를 말하는데, iterator() 메소드를 호출하여 반복자를 얻고, 반복자로 검색 기능을 대체한다
		 * Set<E> set = ...;
		 * Iterator<E> iterator = set.iterator();
		 * 
		 * Iterator 인터페이스 메소드
		 * boolean	hasNext();	// 가져올 객체가 있으면 true
		 * E		next();		// 컬렉션에서 하나의 객체를 가져옴 -> 이를 사용하기 전에 먼저 가져올 객체가 있는지 확인하는 것이 좋음(hasNext()가 true일 때 사용)
		 * void		remove();	// Set 컬렉션에서 객체를 제거
		 */
	
		// 객체 반복해서 가져오기
		/*
		Set<String> set = ...;
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next(); // 저장된 객체 수만큼 반복
		}
		*/
		// 향상된 for 문
		/*
		Set<String> set = ...;
		for (String str : set) {
			// codes
		}
		*/

		// remove
		/*
		 * Iterator의 next() 메소드로 가져온 객체를 제거하고 싶다면 remove() 메소드를 호출
		 * Iterator의 메소드이지만 실제 Set 컬렉션에서 객체가 제거됨!
		 
		 while (iterator.hasNext()) {
			 String str = iterator.next();
			 if (str.equals("str")) { // set에서 str 제거
				 iterator.remove();
				}
			}
		*/


		// HashSet
		/*
		 * Set 인터페이스의 구현 클래스
		 * 기본 생성자 호출하여 생성
		 * Set<E> set = new HashSet<E>();
		 * 
		 * 해시를 통해 객체 관리
		 * > 해시 값으로 중복값을 걸러냄
		 * hashCode()	-- same -->	equals() -- same -->	same obj	-->	 don't save
		 * 		|					   |
		 * 	  diff					 false
		 * 		|					   |
		 * 		ㄴ-----------------> diff --------> save
		 */

		Set<Member> set = new HashSet<Member>();

		set.add(new Member("kmj", 24));
		set.add(new Member("kmj", 24));

		System.out.println("total elements: " + set.size());
	}
}
