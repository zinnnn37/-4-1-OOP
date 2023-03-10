package array.ex01;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언
		/*
		 * type[] name; or type name[];
		 * int[] intArray; or int intArray[];
		 * 
		 * 초기화 바로 가능
		 * type[] name = { val1, val2, val3, ... };
		 */
		
		// 값 목록을 이용해서 배열 생성
		/*
		 * type[] name;
		 * name = { val1, val2, ... }; //error
		 * name = new type[] { val1, val2, ... };
		 */
		String[] names = null;
		//names = {"a", "b", "c"}; // array constants can only be used in initializers
		names = new String[] {"a", "b", "c"};
		
		// add
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++)
			sum1 += scores[i];
		System.out.println(sum1);
		
		int sum2 = add( new int[] { 83, 90, 87 } );
		System.out.println(sum2);
	}
		
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++)
			sum += scores[i];
		return sum;
	} // 메소드는 main이랑 따로 작성되어야 함! 파이썬이랑은 다르구만 .. 당연함 자바임

}
