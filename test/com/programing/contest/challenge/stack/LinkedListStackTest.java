package com.programing.contest.challenge.stack;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class LinkedListStackTest {

	@Test
	public void test() {
		LinkedListStack l = new LinkedListStack();
		l.push(1);
		l.push(2);
		l.push(3);
		System.out.print(l.pop());

	}

}
