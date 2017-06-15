package com.programing.contest.challenge.stack;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class LinkedListStack2Test {

	@Test
	public void test() {
		LinkedListStack2 s = new LinkedListStack2();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		s.findNode(2);
		System.out.print(s.toString());
	}
}
