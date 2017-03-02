/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.bucks;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class BucksTest {

	@Test
	public void test() {
		Bucks bucks = new Bucks(12, 4);
		assertEquals(1, bucks.printMaxTumblr());
	}

	@Test
	public void test1() {
		Bucks bucks = new Bucks(10, 14);
		assertEquals(2, bucks.printMaxTumblr());
	}

	@Test
	public void test2() {
		Bucks bucks = new Bucks(4, 20);
		assertEquals(0, bucks.printMaxTumblr());
	}

	@Test
	public void test3() {
		Bucks bucks = new Bucks(5, 111111111);
		assertEquals(1, bucks.printMaxTumblr());
	}

	@Test
	public void test4() {
		Bucks bucks = new Bucks(0, 7);
		assertEquals(0, bucks.printMaxTumblr());
	}

}
