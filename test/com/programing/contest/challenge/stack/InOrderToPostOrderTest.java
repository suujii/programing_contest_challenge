/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.stack;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class InOrderToPostOrderTest {

	@Test
	public void test1() {
		InOrderToPostOrder i = new InOrderToPostOrder("A+B");
		assertEquals("AB+", i.getPostOrder());

	}

	@Test
	public void test2() {
		InOrderToPostOrder i = new InOrderToPostOrder("A+B-C");
		assertEquals("AB+C-", i.getPostOrder());
	}

	@Test
	public void test3() {
		InOrderToPostOrder i = new InOrderToPostOrder("(A+B)*C-D");
		assertEquals("AB+C*D-", i.getPostOrder());
	}

}
