package com.programing.contest.challenge.count.number;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class CountNumberTest {
	@Test
	public void test0() {
		CountNumber c = new CountNumber();
		System.out.println(c.countNumber(1, 9));
	}

	@Test
	public void test1() {
		CountNumber c = new CountNumber();
		System.out.println(c.countNumber(10, 15));
	}

	@Test
	public void test2() {
		CountNumber c = new CountNumber();
		System.out.println(c.countNumber(100, 110));
	}

	@Test
	public void test3() {
		CountNumber c = new CountNumber();
		System.out.println(c.countNumber(1, 1000));
	}

}
