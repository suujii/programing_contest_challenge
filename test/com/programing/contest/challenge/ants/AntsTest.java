/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.ants;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class AntsTest {

	@Test
	public void test() {
		int length = 10;
		int num = 3;
		int[] point = {2, 6, 7};
		Ants ants = new Ants(length, num, point);
		ants.calcTime();
	}
}
