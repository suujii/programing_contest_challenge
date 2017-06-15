package com.programing.contest.challenge.queue;

import java.util.Stack;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUsedList {
	private Node front;
	private Node rear;

	public void enQueue(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			throw new IllegalArgumentException("empty");
		}

		Node deleteNode = front;
		front = front.next;

		if (front == null) {
			rear = null;
		}

		return deleteNode.data;
	}

	private boolean isEmpty() {
		return front == null;
	}

	public void reverseQueue(MyQueueUsedList queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while (queue.isEmpty() == false) {
			stack.push(queue.deQueue());
		}

		while (stack.isEmpty() == false) {
			queue.enQueue(stack.pop());
		}
	}

	@Override
	public String toString() {
		return "MyQueueUsedList [front=" + front + ", rear=" + rear + "]";
	}

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}
}
