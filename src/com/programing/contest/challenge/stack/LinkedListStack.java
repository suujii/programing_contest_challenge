/**
 * 연결리스트를 이용한 스택
 */
package com.programing.contest.challenge.stack;

import java.util.LinkedList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class LinkedListStack {
	private List<Integer> list;
	private int top;

	public LinkedListStack() {
		this.list = new LinkedList<Integer>();
		this.top = -1;
	}

	public void push(Integer data) {
		top++;
		list.add(data);
	}

	public Integer pop() {
		Integer data = list.get(top);
		list.remove(top);
		top--;

		return data;
	}

	public Integer peek() {
		return list.get(top);
	}

}
