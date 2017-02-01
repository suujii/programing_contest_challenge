/**
 * 두 개의 stack으로 queue 만들기
 */
package com.programing.contest.challenge.queue;

import com.programing.contest.challenge.stack.MyStack;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUsedStack {
	private MyStack<Integer> pushStack;
	private MyStack<Integer> popStack;

	public MyQueueUsedStack(int size) {
		this.pushStack = new MyStack<Integer>(size);
		this.popStack = new MyStack<Integer>(size);
	}

	public void enqueue(Integer data) {
		if (popStack.isEmpty() == false) {
			int popStackSize = popStack.size();

			for (int i = 0; i < popStackSize; i++) {
				pushStack.push(popStack.pop());
			}
		}
		pushStack.push(data);
	}

	public Integer dequeue() {
		int size = pushStack.size();

		for (int i = 0; i < size; i++) {
			reverse();
		}
		return popStack.pop();
	}

	private void reverse() {
		popStack.push(pushStack.pop());
	}

	public void print() {
		int size = popStack.size();

		for (int i = 0; i < size; i++) {
			System.out.print(popStack.pop() + " ");
		}
		System.out.println();
	}
}
