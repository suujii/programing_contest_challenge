/**
 * 환형 링크드 리스트 만들기
 */
package com.programing.contest.challenge.list;

/**
 * @author SuJi, Lee
 *
 */
public class CircularLinkedList {
	private Node head;

	public void insertFront(int data) {
		Node newNode = new Node(data);

		if (head == null) { // 최초삽입
			head = newNode;
		} else {
			//맨 앞 삽입
			newNode.next = head;

			Node node = head;

			while (node.next != head) {
				node = node.next;
			}

			node.next = newNode;
			head = newNode;
		}

	}

	public void insertRear(int data) {
		//맨 뒤 삽입
		Node newNode = new Node(data);
	}

	public void insertMiddle(int position, int data) {
		//중간에 삽입
		Node newNode = new Node(data);

	}

	public int deleteFront() {
		//맨 앞 삭제
		return 0;
	}

	public int deleteRear() {
		//맨 뒤 삭제
		return 0;
	}

	public int deleteMiddle(int positon) {
		//중간 삭제
		return 0;
	}

	public void deleteList() {
		//전체 삭제

	}

	public int listCount() {
		if (head == null) {
			return 0;
		}

		Node node = head;
		int cnt = 1;

		while (node.next != head) {
			cnt++;
			node = node.next;
		}
		return cnt;
	}

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = this;
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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "CircularLinkedList [head=" + head + "]";
	}
}
