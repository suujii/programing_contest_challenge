package com.programing.contest.challenge.card;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class CardTest {

	@Test
	public void test() {
		Card c = new Card();
		c.shffle(5, 10);
		c.print();
	}

	@Test
	public void test2() {
		Card c = new Card();
		c.shffle(1, 1);
		c.shffle(2, 2);
		c.shffle(3, 3);
		c.shffle(4, 4);
		c.shffle(5, 5);
		c.shffle(6, 6);
		c.shffle(7, 7);
		c.shffle(8, 8);
		c.shffle(9, 9);
		c.shffle(10, 10);
		c.print();
	}

}
