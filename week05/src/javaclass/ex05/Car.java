package javaclass.ex05;

public class Car {
	
	String model;
	String color;
	int maxSpeed;
	
	Car(String model) {
		this(model, "silver", 250); // 생성자 호출
	}
	
	Car(String model, String color) {
		this(model, color, 250); // 생성자 호출
	}
	// silver랑 250은 초기값
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
