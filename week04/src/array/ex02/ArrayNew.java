package array.ex02;

public class ArrayNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new 연산자로 배열 생성
		/*
		 * type[] name = new type[length];
		 * 배열변수 > type[] name = null; name = new type[length];
		 */
		int[] scores = new int[30]; // 30의 공간이 0으로 초기화됨
		String[] names = new String[30]; // null로 초기화
		
		// 초기화값
		/*
		 * char = '\u0000'
		 * long = 0L
		 * float = 0.0f
		 * 어쨌든 정수형은 다 0
		 * boolean = false
		 * 참조타입 = null
		 */
		
		// 배열의 길이: length 필드
		/*
		 * 배열 변수.length;
		 */
		int num = scores.length;
		System.out.println(num); // 30
		
		System.out.println();
	}

}
