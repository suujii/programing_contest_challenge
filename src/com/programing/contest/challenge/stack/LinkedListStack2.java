/**
 * 연결리스트로 스택만들기
*/
package com.programing.contest.challenge.stack;

/**
 * @author SuJi, Lee
 *
 */
public class LinkedListStack2 {
	private Node top;
	private int size;

	public LinkedListStack2() {
		this.top = null;
		this.size = 0;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		size++;
	}

	public boolean isEmpty() {
		return this.top == null;
	}

	public Node peek() {
		return top;
	}

	public Node pop() {
		if (isEmpty()) {
			throw new IllegalArgumentException("error");
		}

		Node data = peek();
		top = top.next;
		size--;
		return data;
	}

	public Node findNode(int n) {
		if (size < n) {
			throw new IllegalArgumentException("error");
		}

		Node node = top;
		int cnt = 0;
		while (cnt != n - 1) {
			node = node.next;
			cnt++;
		}
		return node;
	}

	@Override
	public String toString() {
		return "LinkedListStack2 [top=" + top + "]";
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
