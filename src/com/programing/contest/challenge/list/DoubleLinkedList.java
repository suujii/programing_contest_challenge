/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.list;

/**
 * @author SuJi, Lee
 *
 */
public class DoubleLinkedList {
	private Node head;

	public void insertFront(int data) {
		Node newNode = new Node(data);

		if (head == null) { //최초삽입
			head = newNode;
		} else { // 맨 앞 삽입
			newNode.next = head;
			head.pre = newNode;
			head = newNode;
		}
	}

	public void insertRear(int data) {
		//맨 뒤 삽입
		Node newNode = new Node(data);

		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		newNode.pre = node;
		node.next = newNode;
	}

	public void insertMiddle(int position, int data) {
		//중간에 삽입
		Node newNode = new Node(data);

		Node preNode = head;
		int cnt = 1;

		while (cnt != position - 1) {
			cnt++;
			preNode = preNode.next;
		}

		newNode.next = preNode.next;
		newNode.pre = preNode;
		preNode.next.pre = newNode;
		preNode.next = newNode;
	}

	public int deleteFront() {
		//맨 앞 삭제
		Node deleteNode = head;
		head = head.next;

		if (head != null) {
			head.pre = null;
		}

		int data = deleteNode.data;
		deleteNode = null;

		return data;
	}

	public int deleteRear() {
		//맨 뒤 삭제
		Node deleteNode = head;

		while (deleteNode.next != null) {
			deleteNode = deleteNode.next;
		}
		deleteNode.pre.next = null;
		int data = deleteNode.data;
		deleteNode = null;

		return data;
	}

	public int deleteMiddle(int positon) {
		//중간 삭제
		Node preNode = head;

		int cnt = 1;
		while (cnt != positon - 1) {
			cnt++;
			preNode = preNode.next;
		}

		Node deleteNode = preNode.next;
		preNode.next = deleteNode.next;
		deleteNode.next.pre = preNode;

		int data = deleteNode.data;
		deleteNode.next = null;
		deleteNode.pre = null;
		deleteNode = null;

		return data;
	}

	public void deleteList() {
		//전체 삭제
		while (head != null) {
			deleteFront();
		}
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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "DoubleLinkedList [head=" + head + "]";
	}

	public class Node {
		int data;
		Node next;
		Node pre;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.pre = null;
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

		public Node getPre() {
			return pre;
		}

		public void setPre(Node pre) {
			this.pre = pre;
		}

		@Override
		public String toString() {
			//			return "Node [data=" + data + ", next=" + next + ", pre=" + pre + "]";
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}
}
