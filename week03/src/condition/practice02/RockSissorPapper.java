package condition.practice02;

import java.util.Scanner;
import java.util.Random;

public class RockSissorPapper {

	final int SISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user = scanner.nextInt();
		int com = ran.nextInt(3);
		
		System.out.println("user: " + user + "\ncomputer: " + com);
		
		if (user == com)
			System.out.println("DRAW :/");
		else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1))
			System.out.println("WIN :)");
		else
			System.out.println("LOSE ;(");
		scanner.close();
	}

}
