package array.practice03;

public class MultidimentionalArrayInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = new int[4][];
		// for 안에서 초기화 안 해주는 경우
		/*
		 * intArray[0] = new int[3];
		 * intArray[1] = new int[2];
		 * intArray[2] = new int[3];
		 * intArray[3] = new int[2];
		 */
		
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0)
				nums[i] = new int[3];
			else
				nums[i] = new int[2];
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = 10 * (i + 1) + j;
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

}
