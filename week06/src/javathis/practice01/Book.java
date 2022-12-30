package javathis.practice01;

public class Book {
	
	String title;
	String author;
	
	Book() {
		this("null", "null"); // title, author은 static이 아니기 때문에 객체를 생성하지 않고 title, author 넣어주면 error
	}
	
	Book(String title) {
		this(title, "null");
	}

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}


	
	void show() {
		System.out.println("title: " + title + ", author: " + author);
	}

}
