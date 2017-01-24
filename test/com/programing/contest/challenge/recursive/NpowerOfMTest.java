/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.recursive;

import org.junit.Test;

/**
 * @author SuJi, Lee
 *
 */
public class NpowerOfMTest {

	@Test
	public void test() {
		NpowerOfM m = new NpowerOfM();
		System.out.println(m.nPowerOfM(3, 2));
		System.out.println(m.nPowerOfM(4, 3));
		System.out.println(m.nPowerOfM(2, 10));
	}

}
