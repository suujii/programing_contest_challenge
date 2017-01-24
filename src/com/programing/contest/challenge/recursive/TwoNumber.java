/**
 * Copyright 2017 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.programing.contest.challenge.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SuJi, Lee
 *
 */
public class TwoNumber {
	private List<Integer> list = new ArrayList<Integer>();

	public List<Integer> twoNumber(int n) {
		if (n <= 1) {
			list.add(n % 2);
			return list;
		}

		list.add(n % 2);
		return twoNumber(n / 2);
	}
}
