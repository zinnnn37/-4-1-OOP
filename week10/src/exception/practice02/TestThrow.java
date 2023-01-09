package exception.practice02;

import java.io.IOException;

public class TestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(readString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오: ");
		System.in.read(buf); // 얘를 사용하려면 무조건 IOException을 다뤄줘야하나 ?
		return new String(buf);
	}
}
