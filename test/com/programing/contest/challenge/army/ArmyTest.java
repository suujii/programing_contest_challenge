/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.army;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class ArmyTest {

	@Test
	public void test() {
		int N = 6;
		int R = 10;
		int[] X = {1, 7, 15, 20, 30, 50};
		Army army = new Army(N, R, X);
		army.printMarkingCount();
	}
}
