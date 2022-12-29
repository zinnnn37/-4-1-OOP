package array.practice04;

import java.util.Random;

public class RandomDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] cnt = new int[7];
		
		for (int i = 0; i < 10000; i++) {
			cnt[random.nextInt(6) + 1]++;
			// Random 패키지 import하지 않을 시
			/*
			 * cnt[(int) (Math.random() * 6 + 1) 하등가 0 ~ 5를 1 ~ 6에 등치시켜서 +1을 빼거나
			 */
		}
		System.out.println("==========\n 면빈도\n==========");
		for (int i = 1; i < cnt.length; i++) {
			System.out.println(i + ": " + cnt[i]);
		}
	}

}
