package loop.ex01;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for
		/*
		 * for (초기화 식; 조건 식; 증감식) {
		 * 		실행문; // 조건식이 true인 경우 실행
		 * }
		 */
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
