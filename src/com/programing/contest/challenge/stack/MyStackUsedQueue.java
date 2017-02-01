/**
 * 두개의 queue를 이용해 stack을 만드세요.
 */
package com.programing.contest.challenge.stack;

import com.programing.contest.challenge.queue.MyQueue;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUsedQueue {
	private MyQueue<Integer> queue1;
	private MyQueue<Integer> queue2;

	public MyStackUsedQueue(int size) {
		this.queue1 = new MyQueue<>(size);
		this.queue2 = new MyQueue<>(size);
	}

	public void push(Integer data) {
		if (queue2.isEmpty()) {
			queue1.enqueue(data);
		} else {
			queue2.enqueue(data);
		}
	}

	public Integer pop() {
		MyQueue<Integer> enQueue = queue1;
		MyQueue<Integer> deQueue = queue2;

		if (queue1.isEmpty()) {
			enQueue = queue2;
			deQueue = queue1;
		}

		int size = enQueue.size();

		for (int i = 0; i < size - 1; i++) {
			deQueue.enqueue(enQueue.dequeue());
		}
		return enQueue.dequeue();
	}

	public Integer top() {
		MyQueue<Integer> targetQueue = queue1;
		if (queue1.isEmpty()) {
			targetQueue = queue2;
		}
		return targetQueue.getQueue().get(targetQueue.size() - 1);
	}

	public void print() {
		MyQueue<Integer> targetQueue = queue1;
		if (queue1.isEmpty()) {
			targetQueue = queue2;
		}

		int size = targetQueue.size();

		for (int i = 0; i < size; i++) {
			System.out.print(targetQueue.dequeue() + " ");
		}
		System.out.println();
	}

	public MyQueue<Integer> getEnQueue() {
		return queue1;
	}

	public void setEnQueue(MyQueue<Integer> enQueue) {
		this.queue1 = enQueue;
	}

	public MyQueue<Integer> getDeQueue() {
		return queue2;
	}

	public void setDeQueue(MyQueue<Integer> deQueue) {
		this.queue2 = deQueue;
	}
}
