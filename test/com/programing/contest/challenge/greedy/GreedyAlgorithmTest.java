/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.greedy;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class GreedyAlgorithmTest {
	@Test(expected = IllegalArgumentException.class)
	public void testWhenError1() {
		String input = "";
		GreedyAlgorithm g = new GreedyAlgorithm(input);
		g.printCoinCount();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWhenError2() {
		String input = "c1=3 c5=2, c10=1, c50=3, c100=0, c500=2, A=620";
		GreedyAlgorithm g = new GreedyAlgorithm(input);
		g.printCoinCount();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWhenError3() {
		String input = "c1=3, c5=2, c10=1, c50=3, c100=0, A=620";
		GreedyAlgorithm g = new GreedyAlgorithm(input);
		g.printCoinCount();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWhenError4() {
		String input = "c13, c5=2, c10=1, c50=3, c100=0, c500=2, A=620";
		GreedyAlgorithm g = new GreedyAlgorithm(input);
		g.printCoinCount();
	}

	@Test
	public void testSuccess1() {
		String input = "c1=3, c5=2, c10=1, c50=3, c100=0, c500=2, A=620";
		GreedyAlgorithm g = new GreedyAlgorithm(input);
		g.printCoinCount();
	}

	@Test
	public void testSuccess2() {
		String input = "c1=3, c5=2, c10=1, c50=3, c100=0, c500=2, A=1000";
		GreedyAlgorithm g = new GreedyAlgorithm(input);
		g.printCoinCount();
	}

	@Test
	public void testSuccess3() {
		String input = "c1=3, c5=2, c10=3, c50=3, c100=5, c500=2, A=1540";
		GreedyAlgorithm g = new GreedyAlgorithm(input);
		g.printCoinCount();
	}
}
