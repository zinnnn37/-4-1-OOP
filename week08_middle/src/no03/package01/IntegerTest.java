package no03.package01;

import java.util.Scanner;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] units = { 0, 0, 0, 0 };
		String[] s = {"", "십", "백", "천"};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수값을 입력하세요: ");
		int num = scan.nextInt();
		int tmp = num;
		
		int i = -1;
		while (++i < 4) {
			if (i == 3)
				units[i] = tmp;
			else {
				units[i] = tmp % 10;
				tmp /= 10;
			}
		}
		
		System.out.print(num + "는 ");
		for (i = 3; i > -1; i--) {
			System.out.print(units[i] + s[i] + " ");
		}
	}

}
