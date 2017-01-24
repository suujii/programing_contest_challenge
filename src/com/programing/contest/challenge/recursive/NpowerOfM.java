/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.recursive;

/**
 * @author SuJi, Lee
 *
 */
public class NpowerOfM {
	public int nPowerOfM(int n, int m) {
		int data = 1;

		if (m == 0) {
			return data;
		}
		return n * nPowerOfM(n, m - 1);
	}

}
