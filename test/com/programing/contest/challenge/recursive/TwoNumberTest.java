/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.recursive;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class TwoNumberTest {

	@Test
	public void test() {
		TwoNumber t = new TwoNumber();
		assertEquals("1000", t.twoNumber(8));
	}

	@Test
	public void test2() {
		TwoNumber t = new TwoNumber();
		assertEquals("101", t.twoNumber(5));
	}

	@Test
	public void test3() {
		TwoNumber t = new TwoNumber();
		assertEquals("100", t.twoNumber(4));
	}

}
