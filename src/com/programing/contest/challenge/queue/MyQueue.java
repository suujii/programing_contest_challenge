package com.programing.contest.challenge.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueue<T> {
	private List<T> queue;
	private int size;

	public MyQueue(int size) {
		this.queue = new ArrayList<T>(size);
		this.size = size;
	}

	public void enqueue(T data) {
		if (isFull()) {
			throw new IllegalStateException("queue is full");
		}
		queue.add(data);
	}

	public boolean isFull() {
		return queue.size() == size;
	}

	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("queue is empty");
		}

		T data = queue.get(0);
		queue.remove(0);
		return data;
	}

	public boolean isEmpty() {
		return queue.size() == 0;
	}

	public int size() {
		return queue.size();
	}

	public void print() {
		for (T data : queue) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	public List<T> getQueue() {
		return queue;
	}

	public void setQueue(List<T> queue) {
		this.queue = queue;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
