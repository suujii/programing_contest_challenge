package com.programing.contest.challenge.recursive;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class HanoiTest {

	@Test
	public void test() {
		Hanoi hanoi = new Hanoi(3);
		hanoi.executeHanoi();
	}

	@Test
	public void test2() {
		Hanoi hanoi = new Hanoi(4);
		hanoi.executeHanoi();
	}

}
