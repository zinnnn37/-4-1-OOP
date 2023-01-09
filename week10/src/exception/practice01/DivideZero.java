package exception.practice01;

import java.util.Scanner;

public class DivideZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("나뉨수를 입력하시오: ");
		dividend = scanner.nextInt();
		System.out.print("나눗수를 입력하시오: ");
		divisor = scanner.nextInt();
		try {
			System.out.println(dividend + " / " + divisor + " = " + dividend/divisor);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		scanner.close();
	}

}
