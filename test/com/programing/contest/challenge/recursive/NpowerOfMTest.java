/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.recursive;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class NpowerOfMTest {

	@Test
	public void test() {
		NpowerOfM m = new NpowerOfM();
		assertEquals(9, m.nPowerOfM(3, 2));
		assertEquals(64, m.nPowerOfM(4, 3));
		assertEquals(1024, m.nPowerOfM(2, 10));
		assertEquals(1, m.nPowerOfM(2, 0));
		assertEquals(2, m.nPowerOfM(2, 1));
	}

}
