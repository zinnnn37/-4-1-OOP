package condition.practice01;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("두 개의 정수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int t;
		
		if (x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		
		while (y != 0) {
			t = x % y;
			x = y;
			y = t;
		}
		
		System.out.println("최대 공약수: " + x);
		
		scan.close();
	}

}
