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
public class SortedLinkedListTest {

	@Test
	public void test() {
		SortedLinkedList s = new SortedLinkedList();
		s.insert(2); //최초 삽입
		s.insert(1); // 제일 앞 삽입
		s.insert(1); // 제일 앞 삽입
		s.insert(2); // 제일 끝 삽입
		s.insert(4); // 끝 삽입
		s.insert(3); // 중간 삽입
		s.insert(3); // 중간 삽입
		s.insert(4); // 끝 삽입
		s.delete();
		s.deleteFront();
		s.deleteRear();
		s.deleteMiddle(2);
		s.deleteMiddle(3);
		s.deleteList();
		System.out.println(s.toString());
		System.out.println(s.listCount());
	}

}
