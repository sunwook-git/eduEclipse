package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
		//Stack �ڷᱸ�� �ǽ�
//		Stack<Integer> stack = new Stack<Integer>();
//
//		//push, pop�� �̿��Ͽ� ���� �ڷᱸ���� ���
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		
//		System.out.println("---stack---");
//		while(!stack.isEmpty()) {
//					
//			System.out.println(stack.pop());	
//		}
		
		//Queue �ڷᱸ�� �ǽ�
		//offer, poll�� �̿��Ͽ� ť �ڷᱸ���� ���
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		while(!queue.isEmpty()) {
			System.out.println("---queue---");
			//poll�� ����Ͽ� queue�ڷᱸ�� ���
			System.out.println(queue.poll());
		}
	}
}
