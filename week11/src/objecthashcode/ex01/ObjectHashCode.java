package objecthashcode.ex01;

import java.util.HashMap;

public class ObjectHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 해시코드(hashCode())
				/*
				 * 객체를 식별하는 하나의 정수 값
				 * Object 클래스의 객체 해시코드 메소드는 객체 메모리 번지를 이용하여 해시코드를 만들어 리턴
				 * > 객체마다 다른 값을 가짐
				 * 논리적 동등 비교 시 hashCode()를 오버라이딩할 필요가 있음
				 * 
				 * 컬렉션 프레임워크에서 HashSet, HashMap, Hashtble은 다음과 같은 방법으로 두 객체가 동등한지 비교
				 * hashCode() 리턴값		--같음-->	equals() 리턴값	--같음-->	동등 객체
				 * 		|								|
				 * 	   다름							  false
				 * 		|								|
				 * 		|								V
				 * 		ㄴ--------------------------> 다른 객체
				 */
				
				HashMap<Key, String> hashMap = new HashMap<Key, String>();
				
				hashMap.put(new Key(1), "홍길동");
				
				String value = hashMap.get(new Key(1));
				// 필드값은 같지만 hashCode()에서 리턴하는 해시코드가 달라 <1, 홍길동>의 해시키와 다름
				// 두 개를 다른 식별키로 인식하는 것
				// >> hashCode() 재정의 > Key Class 참고
				System.out.println(value); // 재정의 x > null(해시코드가 다르다고 판단), 재정의 o > 홍길동(해시코드를 필드값으로 바꿈, 같은 해시코드라 판단)
				// 실질적으로는 다른 것이 맞지만! 재정의하여 같은 num(필드)을 가지는 경우 논리적으로 동등하다고 처리
	}

}
