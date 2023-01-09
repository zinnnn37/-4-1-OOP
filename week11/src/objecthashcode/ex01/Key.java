package objecthashcode.ex01;

public class Key {

	public int num;
	
	public Key(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.num == compareKey.num) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return num; // 해시코드를 필드값으로 재정의
	}
}
// 이 경우 HashMap의 식별키로 Key 객체를 사용하면 저장된 값을 찾아오지 못함
// num 필드가 같더라도 hashCode() 메소드에서 리턴하는 해시코드가 달라 다른 식별키로 인식하기 때문
// >> 이를 방지하기 위해 hashCode()를 오버라이딩할 필요 있음 
