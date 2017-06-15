/**
배열로 queue 만들기
 */
package com.programing.contest.challenge.queue;


/**
 * @author SuJi, Lee
 *
 */
public class ArrayQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int size;

	public ArrayQueue(int size) {
		this.queue = new int[size];
		this.front = 0;
		this.rear = -1;
		this.size = size;
	}

	public void enQueue(int data) {
		if (isFull()) {
			throw new IllegalArgumentException("queue is full");
		}
		queue[++rear] = data;
	}

	public int deQueue() {
		if (isEmpty()) {
			throw new IllegalArgumentException("queue is empty");
		}
		int deleteData = queue[front];
		front++;

		return deleteData;
	}

	public void print() {
		for (int i = front; i <= rear; i++) {
			System.out.println(queue[i]);
		}
	}

	private boolean isFull() {
		//		queue = Arrays.copyOf(queue, queue.length*2);
		return rear == size - 1;
	}

	private boolean isEmpty() {
		return front == rear + 1;
	}
}
