package collectionframework.ex05;

import java.util.*;

public class LIFOandFIFO {
	
	public static void main(String[] args) {
		// LIFO == stack
		// FIFO == queue

		// Stack Class
		// Queue Interface > 사용 시 구현 필요


		// Stack
		/*
		 * LIFO 자료구조를 구현한 클래스
		 * Stack<E> stack = new Stack<E>();
		 */

		Stack<Coin> coinBox = new Stack<Coin>(); // import java.util.*;

		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("Popped coin: " + coin.getValue() + " won");
		}

		System.out.println();
		System.out.println();

		// Queue interface
		/*
		 * FIFO 자료구조에서 사용되는 메소드 정의
		 * Queue 인터페이스를 구현한 대표적인 LinkedList 클래스( 얘는 List 인터페이스를 구현했기 때문에 List 컬렉션이기도 함
		 * 
		 * Queue<E> queue = new LinkedList<E>();
		 */

		 Queue<Message> messageQueue = new LinkedList<Message>();

		 messageQueue.offer(new Message("sendMail", "hong"));
		 messageQueue.offer(new Message("sendSMS", "shin"));
		 messageQueue.offer(new Message("sendKakaoTalk", "kim"));

		 while (!messageQueue.isEmpty()) {
			 Message message = messageQueue.poll();
			 switch (message.command) {
				case "sendMail":
					System.out.println("Send Mail to " + message.to);
					break;
				case "sendSMS":
					System.out.println("Send SMS to " + message.to);
					break;
				case "sendKakaoTalk":
					System.out.println("Send KakaoTalk to " + message.to);
					break;
			 }
		 }

	}
}
