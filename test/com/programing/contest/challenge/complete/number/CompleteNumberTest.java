package com.programing.contest.challenge.complete.number;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class CompleteNumberTest {

	@Test
	public void test() {
		CompleteNumber c = new CompleteNumber();
		c.printComplete(30);
	}

	@Test
	public void test2() {
		CompleteNumber c = new CompleteNumber();
		c.printComplete(10000);
	}

}
