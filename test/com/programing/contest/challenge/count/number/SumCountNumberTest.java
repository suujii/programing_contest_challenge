package com.programing.contest.challenge.count.number;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class SumCountNumberTest {
	@Test
	public void test0() {
		SumCountNumber s = new SumCountNumber();
		s.sumCountNumber(1, 9);
	}

	@Test
	public void test1() {
		SumCountNumber s = new SumCountNumber();
		s.sumCountNumber(10, 15);
	}

	@Test
	public void test2() {
		SumCountNumber s = new SumCountNumber();
		s.sumCountNumber(100, 110);
	}

	@Test
	public void test3() {
		SumCountNumber s = new SumCountNumber();
		s.sumCountNumber(1, 1000);
	}

	@Test
	public void test4() {
		SumCountNumber s = new SumCountNumber();
		s.sumCountNumber(10, 1001);
	}

}
