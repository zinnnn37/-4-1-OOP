package collectionframework.ex04;

class Student {
	
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return (stu.name.equals(name)) && (stu.sno == sno);
		} else {
			return false;
		}
	}

	public int hashCode() {
		return sno + name.hashCode();
	}
}