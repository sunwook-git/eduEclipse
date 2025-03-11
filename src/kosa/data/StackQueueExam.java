package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
		//Stack 자료구조 실습
//		Stack<Integer> stack = new Stack<Integer>();
//
//		//push, pop을 이용하여 스택 자료구조로 출력
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		
//		System.out.println("---stack---");
//		while(!stack.isEmpty()) {
//					
//			System.out.println(stack.pop());	
//		}
		
		//Queue 자료구조 실습
		//offer, poll을 이용하여 큐 자료구조로 출력
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		while(!queue.isEmpty()) {
			System.out.println("---queue---");
			//poll을 사용하여 queue자료구조 출력
			System.out.println(queue.poll());
		}
	}
}
