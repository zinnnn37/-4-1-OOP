package array.practice02;

import java.util.Scanner;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = { "apple", "pear", "banana", "cherry", "strawberry", "graph" };
		
		int i = 1;
		for (String fruit : names) {
			System.out.print(i++ + "-" + fruit + " ");
		}
	}

}
