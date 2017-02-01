/**
 * 리스트를 이용한 stack 만들기
 */
package com.programing.contest.challenge.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class MyStack<T> {
	private List<T> stack;
	private int size;

	public MyStack(int size) {
		this.stack = new ArrayList<T>(size);
		this.size = size;
	}

	public void push(T data) {
		if (isFull()) {
			throw new IllegalStateException("stack is Full");
		}
		stack.add(data);
	}

	public boolean isFull() {
		return stack.size() == size;
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("stack is Empty");
		}

		int top = stack.size() - 1;
		T data = stack.get(top);
		stack.remove(top);
		return data;
	}

	public boolean isEmpty() {
		return stack.size() == 0;
	}

	public T top() {
		if (isEmpty()) {
			throw new IllegalStateException("stack is Empty");
		}
		return stack.get(stack.size() - 1);
	}

	public int size() {
		return stack.size();
	}

	public void print() {
		for (T data : stack) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
}
