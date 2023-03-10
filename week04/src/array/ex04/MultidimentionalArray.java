package array.ex04;

public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구조
		/*
		 * int[][] scores = new int[2][3]; // 행(가로) 2개 열(세로) 3개
		 * int[][] scores = new int[2][];
		 * scores[0] = new int[2];
		 * scores[1] = new int[3];
		 * >> 첫 행은 2개 두번째 행은 3개로 계단식 구조
		 */
		
		// 초기화
		/*
		 * type[][] val = { { val1, val2, ... }, { val1, val2, ... }, ... };
		 */
		
		// 배열 인덱스도.. 다차원 배열이랑 비슷
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1] ); // true
		System.out.println( strArray[0] == strArray[2] ); // false
		System.out.println( strArray[0].equals(strArray[2]) ); // true
		
		System.out.println();
		
		// 배열 복사
		/*
		 * 1. for문으로 하나하나 복사
		 * 2. System.arraycopy()를 이용한 복사
		 * >> System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		 */
		String[] oldStrArray = { "Java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// newStrArray의 0번째 인덱스부터 차례대로 복사됨
		
		for (int i = 0; i < newStrArray.length; i++)
			System.out.print(newStrArray[i] + " ");
		
		System.out.println();
		
		newStrArray[2] = "deepcopy?";
		System.out.println("old: " + oldStrArray[2]);
		System.out.println("new: " + newStrArray[2]);
		// deepcopy인 듯!
	}

}
