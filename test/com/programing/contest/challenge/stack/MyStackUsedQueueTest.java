/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.stack;

import org.junit.Before;
import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MyStackUsedQueueTest {

	private static final int STACK_SIZE = 10;
	private MyStackUsedQueue s;

	@Before
	public void setUp() {
		s = new MyStackUsedQueue(STACK_SIZE);
	}

	@Test(expected = IllegalStateException.class)
	public void testError() {
		s.pop();
	}

	@Test
	public void test1() {
		for (int i = 1; i <= STACK_SIZE; i++) {
			s.push(i);
		}

		s.pop();
		s.pop();
		s.push(5);
		s.push(3);
		s.pop();
		s.pop();

		System.out.println(s.top());
		s.print(); // 1 ~ 8
	}

	@Test
	public void test2() {
		MyStackUsedQueue s2 = new MyStackUsedQueue(STACK_SIZE);
		s2.push(1);
		s2.push(2);
		s2.push(3);
		s2.pop();
		s2.print(); // 1~2
	}

	@Test
	public void test3() {
		MyStackUsedQueue s2 = new MyStackUsedQueue(STACK_SIZE);
		s2.push(1);
		s2.push(2);
		s2.push(3);
		s2.pop();
		s2.push(4);
		s2.print(); // 1~2, 4
	}
}
