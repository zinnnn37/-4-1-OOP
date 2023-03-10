package loop.practice01;

import java.util.Scanner;

public class PI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double denominator = 4.0;
		double molecule = 1.0;
		double sum = 0.0;
		int loop = scanner.nextInt() + 1;
		
		while (loop-- > 0) {
			sum += denominator / molecule;
			denominator *= -1;
			molecule += 2;
		}
		System.out.println("PI = " + sum);
	}

}
