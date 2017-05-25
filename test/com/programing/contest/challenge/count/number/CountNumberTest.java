package com.programing.contest.challenge.count.number;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class CountNumberTest {

	@Test
	public void test() {
		CountNumber c = new CountNumber();
		System.out.println(c.countNumber(10, 15));
		System.out.println(c.countNumber(1, 1000));
	}

}
