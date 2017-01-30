/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.recursive;

/**
 * @author SuJi, Lee
 *
 */
public class TwoNumber {
	private StringBuffer sb = new StringBuffer();

	public String twoNumber(int n) {
		sb.append(n % 2);

		if (n == 1) {
			return sb.reverse().toString();
		}

		return twoNumber(n / 2);
	}
}
