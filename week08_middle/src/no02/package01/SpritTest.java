package no02.package01;

import java.util.Random;

public class SpritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		
		int num = 0;
		while (num != 3) {
			num = ran.nextInt(4);
			System.out.println("Founding Sprit를 랜덤하게 읽어 봅니다.");
			System.out.print("랜덤값=" + num + ", ");
			switch (num) {
				case 0:
					System.out.println("해당하는 Founding Sprit은 " + Sprit.Truth);
					break;
				case 1:
					System.out.println("해당하는 Founding Sprit은 " + Sprit.Peace);
					break;
				case 2:
					System.out.println("해당하는 Founding Sprit은 " + Sprit.Creation);
					break;
				case 3:
					System.out.println("해당하는 Founding Sprit를 알아보았습니다");
					break;
			}
			System.out.println();
		}
	}

}
