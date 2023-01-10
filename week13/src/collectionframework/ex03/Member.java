package collectionframework.ex03;

public class Member {
	
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) { // 오버로딩.. Object랑 Sring 객체로 받은 거랑 다른가봐 신기
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (member.name.equals(name)) && (member.age == age);
		} else {
			return false;
		}
	}

	public int hashCode() { // Member 객체의 hashCode
		return name.hashCode() + age;
	}
}
