package objectequals.ex01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false; // 매가값이 Member가 아니면 바로 false
	} // 왜 나는 재정의 안됨 ? > main class 이름이 Object여서 안됐던 거였나봐
}
