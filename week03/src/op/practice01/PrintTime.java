package op.practice01;

import java.util.Scanner;

public class PrintTime {
	// 초 단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지 출력
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("시, 분, 초를 입력하세요: ");
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		int sec = scanner.nextInt();
		*/
		
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt();
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		sec = time % 60;
		min = time / 60 % 60;
		hour = time / (60 * 60);
		
		System.out.println(time + "초는 " + hour + "시 " + min + "분 " + sec + "초");
	}

}
