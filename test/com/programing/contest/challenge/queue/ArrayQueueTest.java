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
public class ArrayQueueTest {

	@Test
	public void test() {
		ArrayQueue q = new ArrayQueue(10);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.deQueue();
		q.deQueue();
		q.enQueue(5);
		q.print();
	}

}
