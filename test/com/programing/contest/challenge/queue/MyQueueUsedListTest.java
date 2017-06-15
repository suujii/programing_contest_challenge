/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.queue;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class MyQueueUsedListTest {

	@Test
	public void test() {
		MyQueueUsedList l = new MyQueueUsedList();
		l.enQueue(1);
		l.enQueue(2);
		l.enQueue(3);
		l.enQueue(4);
		l.deQueue();
		l.enQueue(5);
		l.deQueue();
		System.out.println(l.toString());
		l.reverseQueue(l);
		System.out.println(l.toString());
	}

}
