package exception.ex03;

import java.text.NumberFormat;

public class MultipleCatches {

	public static void main(String[] args) {
		
		// 다중 catch
		/*
		 * 발생하는 예외별로 예외 처리 코드를 다르게 하는 다중 catch 블록
		 * catch 블록의 예외 클래스 타입은 try 블록에서 발생된 예외의 종류를 말함
		 * try 블록에서 해당 타입 예외가 발생하면 catch 블록을 실행
		
		try {
			ArrayIndexOutOfBoundsException;
			
			NumberFormatException;
		} catch (ArrayIndexOutOfBoundsException e) {
			// exception 1
		} catch (NumberFormatException e) {
			//exception 2
		}
		*/
		
		// exception.ex02 예시 합친 것
		try {
			String d1 = args[0];
			String d2 = args[1]; // params 부족하면 1번 catch로
			int v1 = Integer.parseInt(d1); // 형변환 불가하면 2번 catch로
			int v2 = Integer.parseInt(d2);
			int res = v1 + v2;
			System.out.println(v1 + " + " + v2 + " = " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Too few params");
		} catch (NumberFormatException e) {
			System.out.println("Cannot convert String to Integer");
		} finally {
			System.out.println("Run program again");
		}
		
		// 순서
		/*
		 * 세세한 예외를 먼저 작성하고 범위가 큰 예외(가령 Exception e로 퉁치는 경우)는 나중에 적는 것이 좋음
		 * e.g.
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * } catch (Exception e) {
		 * }
		 * 
		 * Exception e를 먼저 적으면 Array~~ error도 Exception에서 잡힘
		 */
	}
}
