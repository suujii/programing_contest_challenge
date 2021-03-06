/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.list;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class DoubleLinkedListTest {

	@Test
	public void test() {
		DoubleLinkedList s = new DoubleLinkedList();
		s.insertFront(1);
		s.insertFront(2);
		s.insertFront(3);
		s.insertRear(4);
		s.insertMiddle(2, 5);
		s.insertMiddle(3, 6);
		s.deleteFront();
		s.deleteRear();
		s.deleteMiddle(2);
		s.deleteList();
		System.out.println(s.toString());
		System.out.println(s.listCount());
	}

}
