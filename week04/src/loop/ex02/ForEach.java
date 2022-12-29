package loop.ex02;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 향상된 for문(for-each 문)
		/*
		 * 배열이나 컬렉션을 좀 더 쉽게 처리
		 * 반복 실행을 위해 루프 카운터 변수나 증감식을 사용하지 않음
		 * for (type val : array) {
		 * 		code;
		 * }
		 * >> 파이썬 for score in scores: 같은 거
		 */
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		for (int score : scores) // 배열에서 가져올 항목이 없으면 break
			sum += score;
		System.out.println("total: " + sum);
	}

}
