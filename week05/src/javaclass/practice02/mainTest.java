package javaclass.practice02;

import java.util.Scanner;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.print(">> ");
		rec.width = scan.nextInt();
		rec.height = scan.nextInt();
		
		System.out.println("사각형의 면적은 " + rec.getArea());
		
		scan.close();
	}

} 
