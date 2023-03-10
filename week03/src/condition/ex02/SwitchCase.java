package condition.ex02;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if문보다 코드가 간결함
		// switch와 case의 변수 타입을 맞춰주어야 함
		int num = (int)(Math.random() * 6) + 1;
		switch (num) {
			case 1:
				System.out.println("1");
				break; // 없으면 밑의 케이스도 실행됨.. 조건이 뭐든
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			default: // 1~5가 아닌 경우
				System.out.println("6");
		}
		
		System.out.println();
		
		char grade = 'B';
		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("A");
				break;
			case 'B':
			case 'b':
				System.out.println("B");
				break;
			default:
				System.out.println("pity...");
		}
	}

}
