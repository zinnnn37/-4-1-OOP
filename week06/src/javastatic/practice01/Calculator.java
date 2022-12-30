package javastatic.practice01;

public class Calculator {
	
	static int abs(int x) {
		return (x > 0) ? x : -x;
	}
	
	static int max(int x, int y) {
		return (x > y) ? x : y;
	}
	
	static int min(int x, int y) {
		return (x < y) ? x : y;
	}
}
