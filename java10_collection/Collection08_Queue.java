package java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection08_Queue {
	public static void main(String[] args) {
		// Priority Queue  A 앞으로 VIP 최우선순위 하기
		
		// Queue 인터페이스이기 때문에 구현체가 없어서 링크드 리스트를 받아서 사용
		
		Queue queue = new LinkedList();
		
		queue.offer("Alice");
		queue.offer("Bob");
		queue.offer("Clare");
		queue.offer("Dave");

		System.out.println(queue);
		System.out.println("크기 : "+ queue.size());
		
		System.out.println("----------------");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("-----------------------");
		
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("크기 : " + queue.size());
		
		
	}
}









