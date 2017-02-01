/**
 * 정렬 링크드 리스트 만들기
 */
package com.programing.contest.challenge.list;

/**
 * @author SuJi, Lee
 *
 */
public class SortedLinkedList {
	private Node head;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) { // 최초삽입
			head = newNode;
		} else {
			if (head.data >= newNode.data) { // 1. 제일 앞에 삽입 되는 경우 (들어온 값이 가장 작은경우)
				newNode.next = head;
				head = newNode;
			} else {
				Node node = head;
				boolean insertYn = false;

				while (node.next != null) {
					if (node.data < newNode.data && newNode.data <= node.next.data) { // 2. 중간삽입
						newNode.next = node.next;
						node.next = newNode;
						insertYn = true;
					}

					node = node.next;
				}

				if (insertYn == false) { // 3. 제일마지막에 삽입(현재 들어온 값이 가장 큼)
					node.next = newNode;
				}
			}
		}
	}

	public int delete() { // 기본은 앞에서 부터 삭제
		return deleteFront();
	}

	public int deleteFront() {
		//맨 앞 삭제
		Node deleteNode = head;
		head = head.next;

		int data = deleteNode.data;
		deleteNode = null;

		return data;
	}

	public int deleteRear() {
		//맨 뒤 삭제
		Node node = head;
		Node preNode = head;

		while (node.next != null) {
			preNode = node; // 이전 노드
			node = node.next; // 삭제 대상 노드
		}

		preNode.next = null;
		int data = node.data;
		node = null;

		return data;
	}

	public int deleteMiddle(int index) {
		//중간 삭제
		Node preNode = head;

		int cnt = 0;

		while (cnt != index - 1) {
			cnt++;
			preNode = preNode.next;
		}

		Node node = preNode.next;
		preNode.next = node.next;
		int data = node.data;
		node.next = null;
		node = null;

		return data;
	}

	public void deleteList() {
		//전체 삭제
		while (head != null) {
			deleteFront();
		}
		head = null;
	}

	public int listCount() {
		if (head == null) {
			return 0;
		}

		Node node = head;
		int cnt = 1;

		while (node.next != null) {
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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "SortedLinkedList [head=" + head + "]";
	}
}
